/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.joseluisgs.dam;

/**
 *
 * @author david
 */
public class HiloExt extends Thread{
    
    Camello ca=new Camello();
    int avance;

    public HiloExt(String name) {
        this.setName(name);
        while(ca.getPosicion()<100){
            avance=ca.avanzar();
            ca.setPosicion(ca.getPosicion()+avance);
            System.out.println("El "+name+" ha avanzado "+avance+" posiciones y esta en la posición "+ca.getPosicion());
            try {
                Thread.sleep((long) (Math.random()*100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("El "+name+" ha llegado a la meta");
    }
    
    
    
    
    
}
