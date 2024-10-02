package iara.bot.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class IaraFileReader {
    
    @Autowired
    private String FILE_PATH;

    @Autowired
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

    @Bean
     public IaraFileReader iaraFileReader() {
         // instantiate and configure MyBean obj
         return new IaraFileReader(FILE_PATH);
     }
    
  

}