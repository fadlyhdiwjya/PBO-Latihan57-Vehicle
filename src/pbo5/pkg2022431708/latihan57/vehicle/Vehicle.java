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
public class Vehicle {
    
    private String myBrand;
    private String myModel;
    
    public Vehicle(String myBrand, String myModel){
        this.myBrand = myBrand;
        this.myModel = myModel;
    }
    
    public void setMyBrand(String myBrand){
        this.myBrand = myBrand;
    }
    
    public String getMyBrand(){
        return myBrand;
    }
     public void setMyModel(String myModel){
        this.myModel = myModel;
    }
    
    public String getMyModel(){
        return myModel;
    }
    
    
}
