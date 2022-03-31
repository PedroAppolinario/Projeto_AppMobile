package PedroAppolinario.com.github.ProjetoFaculdade.service;

import PedroAppolinario.com.github.ProjetoFaculdade.domains.entity.Cliente;
import PedroAppolinario.com.github.ProjetoFaculdade.exception.ObjectNotFoundException;
import PedroAppolinario.com.github.ProjetoFaculdade.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {


    @Autowired
    ClienteRepository clienteRepository;

    @Transactional
    public Cliente inserirCliente(Cliente cliente) {
        cliente.setId(null);
        Cliente clienteSalvo = clienteRepository.save(cliente);
        return clienteSalvo;
    }

    public Cliente updateCliente(Cliente cliente){
        Cliente clienteToUpdate = findCliente(cliente.getId());
        UpdateData(clienteToUpdate, cliente);
        return clienteRepository.save(clienteToUpdate));
    }

    public void  deletaCliente(Integer id){
        findCliente(id);
        try{
            clienteRepository.deleteById(id);
        }   catch (DataIntegrityViolationException e){
            throw new ObjectNotFoundException("Cliente não Existe para ser Deletado");
        }

    }

    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }


    public Cliente findCliente(Integer id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id:" + id + ",tipo: "
        + Cliente.class.getName()));

    }

    public void UpdateData(Cliente clienteToUpadate, Cliente cliente) {
        clienteToUpadate.setNome(cliente.getNome());
        clienteToUpadate.setEmail(cliente.getEmail());
        clienteToUpadate.setTelefone(cliente.getTelefone());
    }

}
