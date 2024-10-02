package iara.bot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iara.bot.util.IaraFileReader;

@RestController
@RequestMapping("mensagens ")
public class IaraController{

    @Autowired
    IaraFileReader IaraFileReader;

    @PostMapping("/")
    public void enviarMensagem(String mensagem){
        System.out.println("Bom dia");
    }

}
