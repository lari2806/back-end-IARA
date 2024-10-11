package iara.bot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iara.bot.model.MensagemModel;
import iara.bot.util.IaraFileReader;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("mensagens")
@CrossOrigin(origins = "http://127.0.0.1:5500/bot/src/main/java/iara/bot/view/index.html")
public class IaraController{

    @Autowired
    private IaraFileReader iaraFileReader;

    @CrossOrigin(origins = "http://127.0.0.1:5500/bot/src/main/java/iara/bot/view/index.html")
    @PostMapping("/")
    public String enviarMensagem(@RequestBody MensagemModel mensagemModel){
        String mensagem = mensagemModel.getMensagem().toLowerCase();
        System.out.println(mensagem);
        String resposta = iaraFileReader.leitorIara(mensagem);
        return resposta;
    }

}
