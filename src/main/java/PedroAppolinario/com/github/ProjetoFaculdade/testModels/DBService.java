//package PedroAppolinario.com.github.ProjetoFaculdade.testModels;
//
//import PedroAppolinario.com.github.ProjetoFaculdade.domains.entity.Cliente;
//import PedroAppolinario.com.github.ProjetoFaculdade.domains.entity.Prestador;
//import PedroAppolinario.com.github.ProjetoFaculdade.domains.entity.Servico;
//import PedroAppolinario.com.github.ProjetoFaculdade.domains.enums.StatusServico;
//import PedroAppolinario.com.github.ProjetoFaculdade.repository.ClienteRepository;
//import PedroAppolinario.com.github.ProjetoFaculdade.repository.PrestadorRepository;
//import PedroAppolinario.com.github.ProjetoFaculdade.repository.ServicoRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.text.ParseException;
//import java.time.LocalDateTime;
//import java.util.Arrays;
//
//@Service
//public class DBService {
//
//    @Autowired
//    private ClienteRepository clienteRepository;
//
//    @Autowired
//    private PrestadorRepository prestadorRepository;
//
//    @Autowired
//    private ServicoRepository servicoRepository;
//
//
//    public void instantiateTestDatabase() throws ParseException {
//
//        Cliente cli1 = new Cliente(null, "Pedro Solicitante", "17124524792", "pedrotest@gmail.com", "21987654321", "111111");
//        Cliente cli2 = new Cliente(null, "Gusta Solicitante", "93799290729", "gustavoteste@gmail.com", "21994578135", "222222");
//        Cliente cli3 = new Cliente(null, "Thiago Solicitante", "49044059785", "thiagoteste@gmail.com", "21976482165", "333333");
//
//        Prestador prest1 = new Prestador(null, "Prestador Lucas", "58048708744", "lucasProEmail@gmail.com", "41984675212", "444444");
//        Prestador prest2 = new Prestador(null, "Prestador Sarah", "03973167710", "sarahProEmail@gmail.com", "41986213457", "888888");
//        Prestador prest3 = new Prestador(null, "Prestador João", "28670727781", "joaoProEmail@gmail.com", "41964875216", "777777");
//
//        Servico serv1 = new Servico(null, cli1, prest1, "Criação de um APP", "App de Escola com Notas",
//                LocalDateTime.now(), 15000.00, StatusServico.ABERTO);
//
//        Servico serv2 = new Servico(null, cli2, prest2, "Manutenção de Site", "Site de Banco",
//                LocalDateTime.now(), 2500.00, StatusServico.ABERTO);
//
//        Servico serv3 = new Servico(null, cli3, prest3, "Gerenciar de Desktop", "Sistema de Cartórios",
//                LocalDateTime.now(), 3000.00, StatusServico.ABERTO);
//
//        Servico serv4 = new Servico(null, cli2, prest2, "Criação de Site", "Criar site de e-commerc",
//                LocalDateTime.now(), 10000.00, StatusServico.ABERTO);
//
//        Servico serv5 = new Servico(null, cli3, prest1, "Criação de App", "Criar um App de Alimentação",
//                LocalDateTime.now(), 25000.00, StatusServico.ABERTO);
//
//        clienteRepository.saveAll(Arrays.asList(cli1, cli2, cli3));
//        prestadorRepository.saveAll(Arrays.asList(prest1, prest2, prest3));
//        servicoRepository.saveAll(Arrays.asList(serv1, serv2, serv3, serv4, serv5));
//
//    }
//
//}
