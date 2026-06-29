package org.example.vetores_matrizes;

/**
 * Título: Exemplo de atividade 3
 *
 *     <p>Faça um programa com um vetor com 10 elementos inteiros
 *     positivos (aleatórios e da sua escolha). Permita que seja solicitado
 *     um determinado calor inteiro e positivo para ser procurado neste vetor.
 *     Caso exista, o programa deve exibir o índice no qual o valor está posicionado.
 *     Caso contrário, o programa deve informar que o elemento não existe no vetor.
 *     </p>
 *
 *     @author Arthur Henrique Ferreira Nogueira
 *     @version 1.0
 *     @since 2026
 */

import java.util.Scanner;

public class Exemplo3 {
    public static  void main(String[] args){
        int[] MeuVetor = {20 , 66 , 3, 40, 79, 32, 53, 2, 90, 125};
        Scanner Input = new Scanner(System.in);
        int posicao = -1;

        System.out.println("Digite o valor que deseja ver: ");
        int Valor = Input.nextInt();

        for (int i=0; i<MeuVetor.length; i++ ){
            if(MeuVetor[i] == Valor){
                posicao = i;
                break;
            }
        }

        if (posicao != -1){
            System.out.println("valo encontrado na posição (" + posicao + ")!");
        } else {
            System.out.println("O valor não existe no vetor");
        }
    }
}
