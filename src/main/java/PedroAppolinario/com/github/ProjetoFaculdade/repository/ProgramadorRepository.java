package PedroAppolinario.com.github.ProjetoFaculdade.repository;
import PedroAppolinario.com.github.ProjetoFaculdade.domains.entity.Programer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ProgramadorRepository extends JpaRepository<Programer, Integer> {

    @Transactional(readOnly = true)
    Programer findByEmail(String email);
}