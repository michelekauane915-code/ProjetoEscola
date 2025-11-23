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
        
        EremQuiteria.demitirColaborador();
        EremQuiteria.MatricularAluno();
        
        colaborador1.verificarEscalaDeTrabalho();
        colaborador1.baterPonto();
        
        disciplinas1.exibirGradeDeHorario();
        disciplinas1.exibirProfessores();
        
        turma1.definirLimiteDeAluno();
        turma1.inserirNaAlunosNaTurma();
        
        aluno1.consultarComprovanteDeMatricula();
        aluno1.consultarFrequencia();
        
        professor1.colocarPresenca();
        
    }}

    





