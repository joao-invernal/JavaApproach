package br.com.alura.forum.controller.form;

import br.com.alura.forum.controller.repository.CursoRepository;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

public class TopicoForm {

    private String titulo;
    private String msg;
    private String nomeCurso;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Topico conversor(CursoRepository cursoRepository) {

        Curso curso = cursoRepository.findByName(nomeCurso);
        return new Topico(titulo, msg, curso);

    }
}
