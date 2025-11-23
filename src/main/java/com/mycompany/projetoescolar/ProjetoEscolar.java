/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetoescolar;

/**
 *
 * @author KAUANEMICHELEALVESTO
 */
public class ProjetoEscolar {
    public static void main(String[] args){
        
        Escola EremQuiteria = new Escola();
        Colaborador colaborador1 = new Colaborador();
        Disciplinas disciplinas1 = new Disciplinas();
        Turma turma1 = new Turma();
        Aluno aluno1 = new Aluno();
        Professor professor1 = new Professor();
        
        
        System.out.println("ESCOLA: ");
        EremQuiteria.demitirColaborador();
        EremQuiteria.MatricularAluno();
        EremQuiteria.demitirProfessor(professor1);
        System.out.println("");
        
        System.out.println("COLABORADOR: ");
        colaborador1.verificarEscalaDeTrabalho();
        colaborador1.baterPonto();
        System.out.println("");
         
        System.out.println("DISCIPLINAS: ");
        disciplinas1.exibirGradeDeHorario();
        disciplinas1.exibirProfessores();
        System.out.println("");
        
        System.out.println("TURMA: ");
        turma1.definirLimiteDeAluno();
        turma1.inserirNaAlunosNaTurma();
        System.out.println("");
        
        System.out.println("ALUNO: ");
        aluno1.consultarComprovanteDeMatricula();
        aluno1.consultarFrequencia();
        System.out.println("");
        
        System.out.println("PROFESSOR: ");
        professor1.colocarPresenca();
        professor1.verificarPresenca();
       
    }}

    





