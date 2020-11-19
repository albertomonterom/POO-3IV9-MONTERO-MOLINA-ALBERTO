import java.util.Scanner;
public class Ej3{
    Scanner entrada = new Scanner(System.in);
    int opcion, opcion2, llamada;
    float celular;
    double credito, creditofinal, credito1, LN, LI, C, costofinal;
    char repetir=0;

    public void E3(){

        do{
            System.out.println("SELECCIONE UNA DE LAS SIGUIENTES OPCIONES:");
            System.out.println("1.-LLAMADA");
            System.out.println("2.-CONSULTAR EL CREDITO");
            System.out.println("3.-INGRESAR CREDITO");
            opcion=entrada.nextInt();
            switch (opcion) {
                case 1:
                 LLA();
                    break;

                case 2:
                 CONS();
                    break;

                case 3:
                 ING();
                    break;
            
                default:
                    break;
            }
            System.out.println("Si desea repetir el menu presione la letra 'r'");
            repetir=entrada.next().charAt(0);

        }while(repetir=='r');

    }
    //metodos
    public void LLA(){
        System.out.println("Ha elegido la opcion de llamada");
        System.out.println("Ingrese su credito actual por favor:");
        credito=entrada.nextInt();
        System.out.println("Ingrese el numero telefonico:");
        celular=entrada.nextFloat();
        System.out.println("Seleccione una de las siguientes opciones:");

        do{
            System.out.println("1.- LLAMADAS LOCALES NACIONALES");
            System.out.println("2.- LLAMADAS LOCALES INTERNACIONALES");
            System.out.println("3.- LLAMADAS CELULARES");

            opcion2=entrada.nextInt();
            switch (opcion2) {
                case 1:
                 if (credito<0.5){
                     System.out.println("No tiene suficiente credito para realizar llamadas nacionales, F");
                 }
                 else{
                    System.out.println("Cuantas llamadas nacionales desea realizar?");  
                    llamada=entrada.nextInt();
                    costofinal=(llamada*0.5);
                    LN=(credito-costofinal);
                    System.out.println("El costo total es de: " +costofinal);
                    System.out.println("Su credito actual es de: " +LN);
                 }
                    
                    break;
                case 2:
                if (credito<0.6){
                    System.out.println("No tiene suficiente credito para realizar llamadas internacionales, F");
                }
                else{
                   System.out.println("Cuantas llamadas internacionales desea realizar?");  
                   llamada=entrada.nextInt();
                   costofinal=(llamada*0.6);
                   LI=(credito-costofinal);
                   System.out.println("El costo total es de: " +costofinal);
                   System.out.println("Su credito actual es de: " +LI);
                }
                    
                    break;
                case 3:
                if (credito<0.2){
                    System.out.println("No tiene suficiente credito para realizar llamadas celulares, F");
                }
                else{
                   System.out.println("Cuantas llamadas celulares desea realizar?");  
                   llamada=entrada.nextInt();
                   costofinal=(llamada*0.2);
                   C=(credito-costofinal);
                   System.out.println("El costo total es de: " +costofinal);
                   System.out.println("Su credito actual es de: " +C);
                }
                    break;
            
                default:
                    break;
            }
            System.out.println("Si desea repetir el menu presione la letra 'r'");
            repetir=entrada.next().charAt(0);
            
        }while(repetir=='r');



    }
    public void CONS(){
        System.out.println("Ha elegido la opcion de consulta de credito");
        System.out.println("Ingrese el numero telefonico:");
        celular=entrada.nextFloat();
        System.out.println("Ingrese su credito actual:");
        credito=entrada.nextInt();
        System.out.println("Su credito actual es de: "+credito);
    }
    public void ING(){
        System.out.println("Ha elegido la opcion de ingresar credito");
        System.out.println("Ingrese el numero telefonico:");
        celular=entrada.nextFloat();
        System.out.println("Ingrese su credito actual:");
        credito=entrada.nextInt();
        System.out.println("Ingrese el credito a comprar:");
        credito1=entrada.nextInt();
        creditofinal=(credito+credito1);
        System.out.println("Su credito actual es de: "+creditofinal);

    }
      
}