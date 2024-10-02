package iara.bot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import iara.bot.util.IaraFileReader;

@Configuration
public class AppConfig {
    @Bean
    public IaraFileReader iaraFileReader(){
        return new IaraFileReader("mensagens-chatbot/mensagens.txt");
    }
}
