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
public class Escola {
    String nome = "Erem Quiteria Wanderly Simões";
    String diretor = "Almir";
    String colaboradores = "Marcos";
    List<Professor> professores = new ArrayList<>();
    List<Turma> turmas = new ArrayList();
    List<Aluno> alunos = new ArrayList();
    List<Colaborador> calaboradores = new ArrayList();
    
    public Escola(){
    
    }
    
    public Escola(String nome, String diretor){
        this.nome = nome;
        this.diretor = diretor;
        this.professores = null;
        this.colaboradores = null;
        
    }
    void MatricularAluno(){
       System.out.println("Aluno matricula: " + alunos);
    }
    void ExpulsarAluno(Aluno aluno){
       System.out.println("Expulsar aluno: " + alunos);
    }
    void OrientarAluno(Aluno aluno){
        alunos.add(aluno);
        System.out.println("Orientando o aluno: " + alunos);
        
    }
    void ContratarProfessor(Professor professor){
        professores.add(professor);
        System.out.println("Professor contratado: " + professores);
        
    }
    void demitirProfessor(Professor professor){
        professores.remove(professor);
        System.out.println("Professor demitido; " + professores);
        
    }
    void suspenderProfessor(Professor professor){
        professores.add(professor);
        System.out.println("Suspender o professor: " + professores);
        
    }
    void demitirColaborador(){
       System.out.println("Colaborador foi demitido: " + colaboradores);
       
    }
    void suspenderColaborador() {
       System.out.println("Colaborador foi suspenso: "+ colaboradores);
   
    }    

}
