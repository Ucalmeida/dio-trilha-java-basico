package edu.urian.fundamentos._1sintaxe._3operadores;

import org.w3c.dom.ls.LSOutput;

import java.util.Date;

public class Operador {
    public static void main(String[] args) {
        // Operadores:
        // Atribuição: = | Inserir o valor inicial de uma variável ou alterar esse valor depois
        int idade = 22;
        String nome = "Urian";
        char sexo = 'M';
        boolean doadorOrgao = true;
        Date dataNascimento = new Date(); // Classes

        // Aritméticos
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10.0 * 7.0) + (20.0 / 4.0);

        // Unários
        // (+) Operador Unário de valor positivo
        // (-) Operador Unário de valor negativo
        // (++) Operador Unário de incremento de valor
        // (--) Operador Unário de decremento de valor
        // (!) Operador Unário lógico de negação
        int numero = 5;
        System.out.println(numero);
        System.out.println(-numero); // Não afeta a variável principal
        System.out.println(numero); // Mantém o valor original

        // Para afetar, precisa fazer da seguinte forma
        numero = -numero;
        System.out.println(numero); // Agora o número é negativo
        // Então, o operador unário (-) é um operador de negação de sinal.
        // Se o número é positivo, fica negativo. Se é negativo, fica positivo
        numero = -numero;
        System.out.println(numero);

        // Incremento:
        // numero = numero + 2;
        // Soma e depois imprime o valor após a soma
        numero++;
        System.out.println(numero);

        // Lembrar dessa regra:
        int numero2 = 4;
        // Usando numero2 direto na impressão
        // PRIMEIRO: IMPRIME
        // DEPOIS: SOMA
        System.out.println(numero2++);

        // Aqui vai exibir o valor depois da soma:
        System.out.println(numero2);

        // PRIMEIRO: SOMA
        // DEPOIS: IMPRIME
        int valor = 3;
        System.out.println(++valor);

        // Soma e depois imprime o valor após a soma
        numero--;
        System.out.println(numero);

        // Lembrar dessa regra:
        int numero3 = 4;
        // Usando numero2 direto na impressão
        // PRIMEIRO: IMPRIME
        // DEPOIS: SUBTRAI
        System.out.println(numero3--);

        // Aqui vai exibir o valor depois da soma:
        System.out.println(numero3);

        // PRIMEIRO: SUBTRAI
        // DEPOIS: IMPRIME
        int valor2 = 3;
        System.out.println(--valor2);

        // Lógicos: &&, ||
        boolean verdade = true;
        verdade = !verdade;
        System.out.println(verdade);

        // Ternários
        // <Expressão Condicional> ? <Caso seja true> : <Caso seja false>;
        int a, b;
        a = 5;
        b = 6;

        String condicao = "";
        if (a == b)
            condicao = "Verdadeiro";
        else
            condicao = "Falso";

        System.out.println(condicao);

        // Uso do Operador Ternário:
        condicao = a != b ? "Verdadeiro" : "Falso";
        System.out.println(condicao);

        // Relacionais
        // ==, !=, >, >=, <, <=
        // Comparar números pode ser feito usando operadores relacionais
        // Mas para comparar conteúdos dentro de objetos, como um objeto String, por exemplo:
        // Usamos o equals()
        String nomeUm = "Urian";
        String nomeDois = new String("Urian");
        System.out.println(nomeUm == nomeDois); // Retorna false, pois compara dois objetos diferentes
        System.out.println(nomeUm.equals(nomeDois)); // Retorna true, pois compra o conteúdo entre dois objetos
    }
}
