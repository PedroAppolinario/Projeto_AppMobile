package PedroAppolinario.com.github.ProjetoFaculdade.domains.entity;
import PedroAppolinario.com.github.ProjetoFaculdade.domains.enums.StatusServico;
import PedroAppolinario.com.github.ProjetoFaculdade.repository.ClienteRepository;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Optional;

@Data
@Entity
@NoArgsConstructor
@Table(name = "servico")
public class Servico implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "programador_id")
    private Prestador prestador;

    @Column(name = "titulo_servico")
    private String tituloServico;

    @Column(name = "descricao_servico")
    private String descricaoServico;

    @Column(name = "data_servico")
    @JsonIgnore
    private LocalDateTime dataServico;

    @Column(name = "orcamento_servico", precision = 20, scale = 2)
    private Double orcamentoServico;

    @Column(name = "status_servico")
    private StatusServico statusServico;

    @Column(name = "anotacao")
    private String anotacao;



    public Servico(Integer id, Cliente cliente, Prestador prestador, String tituloServico, String descricaoServico, LocalDateTime dataServico, Double orcamentoServico, StatusServico statusServico) {
        this.id = id;
        this.cliente = cliente;
        this.prestador = prestador;
        this.tituloServico = tituloServico;
        this.descricaoServico = descricaoServico;
        this.dataServico = dataServico;
        this.orcamentoServico = orcamentoServico;
        this.statusServico = statusServico;
    }

    public Servico(Integer id, Cliente cliente, String tituloServico, String descricaoServico, LocalDateTime dataServico, Double orcamentoServico, StatusServico statusServico) {
        this.id = id;
        this.cliente = cliente;
        this.tituloServico = tituloServico;
        this.descricaoServico = descricaoServico;
        this.dataServico = dataServico;
        this.orcamentoServico = orcamentoServico;
        this.statusServico = statusServico;
    }


    public Servico(Cliente cliente, String tituloServico, String descricaoServico, LocalDateTime now, Double orcamentoServico, StatusServico statusServico) {
        this.cliente = cliente;
        this.tituloServico = tituloServico;
        this.descricaoServico = descricaoServico;
        this.dataServico = dataServico;
        this.orcamentoServico = orcamentoServico;
        this.statusServico = statusServico;
    }


}