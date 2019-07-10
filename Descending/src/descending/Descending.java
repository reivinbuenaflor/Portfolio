/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descending;

/**
 *
 * @author Reivin
 */
public class Descending {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] animals = {"Cat", "Dog", "Sheep", "Fish", "Bird"};
        int[] numarrays = {-1,-2,3,0,5,6,7,9,10,11,13,15,-10,-14,4};
        int store;
        int n = numarrays.length;
        for(int x = 4; x >= 0; x--){
            System.out.println(animals[x]);
        }
        System.out.println();
        for(int a = 0; a < n-1 ; a++){
            for(int i = 0; i < n-a-1; i++){
                if(numarrays[i] > numarrays[i+1]){
                    store = numarrays[i];
                    numarrays[i] = numarrays[i+1];
                    numarrays[i+1] = store;
                }
            }   
        }
        for(int i = 0; i < n; i++){
            System.out.println(numarrays[i]);
        }
        
        
       
        
    }
    
}
