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
    private String nome = "Jailma";
    private String cpf = "436-167-723-98";
    private int idade = 48;
    private String genero = "Mulher";
    private Double salario = 8.0000;
    private double[] nota = new double[4];
    List<Disciplinas> disciplinas = new ArrayList();
    List<Turma> turmas = new ArrayList();
    List<Aluno> alunos = new ArrayList();
    
    public Professor (){
        
    }
    
    public Professor (String nome, String cpf, int idade, String genero,String discipinas){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
        this.nota = nota;
        
    }
    void verificarDisciplinas(){
        System.out.println("Disciplinas que " + nome);
        System.out.println("Matematica\nFisica\nIngles");
        
    }
    void inserirNotas (){
        System.out.println("Professora Jailma inseriu a nota: " + nota + " para Kauane Michele");
    
    }
    void colocarPresenca(){
        System.out.println("Colocar presença");
        System.out.println("presenca não feita hoje\n  por favor, atualizacar presença");
    }
    void verificarPresenca(){
        System.out.println("Verificar presença do dia anterio");
        System.out.println("Kauane: Presente");
        System.out.println("Mayte: Presente");
        System.out.println("Joao: Falta");
        System.out.println("Felipe: Falta");
        System.out.println("Pedro: Falta");

    }
    void veificarConogramaDasDisciplina(){
        System.out.println("Verificar o conograma" + disciplinas + ": ");
        
    }
    void definirSituacaoAcademicaDoAluno(Aluno aluno){
        alunos.add(aluno);
        System.out.println("A definição academica do aluno: " + alunos );
        
        
    }
    
}

