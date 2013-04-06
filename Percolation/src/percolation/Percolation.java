/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package percolation;


/**
 *
 * @author cscheper
 */
public class Percolation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public Percolation(int N) {
    } // create N-by-N grid, with all sites blocked
    
    public void open(int i, int j){
    }         // open site (row i, column j) if it is not already
    
    public boolean isOpen(int i, int j){
        
        return true;
    }    // is site (row i, column j) open?
    
    public boolean isFull(int i, int j){
        return true;
    }    // is site (row i, column j) full?
    
    public boolean percolates(){
        
        return true;
    }            // does the system percolate?
    
    
}
