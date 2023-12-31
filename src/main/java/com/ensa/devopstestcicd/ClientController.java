package com.ensa.devopstestcicd;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/v1/clients")
@AllArgsConstructor
public class ClientController {
    private final ClientService clientService;
    //Hello CI/CD
    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<Client> getClient(){
        return this.clientService.getClients();
    };

}