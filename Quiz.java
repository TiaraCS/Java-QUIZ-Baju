/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quiz;

/**
 *
 * @author muham
 */
import java.util.Scanner;
import java.io.IOException; 
public class Quiz {
    public static void main(String[]args)throws Exception{
    // TODO code application logic here
    Scanner input = new Scanner (System.in);
    char pilih ; 
    System.out.println(" Nama : Tiara Candy Syaqila \n NIS : 539232372 \n Kelas : XI TEL 10 ");
    System.out.print("Masukan Kode Baju :  ");
    pilih = (char) System.in.read();
        switch(pilih){
            case '1' :
                System.out.print("Masukkan ukuran: ");
                char ukuran1 = input.next().charAt(0);
                char ukuranBaju1= Character.toUpperCase(ukuran1);
                System.out.println( "IMP");
                int hargaBaju1;
                if (ukuranBaju1 == 'S'){
                  hargaBaju1 = 200000;
                } else if (ukuranBaju1 == 'M') {
                           hargaBaju1 = 220000;
                } else {
                        hargaBaju1 = 250000;
                }
                
                System.out.println("Anda Memilih IMP dengan ukuran "+ukuranBaju1+", Tagihan anda adalah "+hargaBaju1);
                break;
            case '2' :
                System.out.print("Masukkan ukuran: ");
                char ukuran = input.next().charAt(0);
                char ukuranBaju= Character.toUpperCase(ukuran);
                System.out.println( "Prada");
                int hargaBaju;
                if (ukuranBaju == 'S') {
                  hargaBaju = 150000;
                } else if (ukuranBaju == 'M') {
                    hargaBaju = 160000;
                } else {
                    hargaBaju = 170000;
                }
                System.out.println("Anda Memilih Prada dengan ukuran "+ukuranBaju+", Tagihan anda adalah "+hargaBaju);
                break;
            case '3' : 
                System.out.print("Masukkan ukuran: ");
                char ukuran3 = input.next().charAt(0);
                char ukuranBaju3= Character.toUpperCase(ukuran3);
                System.out.println( "Gucci");
                int hargaBaju2; 
                if (ukuranBaju3 == 'S') {
                    hargaBaju2 = 200000;
                } else if (ukuranBaju3 == 'M') {
                    hargaBaju2 = 200000;
                } else {
                    hargaBaju2 = 200000;
                }  
                System.out.println("Anda Memilih Gucci dengan ukuran "+ukuranBaju3+", Tagihan anda adalah "+hargaBaju2);
                break;
            case '4' : 
                System.out.print("Masukkan ukuran: ");
                char ukuran4 = input.next().charAt(0);
                char ukuranBaju4= Character.toUpperCase(ukuran4);
                System.out.println( "LV");
                int hargaBaju4;
                if (ukuranBaju4 == 'S') {
                    hargaBaju4 = 320000;
                } else if (ukuranBaju4 == 'M') {
                    hargaBaju4 = 300000;
                } else {
                    hargaBaju4 = 350000;
                }
                System.out.println("Anda Memilih LV dengan ukuran "+ukuranBaju4+", Tagihan anda adalah "+hargaBaju4);
                break;//membatasi antara yang lain
            case '5' : 
                System.out.print("Masukkan ukuran: ");
                char ukuran5 = input.next().charAt(0);
                char ukuranBaju5= Character.toUpperCase(ukuran5);
                System.out.println( "LV");
                int hargaBaju5;
                if (ukuranBaju5 == 'S') {
                    hargaBaju5 = 100000;
                } else if (ukuranBaju5 == 'M') {
                    hargaBaju5 = 120000;
                } else {
                    hargaBaju5 = 130000;
                }
                System.out.println("Anda Memilih Kick Denim dengan ukuran "+ukuranBaju5+", Tagihan anda adalah "+hargaBaju5);
                break;
            default :
                System.out.println("Kode Baju tidak valid");
                break;
        }
}
}