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
    public String nome;
    private String cpf;
    public int idade;
    private String genero;
    List<Disciplinas> discipinas = new ArrayList();
    List<Turma> turmas = new ArrayList();
    List<Aluno> alunos = new ArrayList();
    
    public Professor (String nome, String cpf, int idade, String genero,String discipinas){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
    }
    void verificarDisciplinas(){
        
    }
    void inserirNotas (){
        
    }
    void colocarPresenca(){
        
    }
    void verificarPresenca(){
        
    }
    void definirSituacaoAcademicaDoAluno(){
        
    }
}
