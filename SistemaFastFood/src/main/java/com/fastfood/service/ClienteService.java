package com.fastfood.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fastfood.model.Cliente;
import com.fastfood.repository.ClienteRepository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Service
@Getter
@Setter
@AllArgsConstructor

public class ClienteService {

    ClienteRepository clienteRepository;    

    public ResponseEntity<?> allClientes(){
        try{
            List<Cliente> clientes =  clienteRepository.findAll();
            return ResponseEntity.ok().body(clientes);
        }catch(Exception ex){
            return ResponseEntity.badRequest().body(ex.getMessage());
        }        
    }    
}
