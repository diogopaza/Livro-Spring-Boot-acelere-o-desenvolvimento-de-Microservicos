package com.fastfood.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fastfood.model.Cliente;
import com.fastfood.model.Item;
import com.fastfood.model.Pedido;

public class RepositoryTest {    
      
    ClienteRepository clienteRepository;
    List<Item> item = new ArrayList<Item>();

    private static final long ID_CLIENTE_FERNANDO = 11l;
    private static final long ID_CLIENTE_ZE_PEQUENO = 22l;
    private static final long ID_ITEM1 = 100l;
    private static final long ID_ITEM2 = 101l;
    private static final long ID_ITEM3 = 102l;
    private static final long ID_PEDIDO1 = 1000l;
    private static final long ID_PEDIDO2 = 1001l;
    private static final long ID_PEDIDO3 = 1002l;

    public RepositoryTest() {       
        Cliente fernando = new Cliente();
        Cliente zePequeno = new Cliente();
        Item item_1 = new Item();
        Item item_2 = new Item();
        Item item_3 = new Item();
        Pedido pedido1 = new Pedido();
        Pedido pedido2 = new Pedido();
        Pedido pedido3 = new Pedido();
        Pedido pedido4 = new Pedido();
        fernando.setId(ID_CLIENTE_FERNANDO);
        fernando.setNome("Fernando de Lima");
        fernando.setEndereco("Rua XXXX YYYYY");
        zePequeno.setId(ID_CLIENTE_ZE_PEQUENO);
        zePequeno.setNome("Ze Pequeno de Abreu");
        zePequeno.setEndereco("Rua ZZZZ AAAA");
        item_1.setId(ID_ITEM1);
        item_1.setNome("Coca-cola");
        item_1.setPreco(10.00);
        item_2.setId(ID_ITEM2);
        item_2.setNome("Cachorro-quente");
        item_2.setPreco(20.00);
        item_3.setId(ID_ITEM3);
        item_3.setNome("Doritos");
        item_3.setPreco(12.00);        
        pedido1.setId(ID_PEDIDO1);
        pedido1.setCliente(fernando);
        pedido1.setData(new Date());
        item.add(item_1);
        item.add(item_2);
        pedido1.setItens(item);
        item.clear();      
        pedido2.setId(ID_PEDIDO1);
        pedido2.setCliente(zePequeno);
        pedido2.setData(new Date());
        item.add(item_3);
        item.add(item_3);
        pedido2.setItens(item);        
    }
    public void saveItem(Pedido p){
        item.clear();
        
        p.setItens(null);
    }
}
