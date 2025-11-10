package br.com.alura;

import br.com.alura.client.ClientHttpConfig;
import br.com.alura.service.AbrigoService;

import java.io.IOException;

public class CadastrarAbrigoCommand implements Command {

    @Override
    public void execute() {
        try {
            ClientHttpConfig client = new ClientHttpConfig();
            AbrigoService abrigoService = new AbrigoService(client);

            abrigoService.cadastrarAbrigo();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}