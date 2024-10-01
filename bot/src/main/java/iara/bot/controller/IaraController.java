package iara.bot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IaraController{

    @PostMapping("/")
    public void enviarMensagem(String mensagem){
        
    }

}
