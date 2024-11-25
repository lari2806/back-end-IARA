package iara.bot.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class IaraDistance {
 
    public static void main(String[] args) {
        try {
            // Conecte-se à API de localização baseada em IP
            URL url = new URL("http://ip-api.com/json/");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            // Ler a resposta
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = in.readLine()) != null) {
                response.append(line);
            }
            in.close();

            // Exibir o resultado
            System.out.println("Resposta da API:");
            System.out.println(response.toString());
        } catch (Exception e) {
            System.out.println("Erro ao obter localização: " + e.getMessage());
        }
    }
}
    