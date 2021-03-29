/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo5.pkg2022431708.latihan57.vehicle;

    /**
 *
 * @author
 * Nama : Fadly Hadi Wijaya
 * Nim : 2022431708
 * Kelas : PBO - FS112B
 * Deskripsi Program : Program ini berisi Program untuk Menampilkan Nama Bicyle dan SkateBoard
 *
 */
public class PBO52022431708Latihan57Vehicle {

    public static void main(String[] args) {
        //    Bicycle    
        Bicycle bicycle = new Bicycle("Trek Bike","7,4 FX");
        bicycle.setMyBrand("Trek Bike");
        bicycle.setMyModel("7,4 FX");
        bicycle.setGear(23);
        System.out.println("Brand : "+bicycle.getMyBrand());
        System.out.println("Model : "+bicycle.getMyModel());
        System.out.println("Jumlah Gear : "+bicycle.getGear());
        
         System.out.println();
          System.out.println();
        
        //SkateBoard
        
        SkateBoard sk = new SkateBoard("Ally Skate","Rocket");
        sk.setMyBrand("Ally Skate");
        sk.setMyModel("Rocket");
        sk.setBoardLength(54.5);
        System.out.println("Brand : "+sk.getMyBrand());
        System.out.println("Model : "+sk.getMyModel());
        System.out.println("Panjangnya Board : "+sk.getBoardLength());
    }
    
}
