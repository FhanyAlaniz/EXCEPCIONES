/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;



/**
 *
 * @author Fhany
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Aritm();
        stackovf();
        arregloss();
        nullX();
      
      
       
    }

                public static void Aritm() {
                    try{
                         int i=10/0;
                    }catch(ArithmeticException ex){
                                ex.printStackTrace(System.err);       
       }
           
    }
    
                         public static void stackovf(){
	
                                try
                                { 
                                    stackovf();
                                
 
                            }catch(ExceptionInInitializerError ex){
                            ex.printStackTrace(System.err);  
                    }
                }
      
                    public static void arregloss(){
                     try{
               int [] array = new int[20];
		         array[-3] = 24;
                    }catch(ArrayIndexOutOfBoundsException ex){
                        ex.printStackTrace(System.err); 
        }
    }
    
                        public static void nullX(){
                            String cadena=null;
	
                                 try{
                                cadena.charAt(4);
                                }catch(NullPointerException ex){
                            ex.printStackTrace(System.err);  
        }
    }
}

