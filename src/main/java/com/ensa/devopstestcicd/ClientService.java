package com.ensa.devopstestcicd;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ClientService {

    public List<Client> getClients(){
        return List.of(
                new Client(UUID.randomUUID().toString(), "Med", "El1", "facke@gmail.com"),
                new Client(UUID.randomUUID().toString(), "James", "El2", "late@gmail.com"),
                new Client(UUID.randomUUID().toString(), "Toto", "El3", "toto@gmail.com"),
                new Client(UUID.randomUUID().toString(), "Lala", "El23", "lolo@gmail.com")
        );
    }
}
