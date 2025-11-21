/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoescolar;

/**
 *
 * @author KAUANEMICHELEALVESTO
 */
public class Colaborador {
    private String nome;
    private String cpf;
    private int idade;
    private String genero;
    public String cargo;
    private double salario;
    
    public Colaborador (String nome, String cpf, int idade, String genero,
                        String cargo, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
        this.cargo  = cargo;
        this.salario = salario;
               
    }
    void verificarEscalaDeTrabalho(){
          System.out.println("Escala de trabalho do colaborador " + nome + ": turno a definir");
    }
    void baterPonto(){
         System.out.println(nome + " bateu o ponto");
        
    }  
}
