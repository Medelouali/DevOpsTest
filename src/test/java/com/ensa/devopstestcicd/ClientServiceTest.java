package com.ensa.devopstestcicd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClientServiceTest {
    private ClientService clientService;

    @BeforeEach
    public void setUp() {
        clientService = new ClientService();
    }

    @Test
    public void testGetClientsReturnsList() {
        List<Client> clients = clientService.getClients();
        assertNotNull(clients);
        assertTrue(!clients.isEmpty());
    }

    @Test
    public void testClientDetailsArePopulated() {
        List<Client> clients = clientService.getClients();
        for (Client client : clients) {
            assertNotNull(client.getId());
            assertNotNull(client.getFirstName());
            assertNotNull(client.getLastName());
            assertNotNull(client.getEmail());
        }
    }

}