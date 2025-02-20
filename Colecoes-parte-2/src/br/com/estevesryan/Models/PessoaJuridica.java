package br.com.estevesryan.Models;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, String sexo, String cnpj) {
        super(nome,sexo);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
}
