package paradojacumplersa;

import java.math.*;

public class ParadojaCumpleRsa {


    
    public static void main(String[] args) {
        
     long inicio = System.currentTimeMillis();   
if (args[0].equals("-AtPc"))
{      
       
       String Modulo = args[1];
       String Aleatoreo = args[2];
       BigInteger BmoduloClave, BAleatoreo, BResultado1,BResultado2, Bmedio,Bmedio1;
       BigInteger temp1,Comparador1 = null,Comparador2, contador, divisor, contador1;
       BmoduloClave = new BigInteger(Modulo);
       BAleatoreo = new BigInteger(Aleatoreo);
              
       temp1 = new BigInteger("1");
       divisor = new BigInteger("2");
       contador = new BigInteger("1");
       
       Bmedio = BmoduloClave.subtract(contador);
       Bmedio1 = Bmedio.divide(divisor);
       
       int resutlado1 =0;
       int resultado2 = 0;
       String Blandera ="";
       /// dividor la clave en 2 
       
           
           int moduloClave1 = (BmoduloClave.intValue()-1);
           int medio = (moduloClave1/2);
           int superior = (moduloClave1+1);
           
           BigInteger[] Parte1  = new BigInteger[medio];
           BigInteger[] Parte2  = new BigInteger[superior-medio];
           String posicionInf [] = new String [medio];
           String posicionSup [] = new String [superior-medio];
           posicionInf [0] = temp1.toString();
           posicionSup [0] = Bmedio1.toString();
     // OBTENER PRIMER RESULTADO
       
           int Prueba = 0;
           int inicio1 = 1;
           int inicio2 = medio;
           for (int i = 0; i < medio; i++)
       
           {   
                contador1 = new BigInteger("1");
                if (i == 0)
                {   
               posicionInf [i] = temp1.toString();
               posicionSup [i] = Bmedio1.toString();
               BResultado1 =  BAleatoreo.modPow(temp1, BmoduloClave);
               BResultado2 =  BAleatoreo.modPow(Bmedio1, BmoduloClave); 
               temp1 = temp1.add(contador1);
               Bmedio1= Bmedio1.add(contador1);
               Parte1[i] = BResultado1;
               Parte2[i] = BResultado2;

                      if (BResultado1.equals(BResultado2) )
                         {
                           i = medio;
                           System.out.println("sali de una Colision encontrada en posicion"+i);
                           System.out.println(Parte1[i]);
                           System.out.println(Parte2[i]);
                           
                          }
                      
               inicio1++;
               inicio2++;
         
              }

           if ( i!=0)
           {   
               posicionInf [i] = temp1.toString();
               posicionSup [i] = Bmedio1.toString();
               BResultado1 =  BAleatoreo.modPow(temp1, BmoduloClave);
               BResultado2 =  BAleatoreo.modPow(Bmedio1, BmoduloClave);
               Parte1[i] = BResultado1;
               Parte2[i] = BResultado2;

               for (int k =0; k<= i; k++)
               {
                    for (int t=0;t<=i;t++)
                    {  
                        if (Parte1[k].equals(Parte2[t]))
                        {   
                            System.out.println("OPERACION TEMINADA CON EXITO !!");
                            System.out.println("la colision es  igual a: " + Parte1[k] +"  en las posiciones  "+ "i: " + posicionInf [k] + " j: " + posicionSup [t] );
                            t = i+1;
                            Blandera = "SALIR ";
                        }
 
                    }
                    
                        if(Blandera == "SALIR ")
                         {
                            k = i+1;
                         }
                   
               }
                    
                          if(Blandera == "SALIR ")
                           {
                            i = medio;
                           }
               inicio1 ++;
               inicio2++;
             
              
               temp1 = temp1.add(contador1);
               Bmedio1= Bmedio1.add(contador1);
             
               
               
             
           }
           
        
           
           }
       
}


    
        if (args[0].equals("HELP")) {
            
        System.out.println("" +
        "        |----------------------Paradoja Cumpleanos RSA        --------------------|\n" +
        "        |                      Consideraciones                                    |\n" +
        "        |     1. Usar el programa genRSA para generar de manera aleatoria         |\n" +
        "        |        la llave pública menores a 24 bits.                              |\n" +
        "                 Descargar de: http://www.criptored.upm.es/software/sw_m001d.htm  |\n" +
        "        |                       Sintaxis de Ejecución                             |\n" + 
        "        |     java ParadojaCumpleRsa.java –AtPc [NumeroAleatorioGENRSA] [Numero]  |\n" +
        "        |                                                                         |\n" +
        "        |     Universidad Autónoma de Occidente                                   |\n" +
        "        |     Especialización en Seguridad Informática                            |\n" +
        "        |     Certificados y Firmas Digitales                                     |\n" +
        "        |     Siler Amador Donado                                                 |\n" +
        "        |     2019                                                                |\n" +
        "        |                                                                         |\n" +
        "        |     Autores: Ramiro Ramirez Hernandez ramiro.ramirez@uao.edu.co         |\n" +
        "        |              Esteban Eheverry  Duran   jaanvagu@gmail.com               |\n" +
        "        |                                                                         |\n" +
        "        |                                                                         |\n" +
        "        |     Código fuente y archivos de prueba:                                 |\n" +
        "        |     https://github.com/estebane05/AtaqueCumplea-osRSA                   |\n" +
        "        |                                                                         |\n" +
        "        |-------------------------------------------------------------------------|\n"
        +"");
            
        
        }// FIN TERCER  CONDICIONAL
        long fin = System.currentTimeMillis();
        long tiempo = fin - inicio;
        System.out.println("Tiempo de ejecucion: " + tiempo + " milisegundos.");
    
}
    }
