package iara.bot.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class IaraFileReader {
    
    @Value("bot/src/main/java/iara/bot/mensagens-chatbot/mensagens.txt")
    public String FILE_PATH;

    public String leitorIara(String entradaUsuario){
        entradaUsuario = RemoverAcentos.remover(entradaUsuario.toLowerCase());

        File file = new File(FILE_PATH);
        System.out.println("Caminho do arquivo " + FILE_PATH);

        try(Scanner reader = new Scanner(file);){

        while(reader.hasNextLine()){
            String linha = reader.nextLine();
            String linhaSemAcento = RemoverAcentos.remover(linha);

            if (linhaSemAcento.startsWith("user:") && linhaSemAcento.toLowerCase().contains(entradaUsuario)) {
                if (reader.hasNextLine()) {
                    String resposta = reader.nextLine();
                    String respostaSemAcento = RemoverAcentos.remover(resposta);
                    return respostaSemAcento;
                }
            }
        }   
        reader.close(); 
        }catch(FileNotFoundException e){    
            System.out.println("Um erro ocorreu.");
            e.printStackTrace();
            
        }
        return "Desculpe não consegui entender o que você quis dizer, tente novamente.";
    }
}