package br.com.alura.forum.controller;

import br.com.alura.forum.DTO.TopicoDTO;
import br.com.alura.forum.controller.form.TopicoForm;
import br.com.alura.forum.controller.repository.CursoRepository;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/topicos")
public class controller {

    @Autowired
    private TopicoRepository topicoRepository;

    @Autowired
    private CursoRepository cursoRepository;

    //@RequestMapping(value = "/topicos", method = RequestMethod.GET)
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
    public void cadastrar(@RequestBody TopicoForm form) {
        Topico topico = form.conversor(cursoRepository);
        topicoRepository.save(topico);
    }


}
