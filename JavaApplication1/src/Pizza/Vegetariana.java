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
public class Vegetariana extends Pizza {
    
    public Vegetariana() {
    }
    
     public Vegetariana(String masa, String[] salsa, String[] ingredientes) {
        super(masa, salsa, ingredientes);
        this.ingredientes = new String[4];
        this.ingredientes[0] = "Champiñones";
        this.ingredientes[1] = "Piña";
        this.ingredientes[2] = "Pimiento";
        this.ingredientes[3] = "Elote";
        
    }
    
    public Vegetariana(String masa){
        
    }

    public void elegiringredientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
