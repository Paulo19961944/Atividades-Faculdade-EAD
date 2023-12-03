/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulamento;
import java.util.Random;

/**
 *
 * @author paulo
 */

// Classe
public class Pessoa {
    // Atributos
    private String nome;
    private double codigo_identificador;
    private Random aleatorio;

    // Métodos
    public Pessoa(String nome) {
        aleatorio = new Random();
        this.setNome(nome);
        this.codigo_identificador = aleatorio.nextDouble();
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public double getCodigoIdentificador() {
        return this.codigo_identificador;
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Paulo");
        Pessoa p2 = new Pessoa("Bianca");
        Pessoa p3 = new Pessoa("Maria");
        System.out.println("Pessoa 1: " + p1.getNome());
        System.out.println("Pessoa 2: " + p2.getNome());
        System.out.println("Pessoa 3: " + p3.getNome());
    }
}
