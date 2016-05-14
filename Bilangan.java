/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan8;

/**
 *
 * @author Rexy
 */
public class Bilangan implements I1,D1 {
    float bilangan;
    public Bil(){
        bilangan=0;
    }
    public Bil(float bilangan){
        this.bilangan=bilangan;
    }
public void setBil(float x){
    bilangan=x;    
    }
public float getBil(){
    return bilangan;
}
    @Override
    public void I1() {
        System.out.println("Integer");
    }
    @Override
    public void D1() {
        System.out.println("Double");
    }
}
