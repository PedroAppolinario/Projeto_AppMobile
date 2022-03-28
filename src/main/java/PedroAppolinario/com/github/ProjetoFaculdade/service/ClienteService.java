package PedroAppolinario.com.github.ProjetoFaculdade.service;

import PedroAppolinario.com.github.ProjetoFaculdade.domains.entity.Cliente;
import PedroAppolinario.com.github.ProjetoFaculdade.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {


    @Autowired
    ClienteRepository clienteRepository;


    public Cliente inserirCliente(Cliente cliente){
        cliente.setId(null);
        Cliente clienteSalvo = clienteRepository.save(cliente);
        return clienteSalvo;
    }


}