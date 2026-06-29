package org.example.vetores_matrizes;

/**
 * Título: Exemplo de atividade 1
 *
 *     <p>Faça um vetor de 10 posições. Preencha-o
 *     com os valores 10, 20, 30, 40, 50, 60, 70, 80, 90, 100.
 *     Use um for para exibir os valores deste vetor.</p>
 *
 *     @author Arthur Henrique Ferreira Nogueira
 *     @version 1.0
 *     @since 2026
 */

public class Exemplo1 {
    public  static void main(String[] args) {
        int[] MeuVetor = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.println("Meu Vetor com 10 posições:");

        for (int i = 0; i<MeuVetor.length; i++){
            System.out.print(MeuVetor[i] + " | ");
        }
    }
}
