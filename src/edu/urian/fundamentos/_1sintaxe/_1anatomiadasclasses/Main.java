package edu.urian.fundamentos._1sintaxe._1anatomiadasclasses;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Urian");
        pessoa.setSobreNome("Almeida");
        System.out.println("Hello, World! " + pessoa.getNome());

        // Declaração de Constante no Java:
        final String BR = "Brasil";
        System.out.println(BR);
        boolean verdadeira = false;
        System.out.println(verdadeira);

        // Regras declaração de variáveis:
        // Tipo nomeBemDefinido = Atribuição; -> A atribuição pode ser feita em outro momento

        // Usando os métodos
        // Usando concat e String.
        System.out.println("Resultado da Soma: ".concat(String.valueOf(somar(4, 5))));
        System.out.println(formatarCep(49087580));
        System.out.println(exibirNomeCompleto(pessoa.getNome(), pessoa.getSobreNome()));

        // Packages:
        // com para comercial | org para organizacional | opensource para Open Source | edu para Educação
        // Nome do usuário ou nome da empresa
        // Nome da finalidade: notification, ficha, upload, download, etc
        // Exemplo: edu.urian.fundamentos e assim em diante

        // Sugestões de nomenclaturas de variáveis:
        // Deve ser clara, sem abreviações ou definição sem sentido
        // Sempre no singular, exceto quando se referir a um array ou coleção
        // Defina um idioma único para suas variáveis. Se for em inglês, todas em inglês.
        // Exemplos ruins:
        double salMedio = 1500.23; // Abreviou salário para sal
        String emails = "urian.castro@gmail.com"; // Declarou no plural, mas só tem um email. Não é um array ou coleção
        // Declarou a variável em inglês, destoando das variáveis anteriores, que estão em português
        // Mesmo que o valor dessa variável seja em inglês, deve-se manter a padronização do idioma escolhido
        String myName = "JOSEPH";

        // Correções:
        double salarioMedio = 1500.23;
        String email = "urian.castro@gmail.com";
        String [] outrosEmails = {"urian.castro@gmail.com", "uriandecastro@hotmail.com"};
        String meuNome = "JOSEPH";
    }

    // Regras declaração de métodos:
    // TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)
    // Exemplo: Estou em 5 minutos e 18 segundos - Anatomia das Classes-3
    public static int somar(int numeroUm, int numero2) {
        return numeroUm + numero2;
    }

    // Aqui o metodo recebe um parâmetro do tipo long
    // Mas retorna o tipo String
    // O nome sempre é no infinitivo, com uma proposta clara, bem definida
    public static String formatarCep(long cep) {
        return "Aqui está seu cep: " + cep;
    }

    public static String exibirNomeCompleto(String nome, String sobreNome) {
        return nome.concat(" ").concat(sobreNome);
    }

    // Nomenclaturas dos métodos:
    int multiplicar(int n1, int n2) { return n1 * n2; }
    void abrirConexao() {}
    void concluirProcessamento() {}
    void findById(int id) {} // Pode usar métodos em inglês, como os que estão sendo usados de alguma biblioteca
    // Errado:
    // Confuso. Um metodo deve fazer apenas uma coisa. Deve ser separado em
    // dois metodos: calcular e imprimir
    void calcularImprimir() {}
}