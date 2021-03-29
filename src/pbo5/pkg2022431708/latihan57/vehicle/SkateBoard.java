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
public class SkateBoard extends Vehicle{
    
    private double myBoardLength;
    
    public SkateBoard(String myBrand, String myModel){
        super(myBrand, myModel);
    }
    
    public void setBoardLength(double myBoardLength){
        this.myBoardLength = myBoardLength;
    }
    public double getBoardLength(){
        return myBoardLength;
    }
    
}
