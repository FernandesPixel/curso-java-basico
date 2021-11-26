/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juan.cursojava.aula48;

/**
 *
 * @author juann
 */
public class MultiplosCatch {

    public static void main(String[] args) {
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denom = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + " / " + denom[i] + " = " + (numeros[i] / denom[i]));
            } catch (ArithmeticException e) {
                System.out.println("Erro ao divir por zero");
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Posição do array inválida");
            }
        }
    }
}
