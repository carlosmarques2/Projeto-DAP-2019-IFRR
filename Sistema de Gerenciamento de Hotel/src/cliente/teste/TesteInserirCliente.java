/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.teste;

import cliente.bean.ClienteBean;
import cliente.dao.ClienteDao;
import java.util.Calendar;

/**
 *
 * @author carlos
 */
public class TesteInserirCliente {
    public static void main(String[] args) {
        ClienteBean cliente = new ClienteBean();
        cliente.setNome("Fulano");
        cliente.setCpf("234.678.123-99");
        cliente.setDataDeNascimento(Calendar.getInstance());
        cliente.setDataDeCadastro(Calendar.getInstance());
        cliente.setEmail("fulano@mail.com");
        cliente.setTelefone("472839452");
        cliente.setEndereco("Rua T Num 423 Bairro Mile");
        cliente.setGasto(230f);
        
        ClienteDao clienteDao = new ClienteDao();
        clienteDao.inserir(cliente);
        System.out.println(cliente);
    }
}
