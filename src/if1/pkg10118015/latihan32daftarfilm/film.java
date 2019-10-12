/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan32daftarfilm;

/**
 *
 * @author ACER
 */
public class film {
    public String filmName,filmGenre;
    public double rating;
    public int Duration;
    
    public static void nowPlaying(String filmName, String filmGenre,double rating, int Duration){
        System.out.println("Judul Film : "+filmName);
        System.out.println("Genre Film : "+filmGenre);
        System.out.println("Rating Film : "+rating);
        System.out.println("Duration Film : "+Duration+" menit");
        System.out.println();
    } 
    
}
