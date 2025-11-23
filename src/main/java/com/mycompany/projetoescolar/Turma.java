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
public class Turma {
    private String identificador = "3 ano 'C' ";
    public String horario = "7:30 ate as 04:40";
    public String local = "Primeiro andar";
    List<Professor> professores = new ArrayList<>();
    List<Aluno> alunos = new ArrayList();
    
    public Turma(){
        
    }
    
    public Turma (String horario, String local){
        this.horario = horario;
        this.local = local;
    }
    void definirLimiteDeAluno(){
        System.out.println("Limite de alunos: 30 estudantes");
    }
    void inserirNaProfessoresNaTurma(Professor professor){
        professores.add(professor);
        System.out.println("Professor " + professores + " esta incluindo na turma");
    }
    void inserirNaAlunosNaTurma(){
        System.out.println("Aluna Kauane Michele esta incluindo na turma");
        
    }
    void removerProfessoresNaTurma (Professor professor){
        professores.remove(professor);
        System.out.println("Professor " + professores + "esta excluido da turma");
    }
}
