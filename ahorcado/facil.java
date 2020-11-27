import java.util.Random;
import java.util.Scanner;

public class facil{
    public void facil(){
        final int INTENTOS_TOTALES = 7; // Constante con el limite de fallos
        int intentos = 0;
        int aciertos = 0;
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        char resp;
        // Random para que escoja palabra al azar
        Random rnd = new Random();
        // Creamos unas palabras 
        String arrayPalabras[] = new String[3];
        arrayPalabras[0] = "gato";
        arrayPalabras[1] = "bola";
        arrayPalabras[2] = "casa";
       
        do {

        int alea = rnd.nextInt(3);
        char[] palabra1 = palabra2(arrayPalabras[alea]);
        char[] copia = palabra2(arrayPalabras[alea]); 
        char[] tusRespuestas = new char[palabra1.length];
 
        for(int i = 0; i < tusRespuestas.length; i++){
            tusRespuestas[i] = '_';
        }
        
        System.out.println("Adivina la palabra");
        
        while(intentos < INTENTOS_TOTALES && aciertos != tusRespuestas.length){
            imprimeOculta(tusRespuestas);
            System.out.println("\nIntroduce una letra: ");
            resp = teclado.next().toLowerCase().charAt(0);
            // Recorremos el array 
            for(int i = 0; i <palabra1.length; i++){
                if(palabra1[i]==resp){
                    tusRespuestas[i] = palabra1[i];
                    palabra1[i] = ' ';
                    aciertos++;
                }
            }    
            intentos++;
        }
        // Si hemos acertado todas imprimimos un mensahe
        if(aciertos == tusRespuestas.length){
            System.out.print("\nFelocidades! Lo has logrado: ");
            imprimeOculta(tusRespuestas);
        }
        // Si no 
        else{
            System.out.print("\nLa palabra era: ");
            for(int i = 0; i < copia.length; i++){
                System.out.print(copia[i] + " ");
            }
        }
        // Reseteamos contadores
        intentos = 0;
        aciertos = 0;
        // Volvemos a preguntarle al usuario si quiere volver a perder el tiempo
        resp = pregunta("\n\nQuieres jugar de nuevo?",teclado);
        }while(resp != 'n');
       
    }
    
    private static char[] palabra2(String palAzar){
        char[] letras;
        letras = new char[palAzar.length()];
        for(int i = 0; i < palAzar.length(); i++){
            letras[i] = palAzar.charAt(i);
        }
        return letras;
    }
    
    private static void imprimeOculta(char[] tusRespuestas){
        
        for(int i = 0; i < tusRespuestas.length; i++){
            System.out.print(tusRespuestas[i] + " ");
        }
    }
    
    public static char pregunta(String men, Scanner teclado) {
        char resp;
        System.out.println(men + " Presione S si quiere, de lo contrario presione N");
        resp = teclado.next().toLowerCase().charAt(0);
        while (resp != 's' && resp != 'n') {
            System.out.println("Solo se admite S o N");
            resp = teclado.next().toLowerCase().charAt(0);
        }
        return resp;
       

    }

}