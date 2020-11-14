/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan54.koordinat;

/**
 *
 * @author RAF
 * Nama         : Ridhwan Anwar Fauzan
 * NIM          : 10119077
 * Kelas        : IF - 2
 * Deskripsi    : Menampilkan Koordinat
 */
public class PBOIF210119077Latihan54Koordinat {

    
    public static void main(String[] args) {
        WarnaKoordinat objWarnaKoordinat = new WarnaKoordinat("Jingga", 10, 4);
        
        System.out.println("Warna Koordinat : "+objWarnaKoordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+objWarnaKoordinat.getX()+", y : "+objWarnaKoordinat.getY());
    }
    
}
