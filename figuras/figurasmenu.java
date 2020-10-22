import java.util.Scanner;

class FigurasMenu{

    public static void main(String[] args){
        
        //variables  y objetos
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int altura, base, diagonal1, diagonal2, lado, ladorombo;
        double resultado, apotema, perimetro1;
        char letra;


        //la creacion del menu
        do{

        System.out.println("Bienvenido al programa de calculo de areas y perimetros");
        System.out.println("Elija una de las siguientes opciones:");
        System.out.println("1.- Calcular area y perimetro de un cuadrado");
        System.out.println("2.- Calcular area y perimetro area de un triangulo");
        System.out.println("3.- Calcular area y perimetro area de un circulo");
        System.out.println("4.- Calcular area y perimetro area de un rectangulo");
        System.out.println("5.- Calcular area y perimetro area de un rombo");
        System.out.println("6.- Calcular area y perimetro area de un hexagono");


        opcion = entrada.nextInt();

        //saber que opcion para que calculo
        switch(opcion){
            case 1:
                System.out.println("Ingresa el valor de un lado");
                base = entrada.nextInt();
                resultado = base*base;
                perimetro1 = base*4;
                System.out.println("El area es de: "+resultado);
                System.out.println("El perimetro es de: "+perimetro1);
                //cerrar los casos
                break;

            case 2:
                System.out.println("Ingresa el valor de la base");
                base = entrada.nextInt();
                System.out.println("Ingresa el valor de la altura");
                altura = entrada.nextInt();
                resultado = (base*altura)/2;
                perimetro1 = base*3;
                System.out.println("El area es de: "+resultado);
                System.out.println("El perimetro es de: "+perimetro1);
                break;

            case 3:
                System.out.println("Ingresa el valor del radio");
                base = entrada.nextInt();
                resultado = 3.1416*(base*base);
                perimetro1 = 3.1416*2*base;
                System.out.println("El area es de: "+resultado);
                System.out.println("El perimetro es de: "+perimetro1);
                break;

            case 4:
                System.out.println("Ingresa el valor de la base");
                base = entrada.nextInt();
                System.out.println("Ingresa el valor de la altura");
                altura = entrada.nextInt();
                resultado = base*altura;
                perimetro1 = ((2*base)+(2*altura));
                System.out.println("El area es de: "+resultado);
                System.out.println("El perimetro es de: "+perimetro1);
                break;
            case 5:
                System.out.println("Ingresa el valor de la diagonal menor");
                diagonal1 = entrada.nextInt();
                System.out.println("Ingresa el valor de la diagonal mayor");
                diagonal2 = entrada.nextInt();
                System.out.println("Ingresa el valor del lado del rombo para calcular el perimetro");
                ladorombo = entrada.nextInt();
                resultado = (diagonal1*diagonal2)/2;
                perimetro1 = ladorombo*4;
                System.out.println("El area es de: "+resultado);
                System.out.println("El perimetro es de: "+perimetro1);
                break;
            case 6:
                System.out.println("Ingresa el valor de un lado");
                lado = entrada.nextInt();
                System.out.println("Ingresa el valor de la apotema");
                apotema=entrada.nextInt();
                resultado = ((lado*6)*apotema)/2;
                perimetro1 = lado*6;
                System.out.println("El area es de: "+resultado);
                System.out.println("El perimetro es de: "+perimetro1);
                break;
            default:
                System.out.println("Gracias por venir xd");
        }
        System.out.println("Si quieres terminar, favor de presionar 's'");
        letra = entrada.next().charAt(0);
        


            
        }while(letra!='s');
        


           
        
    }
}