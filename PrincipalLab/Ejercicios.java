//Debemos descubrir el tipo de dependencias entre clases 

import java
util.Scanner;

public class Ejercicios{

    Scanner entrada=new Scanner(System.in);

    /*
    Crear el programa

    */

    public void menu(){

        char op;

        System.out.println("Bienvenidos a este programa");
        System.out.println("a.- Calculadora");
        System.out.println("b.- Conversion de unidades");
        System.out.println("c.- Creacion de cuaderos");
        System.out.println("d.- Movimiento de cuaderos");
        System.out.println("d.- Movimiento de cuaderos");
//cuando es caracter se acupa charAt POSICION DEL

        op=entrada.next().charAt(0);


        switch (op) {
            case a:

             Calculadora();
                
                break;
            case b: 
              
             Conversion();
                
                break;
            case c:
              CreaCuadros();
                
                break;
            case d:
              MoviCuadros();
                
                break;
            default:
                break;




    

    public void Calculadora(){

        //variables
        double numero=0.00, suma=0.00, multi=0.00;
        char operacion, p;


        System.out.println("Seleccione operacion deseada");
        System.out.println("a.- Suma y resta");
        System.out.println("a.- Suma y resta");
        System.out.println("a.- Suma y resta");

        operacion=entrada.next().charAt(0);
        switch (operacion){

            case a:

        }
    }
}