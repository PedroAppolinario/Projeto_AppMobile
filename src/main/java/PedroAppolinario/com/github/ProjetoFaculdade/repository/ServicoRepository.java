package PedroAppolinario.com.github.ProjetoFaculdade.repository;

import PedroAppolinario.com.github.ProjetoFaculdade.domains.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Integer> {

}