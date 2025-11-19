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
    public String nome;
    private String cpf;
    public int idade;
    private String genero;
    public String responsável;
    private double[] nota = new double[4];
    private String matricula;
    List<Disciplinas> discipinas = new ArrayList();
    List<Turma> turmas = new ArrayList();
    
    public Aluno (String nome, String cpf, int idade, String genero,String responsável,double[] nota,String matricula){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
        this.responsável = responsável;
        
    }
    void verSuaNota (){
        // acessar a nota
    }
    void consultarFrequencia (){
         
    }
    void consultarHistorico (){
         
    }
    void consultarComprovanteDeMatricula (){
        
    }
    void consultarGradeDeHorario(){
        
    }
}
