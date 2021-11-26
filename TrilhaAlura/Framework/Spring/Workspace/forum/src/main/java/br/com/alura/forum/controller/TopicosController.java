package br.com.alura.forum.controller;

import br.com.alura.forum.controller.DTO.TopicoDTO;
import br.com.alura.forum.controller.DTO.DetalhesTopicoDTO;
import br.com.alura.forum.controller.form.AtualizacaoTopicoForm;
import br.com.alura.forum.modelo.form.TopicoForm;
import br.com.alura.forum.repository.CursoRepository;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicosController {

    @Autowired
    private TopicoRepository topicoRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping
    public List<TopicoDTO> listaTopicos(String nomeCurso) {

        if(nomeCurso == null) {
            List<Topico> topicos = topicoRepository.findAll();
            return TopicoDTO.conversor(topicos);
        }
        else {
            List<Topico> topicos = topicoRepository.findByCurso_Nome(nomeCurso);
            return TopicoDTO.conversor(topicos);
        }

    }

    @PostMapping
    public ResponseEntity<TopicoDTO> cadastrar(@RequestBody @Valid TopicoForm form, UriComponentsBuilder uriBuilder) {


        Topico topico = form.conversor(cursoRepository);
        topicoRepository.save(topico);

        URI uri = uriBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
        return ResponseEntity.created(uri).body(new TopicoDTO(topico));

    }


    @GetMapping("/{id}")
    public DetalhesTopicoDTO detalhar(@PathVariable Long id) {

        Topico topico = topicoRepository.getById(id);
        return new DetalhesTopicoDTO(topico);

    }

    @PutMapping("/{id}")
    @Transactional // Essa anotação é imprescindível no método de atualização PUT
    //Para que, após a alteração feita, ele possa ser consignado à respectiva entidade
    public ResponseEntity<TopicoDTO> resourceUpdate(@PathVariable Long id, @RequestBody @Valid AtualizacaoTopicoForm form) {

    Topico topico = form.atualizar(id, topicoRepository);

    return ResponseEntity.ok(new TopicoDTO(topico));

    }


}
