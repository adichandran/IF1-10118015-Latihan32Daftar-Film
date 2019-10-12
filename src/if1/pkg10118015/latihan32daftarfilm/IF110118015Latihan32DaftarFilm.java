/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan32daftarfilm;

/**
 *
 * @author
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : Program ini berisi program menampilkan daftar film
 */
public class IF110118015Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        film movie = new film();
        System.out.println("===Daftar Film Sedang Tayang===");
        movie.nowPlaying("Venom","Action, Horror, Scifi",8.5,120);
        movie.nowPlaying("Small Foot","Animation",9.0,96);
        movie.nowPlaying("Crazy Rich Asian","Comedy",7.8,119);
        movie.nowPlaying("Asih","Horror",6.0,100);
    }
    
}
