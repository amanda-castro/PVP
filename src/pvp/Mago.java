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
public class Mago extends Personaje{
    public Mago()
    {
        super("Mago",75,40,20,0.7,"hechizo");//Llamado de metodo constructor con parametros
        
    }
    
    public void aumentarSalud()
    {
        Random r = new Random();
        int a = r.nextInt(200);
        if(a<50&&((double) super.getSalud()/75.0)<0.5)
        {
            int salud = this.getSalud();
            salud += 8;
            super.setSalud(salud);
            System.out.println("Cur interpretaris");
            System.out.println("Mi hechizo ha funcionado... Estoy mas fuerte");
        }
    }
}
