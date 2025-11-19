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
    public String horario;
    public String local;
    List<Professor> professores = new ArrayList<>();
    List<Aluno> alunos = new ArrayList();
    
    public Turma (String horario,String local){
        this.horario = horario;
        this.local = local;
        
    }
    void definirLimiteDeAluno(){
        
    }
    void inserirNaProfessoresNaTurma(){
        
    }
    void inserirNaAlunosNaTurma(){
        
    }
}
