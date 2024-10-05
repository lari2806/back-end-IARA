package iara.bot.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class IaraFileReader {
    
    @Value("bot\\src\\main\\java\\iara\\bot\\mensagens-chatbot\\mensagens.txt")
    private String FILE_PATH;
    

    public String leitorIara(String mensagem){
        File file = new File(FILE_PATH);

        System.out.println("Caminho do arquivo " + FILE_PATH);

        try(Scanner reader = new Scanner(file);){
        
        while(reader.hasNextLine()){
            String linha = reader.nextLine();

            if (linha.startsWith("user:") && linha.contains(mensagem)) {
                return linha;
            }
        }   
        reader.close(); 
        }catch(FileNotFoundException e){
            System.out.println("Um erro ocorreu.");
            e.printStackTrace();
            
        }
        return "entrada invalida";
    }
}