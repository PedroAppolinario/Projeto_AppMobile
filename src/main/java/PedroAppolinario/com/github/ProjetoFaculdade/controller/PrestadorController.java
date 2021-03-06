package PedroAppolinario.com.github.ProjetoFaculdade.controller;

import PedroAppolinario.com.github.ProjetoFaculdade.domains.entity.Prestador;
import PedroAppolinario.com.github.ProjetoFaculdade.dto.PrestadorDto;
import PedroAppolinario.com.github.ProjetoFaculdade.repository.PrestadorRepository;
import PedroAppolinario.com.github.ProjetoFaculdade.service.PrestadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/prestadores")
public class PrestadorController {

    private static final String PRESTADOR_NAO_ENCONTRADO = "Prestador Não Foi Localizado";

    @Autowired
    private PrestadorRepository prestadorRepository;

    @Autowired
    private PrestadorService prestadorService;


    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> inserirPrestador(@RequestBody @Valid Prestador prestador) {
        prestadorService.inserirPrestador(prestador);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(prestador.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Void> updatePrestador(@PathVariable Integer id, @Valid @RequestBody PrestadorDto  prestadorDto) {
        Prestador prestador = prestadorService.fromDto(prestadorDto);
        prestador.setId(id);
        prestadorService.updatePrestador(prestador);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deletePrestador(@PathVariable Integer id) {
        prestadorService.deletePrestador(id);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Prestador> findPrestador(@PathVariable Integer id) {
        Prestador prestador = prestadorService.findPrestador(id);
        return ResponseEntity.ok().body(prestador);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.FOUND)
    public List<Prestador> findAll() {
        return prestadorService.findAll();
    }


}