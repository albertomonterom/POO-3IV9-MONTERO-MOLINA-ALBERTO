import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i;
        int opcion;
        int intA;
        int pos = 0, neg = 0; 
        int[] numeros = new int[10]; 
        char repetir=0;
        double[] calificacion= new double[10];
        double sumaPos = 0, sumaNeg = 0, promedio=0, alta=0, baja=0, suma=0;       
        
          do{
            System.out.println("----------------------");
            System.out.println("ALBERTO MONTERO MOLINA");
            System.out.println("----------------------");
            System.out.println("Elija una de las siguientes opciones:");
            System.out.println("1.- Lectura de 10 numeros enteros y muestre el promedio de valores positivos y negativos");
            System.out.println("2.- Lectura de 10 numero enteros y muestre el promedio de los números que estén en las posiciones pares");
            System.out.println("3.- Lectura de 10 calificaciones de una asignatura para mostrar el promedio, la mas alta, la mas baja y la cantidad de aprobados y reprobados");
            System.out.println("4.- Lectura de una matrices A y B y sumarlas en una matriz S");
            
        opcion=entrada.nextInt();

        switch (opcion) {
        case 1:
            System.out.println("Lectura de los valores: ");
        for (i = 0; i < 10; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i]=entrada.nextInt();
        }

        
        for (i = 0; i < 10; i++) {
            if (numeros[i] > 0){ 
                sumaPos += numeros[i];
                
                pos++;
            } else if (numeros[i] < 0){ 
                sumaNeg += numeros[i];
                neg++;
            }
        }
        if (pos != 0) {
            System.out.println("Promedio de valores positivos: " + sumaPos / pos);                
        } else {
            System.out.println("No ha introducido numeros positivo xd");
        }
        if (neg != 0) {
            System.out.println("Promedio de valores negativos: " + sumaNeg / neg);
        } else {
            System.out.println("No ha introducido numeros negativos xd");
        }      
                break;
        case 2:
        System.out.println("Por favor digite los numeros");
        for (i= 0; i < 10; i++){
          System.out.print("numeros [" + i + "]= ");
          numeros[i] = entrada.nextInt();
        }
        for (i = 0; i < 10; i++){
          if(i % 2 == 0){
            promedio=promedio+numeros[i];
          }
        }
        System.out.println("El promedio de los numeros que se encuentran en las posiciones pares es: " +promedio/5);
          break;

        case 3:
        System.out.println("Ingrese por favor las 10 calificaciones de la asignatura:");
  
        for(i = 0; i < calificacion.length; i++){
           System.out.println("Alumno["+ (i+1) +"]");
           calificacion[i] = entrada.nextDouble();
         }  
         
         for(i = 0; i < calificacion.length; i++){
          if(calificacion[i] > alta){
           alta=calificacion [i];
           System.out.println("La calificacion mas alta es: "+alta);
          }
         }  
         
         for(i = 0; i < calificacion.length; i++){
          if(calificacion[i] < baja){
           baja=calificacion [i];
           System.out.println("La calificacion mas baja es: " +baja);
          }
          
         }  
          for(i = 0; i < calificacion.length; i++){
           suma = suma + calificacion[i];
         }  
          promedio = suma / calificacion.length;
           System.out.println("Calificacion promedio: " +promedio);
           
         for(i = 0; i < calificacion.length; i++){
           if(calificacion[i] > promedio){
             System.out.println("El alumno " + (i+1) + " Obtuvo una calificacion superior al promedio la cual fue:"+calificacion[i]);
           }
         }  
          for(i = 0; i < calificacion.length; i++){
          if(calificacion[i] >= 6){
           System.out.println("La cantidad de alumnos aprobados son: "+(i+1) );
          }
         }  
         for(i = 0; i < calificacion.length; i++){
          if(calificacion[i] < 6){
           System.out.println("La cantidad de alumnos reprobados son: "+(i+1) );
           }
          }
        
        case 4:
         int matrizA[][]= new int[3][3];
         int matrizB[][]= new int[3][3];
         int matrizS[][]= new int[3][3];
         int x;
         int y;
         System.out.println("Los valores de la matriz A son");
  
         for(x=0; x<= 2; x++){
           for(y=0; y<= 2; y++){
             System.out.print("Escribir el valor de la fila" + x +" y de la columna " + y +": ");
             matrizA[x][y]= entrada.nextInt();
           }
          }
          System.out.println("Los valores de la matriz B son");
         
         for(x=0; x<= 2; x++){
           for(y=0; y<= 2; y++){
             System.out.print("Escribir el valor de la fila " + x +" y de la columna " + y +": ");
             matrizB[x][y]= entrada.nextInt();
           }
          }
          for(x=0; x<= 2; x++){
              
           for(y=0; y<= 2; y++){
             matrizS[x][y]= matrizA[x][y]+matrizB[x][y];
           }
          }
          
          System.out.println("La matriz Suma es: ");
          
           for(x=0; x<= 2; x++){
           for(y=0; y<= 2; y++){
             System.out.print(matrizS[x][y]+ ":");
           }
          }
          break;
            default:
                break;

             
                   
            
            }
            System.out.println("Si desea regresar al menu principal presione 's'");
            repetir=entrada.next().charAt(0); 
        
          
          
          
          
          
          }while(repetir=='s');
    }
}