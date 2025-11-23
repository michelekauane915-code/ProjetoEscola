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
    private String nome = "Kauane Michele";
    private String cpf = "001-426-788-39";
    private int idade = 17;
    private String genero = "Mulher";
    private String responsável = "Marlene Torquato";
    private double[] nota = new double[4];
    private String matricula = "00236-9";
    private  String horario = "Entrada: 07:30\nSaida: 04:40";
    List<Disciplinas> disciplinas = new ArrayList();
    List<Turma> turmas = new ArrayList();
    
    public Aluno(){
    
    }
    
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
            System.out.print(nota + ": ");
        }
    }
    void consultarFrequencia (){
         System.out.println("Frequencia da semana anterio de "+ nome);
        System.out.println("Sangunda presente!");
        System.out.println("Terca presente!");
        System.out.println("Quarta presente!");
        System.out.println("Quinta presente!");
        System.out.println("Sexto faltou!");
    }
    void consultarHistorico (){
         System.out.println("Historico de" + nome + ":");
         System.out.println("Sistema de histórico ainda não foi feito");
    }
    void consultarComprovanteDeMatricula (){
        System.out.println("Comprovante de matricula de " + nome + " (Matricula: " + matricula + ")");
    }
    void consultarGradeDeHorario(){
        System.out.println("Disciplinas: " + disciplinas);
        System.out.println("Horario: " + horario);
    }
}
