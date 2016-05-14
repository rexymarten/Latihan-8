/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan8;

import java.util.Scanner;

/**
 *
 * @author Rexy 
 */
public class MainBilangan {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Bilangan a=new Bilangan();
        System.out.println("------SELAMAT DATANG------");
        System.out.println("Masukkan Angka :");
        float bil = scn.nextFloat();
        a.setBilangan(bil);
        if(bil % 1==0){
        a.I1();
    }
        else {
        a.D1();
        }

}
}
