/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pvp;

/**
 *
 * @author amand
 */
public class Personaje {
    private String nombre ;
    private int salud ;
    private int ataque;
    private int defensa;
    private double ta;
    
    public Personaje()
    {
        String nombre = "Computadora";
        int salud =200;
        int ataque=30;
        int defensa=20;
        double ta=0.5;
    }
    
    public Personaje(String _nombre)
    {
      this.nombre = _nombre;  
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public void setNombre(String _nombre)
    {
        this.nombre=_nombre;
    }
    
    public int getSalud()
    {
        return this.salud;
    }
    
    public void setSalud(int _salud)
    {
        this.salud = _salud;
    }
    
    public int getAtaque()
    {
        return this.ataque;
    }
    
    public void setAtaque(int _ataque)
    {
        this.ataque = _ataque;
    }
    
    public int getDefensa()
    {
        return this.defensa;
    }
    
    public void setDefensa(int _defensa)
    {
        this.defensa = _defensa;
    }
    
    public double getTa()
    {
        return this.ta;
    }
    
    public void setTa(double _ta)
    {
        this.ta = _ta;
    }
    
    public void Atacado(int _ataque)
    {
        int danho = _ataque-this.defensa;
        int vidaRestante=this.salud;
        if(danho>0){
            vidaRestante-=danho;
            System.out.println(this.nombre+" ha recibido un golpe... Ha perdido "+danho+" puntos de vida");
        }else{
            System.out.println(this.nombre+" recibio un golpe muy debil... Levantate y ataca");
        }
        this.salud = vidaRestante;
        System.out.println(this.nombre+" tiene "+this.salud+" puntos de vida restante");
    }
    
    
    public void Esquivar()
    {
        System.out.println(this.nombre+" logro esquivar el golpe.... Miss");
    }
    
    //Este metodo devuelve verdadero si el personaje sigue con vida
    public boolean Estado()
    {
        boolean vida = true;
        if(this.salud<=0) vida=false;
        return vida;
    }
}
