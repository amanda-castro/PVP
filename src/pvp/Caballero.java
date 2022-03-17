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
public class Caballero extends Personaje{
    
    public Caballero()
    {
        super("Caballero",125,20,35,0.6,"corte con espada");
    }
    
    public void aumentoAtaque()
    {
        Random r = new Random();
        int a = r.nextInt(200);
        if(a>100&&a<150&&this.getSalud()<=50)
        {
            int ataque = this.getAtaque();
            ataque+=3;
            this.setAtaque(ataque);
            
            System.out.println("Pobre iluso... Creisteis que me habiais derrotado");
            System.out.println("Con tus debiles ataques solo habeis logrado que aumente mi poder");
        }
    }
    
    
}
