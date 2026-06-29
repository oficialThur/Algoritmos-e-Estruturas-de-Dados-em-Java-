package org.example.vetores_matrizes;

/**
 * Título: Exemplo de atividade 4
 *
 *     <p>Faça um programa com uma matriz com 9 elementos (3x3)
 *     reais positivos (aleatórios e da sua escolha). Calcule a exiba a soma
 *     dos elementos de cada linha desta matriz.
 *     </p>
 *
 *     @author Arthur Henrique Ferreira Nogueira
 *     @version 1.0
 *     @since 2026
 */

public class Exemplo4 {
    public static void main(String[] args) {
        int[][] matriz = {{2, 9, 30}, {121, 5, 38}, {8, 6, 44}};

        int[] SomaLinha = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            int soma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }

            SomaLinha[i] = soma;

            System.out.println("A soma das linhas são: " + soma);
        }

    }
}
