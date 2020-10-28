import java.util.Scanner;

class Estructuradatos{

    public static void main(String[] args){

        Scanner entrada=new Scanner(System.in);

        int opcion, opcionabono, edad, numrombo, opcion1, opcion2, xd, numeroo;
        double abono, resultado, resultado2, resultado1, resultado3, resultado4, resultado5;
        int grado;
        double grados, resultado11, r2, r, altura, base, radio;
        int positivo=0;
        int negativo=0;
        int eltotal=0;
   




        System.out.println("3IV9_MONTERO_MOLINA_ALBERTO");
        System.out.println("1.- Descuento al precio del abono dependiendo la edad");
        System.out.println("2.- Conversion de decimal a binario");
        System.out.println("3.- Conversion de temperatura");
        System.out.println("4.- Contador de numeros positivos y negativos");
        System.out.println("5.- Factura total de los productos comprados");
        System.out.println("6.- Areas, perimetros y volumenes");
        System.out.println("7.- Tabla");
        System.out.println("8.- Lectura de un entero no negativo y su factorial");
        System.out.println("9.- Lectura de lados de un cuadrado");
        System.out.println("10.- Lectura e impresion de un cuadrado hueco");
        System.out.println("11.- Lectura e impresion de un patron");
        System.out.println("12.- Lectura e impresion de diamante");
        System.out.println("13.- Salir del menu xdxd");

        opcion=entrada.nextInt();

        switch(opcion){
            case 1:

            System.out.println("Ingrese su edad");
            edad=entrada.nextInt();
            System.out.println("Ingrese su abono mi pana");
            abono=entrada.nextInt();
            if (edad>=65){
                resultado=abono*0.40;
                resultado5=abono-resultado;
               System.out.println("El precio total del abono es de: " +resultado5);
            }
            else {
                 if(edad<=21){
                System.out.println("Sus padres son socios?");
                System.out.println("Si es asi presiona 1, en caso contrario presiona otro numero");

                opcion1=entrada.nextInt();   
                System.out.println("Confirme de nuevo");
                
                   if(opcion1==1){
                       
                       resultado1=entrada.nextInt();

                    resultado1=abono*0.45;
                    resultado4=abono-resultado1;
                    System.out.println("El precio total del abono es de: " +resultado4);

                   }
                   else{
                    
                    resultado2=entrada.nextInt();

                    resultado2=abono*0.25;
                    resultado3=abono-resultado2;
                    System.out.println("El precio total del abono es de: " +resultado3);

                   }
                }
            }
                  
                  
                break;
            case 2:
            System.out.println("Escriba el numero a convertir");
                int num=25;
                num=entrada.nextInt();
                String base2="";
                while(num>0){
                    base2=(num%2)+base2;
                    num/=2;
                }
                System.out.println(base2);
            
            
                  
             break;
            
            
            case 3:
            System.out.println("Elija el tipo de conversion que desea hacer");
             System.out.println("1.- Fahrenheit a Celcius");
             System.out.println("2.- Fahrenheit a Kelvine");
             System.out.println("3.- Fahrenheit a Rankine");
             grado=entrada.nextInt();
             switch(grado){
                 case 1:
                 System.out.println("Ingrese el valor Fahrenheit");
                 grados=entrada.nextInt();
                 resultado11=((grados-32)*(5))/9;
                 System.out.println("Celsius:"+resultado11);
                 break;
                 case 2:
                 System.out.println("Ingrese el valor Fahrenheit");
                 grados=entrada.nextInt();
                 resultado11=(5*(grados-32)/9)+273.15;
                 System.out.println("Kelvin:"+resultado11);
                 break;
                 case 3:
                 System.out.println("Ingrese el valor Fahrenheit");
                 grados=entrada.nextInt();
                 resultado11=(grados+459.67);
                 System.out.println("Rankine:"+resultado11);
                 break;

             }


             break;
            case 4:
            System.out.println("Inserte la cantidad de numeros a digitar");

                eltotal = entrada.nextInt();

                 do{
                        System.out.println("Inserte numero");

                        numeroo = entrada.nextInt();
                            

                        if(numeroo==0){
                            positivo=positivo+0;
                        } else { 
                        if(numeroo>0){
                            positivo=positivo +1;
                        }else{
                        negativo=negativo+1;
                         }

                        }

                        eltotal = eltotal-1;

                    }while (eltotal!=0);

                  System.out.println("Positivos: " +positivo);

                  System.out.println("Negativos: " +negativo);
                  positivo = entrada.nextInt();
                negativo= entrada.nextInt();


             break;
            case 5:
             break;
            case 6:
            System.out.println("1.- Area y perimetro de rectangulo");
            System.out.println("2.- Area y perimetro de un triangulo");
            System.out.println("3.- Volumen de una esfera y un cilindro");
            
            xd=entrada.nextInt();
            switch(xd){
                case 1:
                System.out.println("Inserte el valor de la base");
                base=entrada.nextInt();
                System.out.println("Inserte el valor de la altura");
                altura=entrada.nextInt();
                r=base*altura;
                r2=base+base+altura+altura;
                System.out.println("El area es de: "+r);
                System.out.println("El perimetro es de: "+r2);
                break;
                case 2:
                System.out.println("Inserte el valor de la base");
                base=entrada.nextInt();
                System.out.println("Inserte el valor de la altura");
                altura=entrada.nextInt();
                r=(base*altura)/2;
                r2=base*3;
                System.out.println("El area es de: "+r);
                System.out.println("El perimetro es de: "+r2);
                break;
                case 3:
                System.out.println("Inserte el valor del radio para calcular el volumen de una esfera");
                radio=entrada.nextInt();
                System.out.println("Inserte el valor del radio y posteriormente el de la altura para calcular el volumen del cilindro");
                radio=entrada.nextInt();
                altura=entrada.nextInt();
                r=(4/3)*(3.14)*(radio*radio*radio);
                r2=3.14*radio*radio*altura;
                System.out.println("El volumen de la esfera es de: " +r);
                System.out.println("El volumen del cilindro es de: " +r2);


                break;
            }
             break;
            case 7:
                int s;
                for(s=1; s<=10; s=s+1) {
                System.out.println(s+" "+(s*10)+" "+(s*100)+" "+(s*1000));
            
            }

             break;
            case 8:
            int f;
            long fact=1;
                System.out.println("Inserte el numero");
                f = entrada.nextInt();
                for (int p=f; p>0; p--){
                fact = fact * p;
              }
            System.out.println("El factorial de " + f + " es: " + fact);
                

             break;
            
             
            default:
             break;
        }

    
            


    }
    

    
}
