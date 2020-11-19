import java.util.Scanner;
class metodos{
       public static void main (String[] args){
        Scanner entrada=new Scanner(System.in);
        int opcion;
        char repetir=0;

        Ej1 met1=new Ej1();
        Ej2 met2=new Ej2();
        Ej3 met3=new Ej3();


        do{
            System.out.println("---------------------------");
            System.out.println("MONTERO MOLINA ALBERTO 3IV9");
            System.out.println("---------------------------");
            System.out.println("SELECCIONE UNA DE LAS SIGUIENTES OPCIONES:");
            System.out.println("1.-Calcular la edad del usuario");
            System.out.println("2.-Areas y perimetros");
            System.out.println("3.-Costo de llamadas telefonicas celulares");
            opcion=entrada.nextInt();

            switch (opcion) {
                case 1:
                 met1.E1();
                    break;

                case 2:
                 met2.E2();
                    break;

                case 3:
                 met3.E3();
                    break;
            
                default:
                    break;

            }
            System.out.println("Si desea regresar al menu principal presione 'r'");
            repetir=entrada.next().charAt(0); 

        }while(repetir=='r');



    }
}
