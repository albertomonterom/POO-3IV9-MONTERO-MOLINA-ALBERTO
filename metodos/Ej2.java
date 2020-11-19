import java.util.Scanner;
public class Ej2{
    Scanner entrada = new Scanner(System.in);
    int opcion;
    int altura, base, lado;
    double resultado, perimetro;
    char letra;

   


    public void E2(){

        do{

            System.out.println("SELECCIONE UNA DE LAS SIGUIENTES OPCIONES:");
            System.out.println("1.-AREA Y PERIMETRO DE UN CIRCULO");
            System.out.println("2.-AREA Y PERIMETRO DE UN RECTANGULO");
            System.out.println("3.-AREA Y PERIMETRO DE UN CUADRADO");
            System.out.println("4.-AREA Y PERIMETRO DE UN TRIANGULO");
            opcion=entrada.nextInt();

            switch (opcion) {
                case 1:
                 Cir();
                    break;

                case 2:
                 Rec();
                    break;

                case 3:
                 Cua();
                    break;

                case 4:
                 Tri();
                    break;
            
                default:
                    break;
            }
            System.out.println("Si quieres terminar, favor de presionar 's'");
        letra = entrada.next().charAt(0);


        }while(letra!='s');

    }

    public void Cir(){
        System.out.println("Ingresa el valor del radio");
        base = entrada.nextInt();
        resultado = 3.1416*(base*base);
        perimetro = 3.1416*2*base;
        System.out.println("El area es de: "+resultado);
        System.out.println("El perimetro es de: "+perimetro);
    }
    public void Rec(){
        System.out.println("Ingresa el valor de la base");
        base = entrada.nextInt();
        System.out.println("Ingresa el valor de la altura");
        altura = entrada.nextInt();
        resultado=(base*altura);
        perimetro=(base+base+altura+altura);
        System.out.println("El area es de: "+resultado);
        System.out.println("El perimetro es de: "+perimetro);
    }
    public void Cua(){
        System.out.println("Ingresa el valor de un lado");
        base = entrada.nextInt();
        resultado = base*base;
        perimetro = base*4;
        System.out.println("El area es de: "+resultado);
        System.out.println("El perimetro es de: "+perimetro);
    }
    public void Tri(){
        System.out.println("Ingresa el valor de la base");
        base = entrada.nextInt();
        System.out.println("Ingresa el valor de la altura");
        altura = entrada.nextInt();
        resultado = (base*altura)/2;
        perimetro = base*3;
        System.out.println("El area es de: "+resultado);
        System.out.println("El perimetro es de: "+perimetro);
    }
}