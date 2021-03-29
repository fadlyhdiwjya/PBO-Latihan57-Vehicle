/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo5.pkg2022431708.latihan57.vehicle;

/**
 *
 * @author HP
 */
public class Bicycle extends Vehicle {
    
    
    private int myGearCount;
    
    public Bicycle(String myBrand,String myModel){
        super(myBrand, myModel);
        System.out.println("Bicycle");
    }
    
    public void setGear(int gear){
        this.myGearCount = gear;
    }
    
    public int getGear(){
        return myGearCount;
    }
}
