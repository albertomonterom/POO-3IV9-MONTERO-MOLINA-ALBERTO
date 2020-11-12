import java.util.Scanner;

public class metodinValores{

    public static void main(String[] args){
    }

    //metodo
    public void cargarValores(){
    }
        //metodo vacio por eso se antepone la palabra reservada void
        //porque es void o vacio?
        //porque no estamos enviando o recibiendo ningun parametro 

        Scanner entrada=new Scanner(System.in);
        //variables
        int val1, val2, val3;
        int mayor, menor;
        System.out.println("Ingresa el primer numero a comparar");
        val1=entrada.nextInt();
        System.out.println("Ingresa elsegundo numero a comparar");
        val2=entrada.nextInt();
        System.out.println("Ingresa el tercer numero a comparar");
        val3=entrada.nextInt();

        mayor=CalcularMayor(val1, val2, val3);
        menor=calcularmenor(val1, val2, val3);

        System.out.println("Ingresa el primer numero a comparar:" +mayor)
        System.out.println("Ingresa el primer numero a comparar:" +menor)




        //parametros pueden ser otra variable solo simnboññlixa a una variable

        public int CalcularMayor(int v1, int v2, int v3){

            //me va a servir quien es el mas grande 

            if(v1>v2 && v1>v3){

                m=v1;
            }else{
                if(v2>v3){

                    m=v2;
                }else{
                    m=v3;
                }
            }
            //fin comparaciones
            return m;
        

    }

}