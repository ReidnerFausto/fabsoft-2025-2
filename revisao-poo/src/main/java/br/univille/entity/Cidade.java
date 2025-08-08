package br.univille.entity;

public class Cidade {

    private String nome;

    //construtor funciona de forma ientica a solidity ele briga a passar valores que devem ser utilizados ao inicializar a classe
    public Cidade(String nome)//Parametros funcionam identicamente ao solidity tbm
    {
        this.nome = nome;

    }


    public String getNome(){
        return this.nome;
    }
    
}
