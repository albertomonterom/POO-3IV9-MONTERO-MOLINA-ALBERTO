import java.time.LocalDate; //permite obtener la fecha actual
import java.time.Period;//nos sirve para tomar en cuenta los meses 
import java.time.format.DateTimeFormatter;//contiene la clase DateTimeFormatter.
import java.util.Scanner;

public class Ej1{
    public void E1(){
        System.out.println("Introduzca la fecha, Ejemplo: dd/mm/yyyy");
        Scanner sc = new Scanner(System.in);
        String fecha = sc.nextLine();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(fecha,fmt);
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNac, ahora);
        System.out.printf("Tu edad es: %s years, %s meses y %s dias",
        periodo.getYears(), periodo.getMonths(), periodo.getDays());
        System.out.println("            ");
       

    }

}