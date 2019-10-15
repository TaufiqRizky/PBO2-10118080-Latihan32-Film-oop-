/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan32.film.oop;

/**
 *
 * @author Trizky
 */
public class Film {
    public String filmNama,filmGenre;
    public double filmRating;
    public int filmDuration;
    
    public void nowPlaying(){
        System.out.println("");
        System.out.println("Judul Film\t: "+filmNama);
        System.out.println("Genre Film\t: "+filmGenre);
        System.out.println("Rating Film\t: "+filmRating);
        System.out.println("Duration Film\t: "+filmDuration+" Menit");
        
    }
}
