/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto04ifelse;

/**
 *
 * @author aluno
 */
public class Projeto04IFelse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        if (condicao booleana)
        {
            //Codigo
        }
        else
        {
            //codigo
        }
        
        */
        
        int idade = 10;
        if (idade < 18){
            System.out.println("Menor idade");
        }
        else
        {
            System.out.println("Maior idade");
        }
        
        //operadores logicos
        // E && (conjuncao)
        // ou || (disjuncao)
        
        boolean amigoDoDono = true;
             if (idade < 18 && amigoDoDono == false){
            System.out.println("Menor idade. Entrada proibida");
        }
        else
        {
            System.out.println("Pode entar");
        }
        
        //operador de NEGACAO(!)
        if (idade < 18 && !amigoDoDono){
            System.out.println("Menor idade. Entrada proibida");
        }
        else
        {
            System.out.println("Pode entar");
        }
        
        //Operador de igualdade (==)
        int mes = 1;
        if (mes == 1)
        {
            System.out.println("janeiro");
        }
        else
        {
            System.out.println("Tempo de Trabalhar");
        }
    }
    
}
