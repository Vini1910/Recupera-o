
package programa;

import java.util.ArrayList;
import java.util.List;


public class Programa {

   static String local ;
           
    public static void main(String[] args) {
        local l = new local();
        l.nome = "escola";
        
        Programa.local = l.nome;
        
        List <Pessoa> pessoas= new ArrayList <Pessoa>();
        Pessoa w = new Professor("Wagner");
        Pessoa c = new Professor("Carlos");
        Pessoa n = new Aluno("Nicoly");
        Pessoa me = new Aluno("Maria Eduarda");
        
        
        pessoas.add(w);
        pessoas.add(c);
        pessoas.add(n);
        pessoas.add(me);
        
        if(Programa.local.equals("onibus")){
            for(Pessoa a:pessoas){
            System.out.println(a.nome);
            System.out.println(a.baterPapo());
            }
        }
        if(Programa.local.equals("escola")){
            for(Pessoa a: pessoas){
                System.out.println(a.nome);
                if( a instanceof Aluno ){       
                    System.out.println(((Aluno) a).fzrExerc());
                }
                if( a instanceof Professor ){
                    
                    System.out.println(((Professor) a).darAula());
                
                }                
            }
        }
    }   
}
