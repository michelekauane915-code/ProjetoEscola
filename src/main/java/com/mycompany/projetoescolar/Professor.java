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
public class Professor {
    private String nome;
    private String cpf;
    private int idade;
    private String genero;
    private Double salario;
    private String presenca;
    List<Disciplinas> disciplinas = new ArrayList();
    List<Turma> turmas = new ArrayList();
    List<Aluno> alunos = new ArrayList();
    
    public Professor (String nome, String cpf, int idade, String genero,String discipinas){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
        
    }
    void verificarDisciplinas(){
         System.out.print("Disciplinas do Professor " + nome + ": ");
        
    }
    void inserirNotas (){
        
    }
    void colocarPresenca(){
        System.out.println("Colocar presença" + presenca + ": ");
        System.out.println("Sistema de Presença ainda não feito");
    }
    void verificarPresenca(){
        System.out.println("Verificar presença" + presenca + ": ");
        System.out.println("Sistema de Presença ainda não feito");

    }
    void veificarConogramaDasDisciplinas(){
        System.out.println("Verificar o conograma" + disciplinas + ": ");
    }
    void definirSituacaoAcademicaDoAluno(){
        
    }
    
}

