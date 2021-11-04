package br.com.alura.io.Serialization;

import java.io.Serializable;

public class ContaCliente implements Serializable {

    private String email;
    private String senha;

    private transient Cliente cadastro;

    public ContaCliente(Cliente cadastro) {
        this.cadastro = cadastro;
    }

    public Cliente getCadastro() {
        return cadastro;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
