/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pvp;

import java.util.Random;

/**
 *
 * @author amand
 */
public final class Computadora extends Personaje {
    
    private int vidaTotal;
    
    public Computadora()
    {
        super("Computadora",200,30,20,0.5,"golpe con disco duro");// Llamado al metodo constructor que no tiene parametros;
        this.vidaTotal = super.getSalud();// Usamos super para llamar al metodo getSalud()
    }
    
    public void aumentarDefensa()
    {
        Random r = new Random();
        int a = r.nextInt(200);
        if(a>150&&((double)super.getSalud()/(double) this.vidaTotal)<=0.20)
        {
            int defensa = super.getDefensa();
            defensa += 1;
            super.setDefensa(defensa);
            System.out.println("Computadora: Consegui un antivirus nuevo... Ahorita soy imparable");
        }
    }

    @Override
    public void ganador() {
        System.out.println("Computadora: Miedo, adoracion y suplica... Todas ellas son reacciones validas");
    }
    
}
