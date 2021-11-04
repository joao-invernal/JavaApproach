package br.com.alura.forum;

import br.com.alura.forum.DTO.TopicoDTO;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class controller {

    @RequestMapping("/topicos")
    public List<TopicoDTO> listaTopicos() {

        Topico topico = new Topico("Conexto em Flutter", "O que é exatamente o context em Flutter?",
                new Curso("Flutter", "Programação"));

        return TopicoDTO.conversor(Arrays.asList(topico, topico));

    }

}
