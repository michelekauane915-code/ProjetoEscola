/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoescolar;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KAUANEMICHELEALVESTO
 */
public class Aluno {
    private String nome;
    private String cpf;
    private int idade;
    private String genero;
    private String responsável;
    private double[] nota = new double[4];
    private String matricula;
    private  String horario;
    List<Disciplinas> discipinas = new ArrayList();
    List<Turma> turmas = new ArrayList();
    
    public Aluno (String nome, String cpf, int idade, String genero,String responsável,double[] nota,String matricula){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
        this.responsável = responsável;
        this.matricula = matricula;
        this.horario = horario;
        
    }
    void verSuaNota (){
         System.out.print("Notas do aluno " + nome + ": ");
        for (double nota : nota) {
            System.out.print(nota + " ");
        }
    }
    void consultarFrequencia (){
         System.out.println("Frequências de " + nome + ":");
        System.out.println("Sistema de frequência ainda não feito");
    }
    void consultarHistorico (){
         System.out.println("Historico de" + nome + ":");
    }
    void consultarComprovanteDeMatricula (){
        System.out.println("Comprovante de matrícula de " + nome + " (Matrícula: " + matricula + ")");
    }
    void consultarGradeDeHorario(){
        System.out.println("Disciplinas: " + nome);
        System.out.println("Horario: " + horario);
    }
}
