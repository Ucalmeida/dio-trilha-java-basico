package edu.urian.fundamentos._1sintaxe._2tiposevariaveis;

public class TiposVariaveis {
    public static void main(String[] args) {
        // Tipos e Variáveis:
        // Não são considerados Objetos e representam valores brutos
        // São armazenados direto na pilha de memória(Memory Stack)
        // Tipos primitivos: int, byte, short, long, float, double, boolean e char
        // Numéricos Inteiros: int, byte, short, long
        // Decimais: float e double
        // Os mais usados são: int e double

        // Uma variável sempre vai ser declarada assim: <TIPO> <NOME> <ATRIBUIÇÃO>
        int idade; // Declarado, mas sem atribuição
        int anoFabricacao = 2021;
        double salarioMinimo = 1562.50;
        byte idadeAnciao = 123;
        short ano = 2024;
        // Talvez a melhor opção para esses dois abaixo seja uma String
        int cep = 49087580; // Se começar com zero, talvez seja necessário outro tipo
        // O L é necessário para deixar claro para o java que se trata de um número long
        // e dessa forma ser corretamente armazenado na memória
        long cpf = 93118180544L; // Se começar com zero, talvez seja necessário outro tipo

        // Na atribuição de valores float e double existem diferenças,
        // como o 'F' no final de uma atribuição float
        float pi = 3.14F;
        double salario = 5700.50;

        // Aqui funciona. O tipo short é menor que o tipo int, portando
        // ele aceita que seja atribuído uma variável do tipo short
        // a uma variável do tipo int
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;

        // Aqui não funciona. Um tipo short é menor que um tipo int,
        // portanto, Java não permite que seja atribuída uma variável
        // de tipo maior a uma variável de tipo menor, a menos que
        // o desenvolvedor faça um cast, garantindo que pode atribuir
        // por que o valor é menor que o suportado pela variável de tipo menor
        // short numeroCurto2 = numeroNormal;
        short numeroCurto2 = (short) numeroNormal; // Estou dizendo aqui: Pode aceitar, vai caber :)

        // Tipos Lógicos: boolean
        boolean verdade = true;
        // Caracteres: char
        char letra = 'A';
        // Objetos

        // Diferença entre Variável e Constante
        // Variável: é uma área de memória, associada a um nome, que pode armazenar valores de um determinado tipo.
        // Um tipo de dado define um conjunto de valores e um conjunto de operações.
        // No Java utilizamos identificadores que representam uma referência(ponteiro) a um valor de memória,
        // e esta referência pode ser redirecionada a outro valor, sendo, portanto, esta a causa do nome "variável",
        // pois o valor pode variar.
        // Constantes são valores armazenados em memória que não podem ser modificados após declarados
        // Em Java esses valores são representados pela palavra reservada final, seguida do tipo.
        // Por convenção, constantes são escritas em CAIXA ALTA.

        // Variável:
        int numero = 5;
        System.out.println(numero);
        numero = 10;
        System.out.println(numero);

        // Constante:
        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI);
    }
}
