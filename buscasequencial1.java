import  java.util.Scanner ;
import  java.util.Random ;

public  class  buscaSequencial1 {
    public  static  void  main ( String [] args ) {
        Scanner tcl =  new  Scanner ( System .In );
        Random aleatório= new Random ();
        int vetor [] = new  int [ 40 ];
         boolean= true ;
        for ( int i =  0 ; i < vetor.length; i ++ ) {
            vetor [i] = Random.nextInt ( 100 );
        }
        
        System.out. println ( " Digite os numeros desejados: " );
        int valor= tcl . nextInt ();
        for ( int i =  0 ; i < vetor.length; i ++ ) {
            if (valor == vetor [i]) {
                System.out. println ( " O número que foi encontro é " + valor);
                boolean=  falso ;
                break ;
            }
        }
        
        if (boolean ==  true ) {
            system .Out. println ( " O numero digitado não foi encontrado " );
        }
    }
}