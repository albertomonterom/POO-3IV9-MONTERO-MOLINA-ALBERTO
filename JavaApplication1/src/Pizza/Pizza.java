/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizza;

/**
 *
 * @author molin
 */
public class Pizza {
    private String masa;//atributos
    private String [] salsa;
    String [] ingredientes;
    
    public Pizza(){
    }

    public Pizza(String masa, String[] salsa, String[] ingredientes) {
        this.masa = masa;
        this.salsa = salsa;
        this.ingredientes = ingredientes;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String [] getSalsa() {
        return salsa;
    }

    public void setSalsa(String [] salsa) {
        this.salsa = salsa;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

   //operaciones propias
    public void hornear() {
        System.out.println("Honear la pizza toma 15 min");
    }
    public void cortar() {
        System.out.println("La pizza se corta en 12 porciones");
    }
    public void empacar() {
        System.out.println("La pizza se empaca en una cajita de corazon");
    }

    public void cortar(int tam) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
      