package PedroAppolinario.com.github.ProjetoFaculdade.repository;

import PedroAppolinario.com.github.ProjetoFaculdade.domains.entity.Prestador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface PrestadorRepository extends JpaRepository<Prestador, Integer> {


    @Transactional(readOnly = true)
    Prestador findByEmail(String email);

}