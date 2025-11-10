package br.com.alura;

import br.com.alura.client.ClientHttpConfig;
import br.com.alura.service.PetService;

import java.io.IOException;

public class ListarPetsDoAbrigoCommand implements Command {

    @Override
    public void execute() {
        try {
            ClientHttpConfig client = new ClientHttpConfig();
            PetService petService = new PetService(client);

            petService.listarPetsDoAbrigo();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}