/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo2;

/**
 *
 * @author OGUZHAN
 */
public class Demo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int randomSayi = (int)(Math.random()*(1000)); //0 ile 1000 arasında sayı
        System.out.println("random sayi " + randomSayi); //üretilen sayıyı konsola bastırdık
 
        int birler = randomSayi %10; //birler basamağı
 
        randomSayi = randomSayi /10; 
        int onlar = randomSayi %10;   //onlar basamağı
        
        int yuzler = randomSayi /10;  //yüzler basamağı
 
        System.out.println("Toplamları ="+(birler+onlar+yuzler));
    
}
}
