package br.univille;

import br.univille.entity.Cidade;
import br.univille.entity.Cliente;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");

        var cliente = new Cliente();
        cliente.setNome("bruno");
        cliente.setIdade(22);
        cliente.setPeso(67);

        Cidade cidade = new Cidade("Manchester");

        cliente.setCidade(cidade);
        

    }
}