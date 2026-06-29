package org.example.vetores_matrizes;

/**
 * Título: Exemplo de atividade 5
 *
 *     <p>Faça um programa com uma matriz 5x5 de inteiros
 *     positivos ou negativos (aleatórios e da sua escolha) e encontre e
 *     exiba o maior elemento dessa matriz.
 *     </p>
 *
 *     @author Arthur Henrique Ferreira Nogueira
 *     @version 1.0
 *     @since 2026
 */

public class Exemplo5 {
    public static void main(String[] args) {
        int[][] MinhaMatriz = {{-2, 9, 30, 55, 12},
                                {121, 5, -38, 7, 10},
                                {8, -6, 44, 96, 88},
                                {98, -667, -54, 93, -1222},
                                {-13, 46, -35, 75, -3}};

        int Maior = MinhaMatriz[0][0];

        for (int i = 0; i < MinhaMatriz.length; i++) {
            for (int j = 0; j < MinhaMatriz[i].length; j++) {
                if (MinhaMatriz[i][j] > Maior) {
                    Maior = MinhaMatriz[i][j];
                }
            }
        }
        System.out.println("Maior elemento: " + Maior);
    }
}
