package br.com.alura.forum.controller.form;

import br.com.alura.forum.repository.CursoRepository;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TopicoForm {

    //Anotações do BeanValidation para definir algumas regras:

    @NotNull @NotEmpty @Size(min = 5, max = 50)
    private String titulo;

    @NotNull @NotEmpty @Size(min = 10, max = 50)
    private String msg;

    @NotNull
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

        Curso curso = cursoRepository.findByNome(nomeCurso);
        return new Topico(titulo, msg, curso);

    }
}
