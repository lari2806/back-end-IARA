package iara.bot.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class IaraFileReader {
    
    @Value("mensagens.txt")
    private String FILE_PATH;

    public IaraFileReader(String FILE_PATH){
        this.FILE_PATH = FILE_PATH;
    }

    public String readerIara(){
        try{
        File file = new File(FILE_PATH);
        Scanner reader = new Scanner(file);
        while(reader.hasNextLine()){
            String linha = reader.nextLine();
            return linha;
        }
        reader.close();   
        }catch(FileNotFoundException e){
            System.out.println("Um erro ocorreu.");
            e.printStackTrace();
            
        }
        return "tudo correto";
    }
  
}