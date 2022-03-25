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
public abstract class Personaje {
    private String nombre ;
    private int salud ;
    private int ataque;
    private int defensa;
    private double ta;
    private String tipoA;
    
    public Personaje()
    {
        String nombre = "Computadora";
        salud =200;
        ataque=30;
        defensa=20;
        ta=0.5;
        tipoA = "golpe con disco duro";
    }
    
    public Personaje(String _nombre, int _salud, int _ataque, int _defensa, double _ta, String _tipo)
    {
      this.nombre = _nombre;  
      salud = _salud;
      ataque=_ataque;
      defensa=_defensa;
      ta=_ta;
      tipoA = _tipo;
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
    
    public String getTipoA()
    {
        return this.tipoA;
    }
    
    public void Atacado(int _ataque, String _tipo)
    {
        int danho = _ataque-this.defensa;
        int vidaRestante=this.salud;
        if(danho>0){
            vidaRestante-=danho;
            System.out.println(this.nombre+" ha recibido un "+_tipo+"... Ha perdido "+danho+" puntos de vida");
        }else{
            System.out.println(this.nombre+" recibio un "+_tipo+" muy debil... Levantate y ataca");
        }
        if(vidaRestante<0) vidaRestante =0;
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
    
    // Metodo abstracto que se ejecuta al ganar el juego
    public abstract void ganador();
}
