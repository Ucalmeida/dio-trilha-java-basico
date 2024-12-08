package edu.urian.fundamentos._1sintaxe._1anatomiadasclasses;

public class Pessoa {
    private String nome;
    private String sobreNome;

    // METODO SET:
    // PÚBLICO - SEM RETORNO - setNomeAtributo (PARÂMETRO DE ENTRADA)
    // ATRIBUI O PARÂMETRO DE ENTRADA AO ATRIBUTO DA CLASSE( Uso do THIS)
    public void setNome(String nome) {
        this.nome = nome;
    }

    // METODO GET:
    // PÚBLICO - TIPO DE RETORNO - getNomeAtributo (SEM PARÂMETRO)
    // RETORNO DO VALOR CONTIDO NO ATRIBUTO DA CLASSE
    public String getNome() {
        return nome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }
}
