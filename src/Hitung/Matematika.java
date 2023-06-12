/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hitung;

/**
 *
 * @author Administrator
 */
public class Matematika {
    //membuat variable
    private double bil1, bil2;
    
    // membuat constructor
    public Matematika (double bil1, double bil2){
        this.bil1 = bil1;
        this.bil2 = bil2;
        
    }
    //membuat setPenjumlahan
    public double setPenjumlahan (){
        return bil1 + bil2;
        
    }
    public double setPengurangan (){
        return bil1 - bil2;
        
    }
    public double setPerkalian (){
        return bil1 * bil2;
        
    }
    public double setPembagian (){
        return bil1 / bil2;
        
    }

}
