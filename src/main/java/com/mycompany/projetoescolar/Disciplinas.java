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
    public String nome;
    public String horario;
    public String materia;
    List<Professor> professores = new ArrayList<>();
    List<Turma> turmas = new ArrayList();
    List<Aluno> alunos = new ArrayList();
    
    public void Disciplinas (){}
    public Disciplinas (String nome, String horario){
        this.nome = nome;
        this.horario = horario;
        this.materia = materia;
    }
    void exibirGradeDeHorario(){
        System.out.println("Disciplina: " + nome);;
       System.out.println("horario: "+  horario);
    }
     public void exibirProfessores(){
         System.out.println("Nome: " + nome);
         System.out.println("Matéria: " + materia);
    
    }
}
