package br.com.estevesryan.View;

import br.com.estevesryan.Models.PessoaFisica;
import br.com.estevesryan.Models.PessoaJuridica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("Ryan Esteves", "Masculino", "123.456.789-00");
        PessoaJuridica pj = new PessoaJuridica("Ryan Esteves", "Masculino", "12.345.678/0001-00");

        System.out.println("Pessoa Fisica:");
        System.out.println("Nome: " + pf.getNome());
        System.out.println("Sexo: " + pf.getSexo());
        System.out.println("CPF: " + pf.getCPF());

        System.out.println("\nPessoa Juridica:");
        System.out.println("Nome: " + pj.getNome());
        System.out.println("Sexo: " + pj.getSexo());
        System.out.println("CNPJ: " + pj.getCnpj());
    }
}
