package iara.bot.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

public class IaraFileReader {
    
    @Autowired
    private String FILE_PATH;

    @Autowired
    public IaraFileReader(String FILE_PATH){
        this.FILE_PATH = FILE_PATH;
    }

    public void readerIara(){
        try{
        File file = new File(FILE_PATH);
        Scanner reader = new Scanner(file);
        while(reader.hasNextLine()){
            String linha = reader.nextLine();
        }
        reader.close();   
        }catch(FileNotFoundException e){
            System.out.println("Um erro ocorreu.");
            e.printStackTrace();
        }
    }
    
  

}