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
public class Guerrero extends Personaje {
    public Guerrero()
    {
        super("Guerrero",100,30,30,0.8,"combo de golpes");
    }
    
    public void aumentoDefensa()
    {
        Random r = new Random();
        int a = r.nextInt(200);
        if(a>100 && a<135)
        {
            int defensa = this.getDefensa();
            defensa+=1;
            this.setDefensa(defensa);
            double ta = this.getTa();
            ta-=0.02;
            this.setTa(ta);
            System.out.println("Guerrero: Mis habilidades han mejorado... Ya no me podras golpear facilmente");
        }
    }

    @Override
    public void ganador() {
        System.out.println("Guerrero: Ha ganado el mas certero");
    }
}
