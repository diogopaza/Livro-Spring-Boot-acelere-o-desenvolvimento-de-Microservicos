package com.fastfood.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@RestController
@CrossOrigin("*")
@RequestMapping("/pedido")
@Getter
@Setter
@AllArgsConstructor
public class PedidoController {

    @GetMapping
    public String createPedido(){
        return "createPedido";
    }    
}
