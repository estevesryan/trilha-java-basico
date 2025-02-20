package br.com.estevesryan.Models;

public class PessoaFisica extends Pessoa {
    private String CPF;

    public PessoaFisica(String nome,String sexo, String CPF) {
        super(nome, sexo);
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }
}
