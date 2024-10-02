package iara.bot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iara.bot.util.IaraFileReader;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("mensagens")
public class IaraController{

    @Autowired
    private IaraFileReader iaraFileReader;

    @PostMapping("/")
    public String enviarMensagem(@RequestBody String mensagem){
        String resposta = iaraFileReader.leitorIara(mensagem);
        return resposta;
    }

}
