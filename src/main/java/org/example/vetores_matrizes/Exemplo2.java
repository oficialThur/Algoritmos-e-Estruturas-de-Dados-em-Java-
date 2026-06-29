package org.example.vetores_matrizes;

/**
 * Título: Exemplo de atividade 2
 *
 *     <p>Crie uma matriz de caracteres (char)
 *     de 16 posições (4x4). Preencha-a com os valores
 *     a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, e, p.
 *     Use dois fro para exibir os valores desta matriz.
 *     </p>
 *
 *     @author Arthur Henrique Ferreira Nogueira
 *     @version 1.0
 *     @since 2026
 */

public class Exemplo2 {
    public static void main(String[] args) {

        char[][] MinhaMatriz = {{'a', 'b', 'c' ,'d'},
                               {'e', 'f', 'g', 'h'},
                               {'i', 'j', 'k', 'l'},
                               {'m', 'n', 'o', 'p'}};

        System.out.println("Minha Matriz de 4X4:");

        for (int i = 0; i < MinhaMatriz.length; i++){
            for (int j = 0; j < MinhaMatriz[i].length; j++){
                System.out.print(MinhaMatriz[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
