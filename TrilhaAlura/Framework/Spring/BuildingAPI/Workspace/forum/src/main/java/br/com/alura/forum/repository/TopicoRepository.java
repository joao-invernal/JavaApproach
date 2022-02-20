package br.com.alura.forum.repository;

import br.com.alura.forum.modelo.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

//Os tipos referenciados no Generics se trata da classe do objeto e do tipo da chave primário (ID), respectivamente
public interface TopicoRepository extends JpaRepository<Topico, Long> {

    //Consulta criada automaticamente pelo padrão JPA
    List<Topico> findByCurso_Nome(String nomeCurso);

    //Consulta ao banco de dados criada manualmente
    @Query("SELECT t FROM Topico t where t.curso.nome = :nomeCurso")
    List<Topico> carregarPoNomeDoCurso(@Param("nomeCurso") String nomeCurso);

}
