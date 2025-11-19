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
    String nome;
    String diretor;
    String colaboradores;
    List<Professor> professores = new ArrayList<>();
    List<Turma> turmas = new ArrayList();
    List<Aluno> aluno = new ArrayList();
    List<Colaborador> calaboradores = new ArrayList();
    
    public Escola(String nome, String diretor){
        this.nome = nome;
        this.diretor = diretor;
        this.professores = null;
        this.colaboradores = null;
        
    }
    void MatricularAluno(){
        
    }
    void ExpulsarAluno(){
        
    }
    void OrientarAluno(){
        
    }
    void ContratarProfessor(){
        
    }
    void demitirProfessor(){
        
    }
    void suspenderProfessor(){
        
    }
    void dimitirColaborador(){
        
    }
    void suspenderColaborador(){
        
    }
    
}
