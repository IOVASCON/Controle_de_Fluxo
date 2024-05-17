package Controle_de_Fluxo.DesafioControleFluxo;

import java.util.Scanner;

/**
 * A classe Contador é responsável por ler dois parâmetros do terminal e contar
 * a quantidade de números inteiros entre eles.
 */
public class Contador {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário via terminal
        Scanner terminal = new Scanner(System.in);

        // Solicita ao usuário que insira o primeiro parâmetro
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        // Solicita ao usuário que insira o segundo parâmetro
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            // Chama o método contar para realizar a contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Captura a exceção e imprime a mensagem de erro
            System.out.println(exception.getMessage());
        } finally {
            // Fecha o scanner para liberar o recurso
            terminal.close();
        }
    }

    /**
     * O método contar imprime a quantidade de números inteiros entre parametroUm e
     * parametroDois.
     *
     * @param parametroUm  o primeiro parâmetro de contagem
     * @param parametroDois o segundo parâmetro de contagem
     * @throws ParametrosInvalidosException se parametroUm for maior que parametroDois
     */
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Valida se parametroUm é maior que parametroDois
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Calcula a quantidade de números a serem impressos
        int contagem = parametroDois - parametroUm;

        // Loop para imprimir os números
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}


