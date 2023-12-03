/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.poo;

/**
 *
 * @author paulo
 */
public class Aluno {

    private String nome;
    
    public void inserirNome(String nn) {
        nome = nn;
    }

    public String recuperarNome() {
        return nome;
    }

    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.inserirNome("Paulo");
        System.out.println("Saída: " + a.recuperarNome());
    }
}
