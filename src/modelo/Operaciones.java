/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author RICARDO
 */
public class Operaciones {
    
    public int factorial(int n){
        int f=1;
        for (int i=1; i<n;i++){
            f=f*i;
            
        }
        return f;
    }
    
}
