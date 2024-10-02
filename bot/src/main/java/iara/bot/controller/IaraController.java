package iara.bot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mensagens ")
public class IaraController{

    @PostMapping("/")
    public void enviarMensagem(String mensagem){
        System.out.println("Bom dia");     
    }

}
