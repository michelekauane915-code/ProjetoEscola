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
    private String nome = "Marcos";
    private String cpf = "995-642-578-45";
    private int idade = 27;
    private String genero = "Homem";
    public String cargo = "Comunicador";
    private double salario = 3.000;
    
    public Colaborador(){
    
    }
    
    public Colaborador (String nome, String cpf, int idade, String genero,
                        String cargo, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
        this.cargo  = cargo;
        this.salario = salario;
               
    }
    public void verificarEscalaDeTrabalho(){
         System.out.println("Escala de trabalho " + nome + ": as 07:10 ate as 04:40");
    }
    public void baterPonto(){
         System.out.println(nome + " bateu o ponto");
        
    }  
}
