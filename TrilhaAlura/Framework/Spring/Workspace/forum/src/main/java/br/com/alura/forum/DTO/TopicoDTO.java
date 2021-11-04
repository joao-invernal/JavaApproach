package br.com.alura.forum.DTO;

import br.com.alura.forum.modelo.Topico;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class TopicoDTO {

    private Long id;
    private String titulo;
    private String msg;
    private LocalDateTime dataCriacao;


    public TopicoDTO(Topico topic) {
        this.id = topic.getId();
        this.titulo = topic.getTitulo();
        this.msg = topic.getMensagem();
        this.dataCriacao = topic.getDataCriacao();
    }

    public static List<TopicoDTO> conversor(List<Topico> topicos) {

        return topicos.stream().map(TopicoDTO::new).collect(Collectors.toList());

    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMsg() {
        return msg;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }
}
