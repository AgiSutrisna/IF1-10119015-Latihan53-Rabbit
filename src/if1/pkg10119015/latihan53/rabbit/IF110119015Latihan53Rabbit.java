/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119015.latihan53.rabbit;

/**
 *
 * @author Agy
 * NAMA     : Agi Sutrisna
 * KELAS    : IF-1
 * NIM      : 10119015
 */
public class IF110119015Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rabbit kelinci = new Rabbit("Peter",true,"Grass",4,"Grey");
        System.out.println("Hello, his name is " + kelinci.getName());
        System.out.println(kelinci.getName() + " is vegetarian? " + kelinci.isVegetarian());
        System.out.println(kelinci.getName() + " eat " + kelinci.getEats());
        System.out.println(kelinci.getName() + " has " + kelinci.getNoOfLegs() + " legs");
        System.out.println(kelinci.getName() + " color is " + kelinci.getColor());
    }
    
}
