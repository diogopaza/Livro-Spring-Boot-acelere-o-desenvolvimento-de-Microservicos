package com.fastfood.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fastfood.model.Cliente;
import com.fastfood.model.Item;
import com.fastfood.model.Pedido;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Service
@AllArgsConstructor
public class RepositoryTest {

    ClienteRepository clienteRepository;
    PedidoRepository pedidoRepository;
    ItemRepository itemRepository;

    private static final long ID_CLIENTE_FERNANDO = 11l;
    private static final long ID_CLIENTE_ZE_PEQUENO = 22l;
    private static final long ID_ITEM1 = 10l;
    private static final long ID_ITEM2 = 101l;
    private static final long ID_ITEM3 = 102l;
    private static final long ID_PEDIDO1 = 1000l;
    private static final long ID_PEDIDO2 = 1001l;
    private static final long ID_PEDIDO3 = 1002l;

    public String salvar() {
        // criando clientes
        Cliente fernando = new Cliente();
        fernando.setId(35L);
        fernando.setNome("Fernando de Lima");
        fernando.setEndereco("Rua XXXX YYYYY");
        clienteRepository.save(fernando);

        // criando itens
        Item item_1 = new Item(ID_ITEM1, "Coca-cola", 10.0);
        Item item_2 = new Item(ID_ITEM2, "Cachorro-quente", 20.0);
        Item item_3 = new Item(ID_ITEM3, "Doritos", 12.0);

        itemRepository.save(item_1);
        itemRepository.save(item_2);
        itemRepository.save(item_3);

        List<Item> listaPedido1 = new ArrayList<Item>();
        listaPedido1.add(item_1);
        listaPedido1.add(item_2);

        Double valorTotal = 0.0;
        for (Item item : listaPedido1) {
            valorTotal += item.getPreco();
        }

        // criando pedidos
        Pedido pedido1 = new Pedido(ID_PEDIDO1, fernando, listaPedido1, new Date(),
                valorTotal);
        pedidoRepository.save(pedido1);
        return "Sucesso";
    }
}
