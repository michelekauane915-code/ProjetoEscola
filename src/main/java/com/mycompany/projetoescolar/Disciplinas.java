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
public class Disciplinas {
    public String nome = "Matematica";
    public String horario = "08:30 ate as 09:10";
    List<Professor> professores = new ArrayList<>();
    List<Turma> turmas = new ArrayList();
    List<Aluno> alunos = new ArrayList();
    
    public Disciplinas(){
        
    }
    
    public Disciplinas (String nome, String horario){
        this.nome = nome;
        this.horario = horario;
    }
    void exibirGradeDeHorario(){
        System.out.println("Disciplina: " + nome);
        System.out.println("horario: "+  horario);
    }
     public void exibirProfessores(){
        System.out.println("Turma 3 anos 'C' ");
        System.out.println("Professores\nJailma professora de Matematica\nThiago professor de Inglis\nFranciele professora de fisica\nHugo professor de Historia\nBeto professor de Geografia");
        
    
    }
}
