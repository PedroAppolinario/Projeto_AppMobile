package PedroAppolinario.com.github.ProjetoFaculdade.repository;

import PedroAppolinario.com.github.ProjetoFaculdade.domains.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    @Transactional(readOnly = true)
    Cliente findByEmail(String email);


}