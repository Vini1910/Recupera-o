/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

/**
 *
 * @author Aluno
 */
public class Professor extends Pessoa{
    String nome;
    Professor(String nome){
        
        super(nome);
        this.nome = nome;
    }

    
    public String darAula() {
        return "DANDO AULINHA";
}
}
