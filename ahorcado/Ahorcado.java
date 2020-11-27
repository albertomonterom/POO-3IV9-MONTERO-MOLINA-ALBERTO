import java.util.Scanner;
class Ahorcado{
       public static void main (String[] args){
        Scanner entrada=new Scanner(System.in);
        int opcion;
        char repetir=0;

        facil met1=new facil();
        medio met2=new medio();
        dificil met3=new dificil();


        do{
            System.out.println("---------------------------");
            System.out.println("MONTERO MOLINA ALBERTO 3IV9");
            System.out.println("---------------------------");
            System.out.println("SELECCIONE EL NIVEL DE DIFICULTAD DEL JUEGO:");
            System.out.println("1.-Facil");
            System.out.println("2.-Medio");
            System.out.println("3.-Dificil");
            opcion=entrada.nextInt();

            switch (opcion) {
                case 1:
                 met1.facil();
                    break;

                case 2:
                 met2.medio();
                    break;

                case 3:
                 met3.dificil();
                    break;
            
                default:
                    break;

            }
            System.out.println("Si desea regresar al menu principal presione 'r' de lo contrario presione 's'");
            repetir=entrada.next().charAt(0); 

        }while(repetir=='r');



    }
}