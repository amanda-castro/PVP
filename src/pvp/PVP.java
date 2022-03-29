/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pvp;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author amand
 */
public class PVP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Personajes del juego
        Personaje computadora = new Computadora();
        Caballero caballero = new Caballero();
        Mago mago = new Mago();
        Guerrero guerrero = new Guerrero();
        
        //Variables que almacenan las opciones de los personajes elegidos
        String pers="",opon="",batalla="";
        
        //Variable para almacenar el numero de ronda
        int ronda = 0;
        
        //Escaner para ingresar elementos del menu
        Scanner sc = new Scanner(System.in);
        
        System.out.println("********************");
        System.out.println("Bienvenidos a PVP");
        System.out.println("********************\n\n");
        
        System.out.println("Seleccione su personaje:");
        System.out.println("\tA. Caballero");
        System.out.println("\tB. Guerrero");
        System.out.println("\tC. Mago");
        pers = sc.next();
        
        System.out.println("\nSeleccione su oponente:");
        System.out.println("\tA. Caballero");
        System.out.println("\tB. Guerrero");
        System.out.println("\tC. Mago");
        System.out.println("\tD. Computadora");
        opon  = sc.next();
        
        while(pers.contains(opon))
        {
            System.out.println("El oponente seleccionado no se encuentra disponible... Por favor, elija otro");
            System.out.println("\nSeleccione su oponente:");
            System.out.println("\tA. Caballero");
            System.out.println("\tB. Guerrero");
            System.out.println("\tC. Mago");
            System.out.println("\tD. Computadora");
            opon  = sc.next();
        }
        
        batalla = pers.trim()+opon.trim();
        
        switch(batalla)
        {
            case "AB":
            {
                while(caballero.Estado()&&guerrero.Estado())
                {
                    ronda++;
                    System.out.println("Ronda #"+ronda);
                    if(pelea(caballero.getTa()))
                    {
                        guerrero.Atacado(caballero.getAtaque(), caballero.getTipoA());
                    }else{
                        guerrero.Esquivar();
                    }
                    if(pelea(guerrero.getTa()))
                    {
                        caballero.Atacado(guerrero.getAtaque(), guerrero.getTipoA());
                    }else{
                        caballero.Esquivar();
                    }
                    caballero.aumentoAtaque();
                    caballero.bajarDefensa();
                    guerrero.aumentoDefensa();
                }
                if(caballero.Estado()) caballero.ganador();
                else guerrero.ganador();
                break;
            }
            case "AC":
            {
                while(caballero.Estado()&&mago.Estado())
                {
                    ronda++;
                    System.out.println("Ronda #"+ronda);
                    if(pelea(caballero.getTa()))mago.Atacado(caballero.getAtaque(), caballero.getTipoA());
                    else mago.Esquivar();
                    if(pelea(mago.getTa())) caballero.Atacado(mago.getAtaque(), mago.getTipoA());
                    else caballero.Esquivar();
                    caballero.aumentoAtaque();
                    caballero.bajarDefensa();
                    mago.aumentarSalud();
                }
                if(caballero.Estado()) caballero.ganador();
                else mago.ganador();
                break;
            }
            case "AD":
            {
                while(caballero.Estado()&&computadora.Estado())
                {
                    ronda++;
                    System.out.println("Ronda #"+ronda);
                    if(pelea(caballero.getTa())) computadora.Atacado(caballero.getAtaque(), caballero.getTipoA());
                    else computadora.Esquivar();
                    if(pelea(computadora.getTa())) caballero.Atacado(computadora.getAtaque(), computadora.getTipoA());
                    else caballero.Esquivar();
                    caballero.aumentoAtaque();
                    caballero.bajarDefensa();
                    ((Computadora)computadora).aumentarDefensa();
                }
                if(caballero.Estado()) caballero.ganador();
                else computadora.ganador();
                break;
            }
            case "BA":
            {
                while(caballero.Estado()&&guerrero.Estado())
                {
                    ronda++;
                    System.out.println("Ronda #"+ronda);
                    if(pelea(guerrero.getTa()))
                    {
                        caballero.Atacado(guerrero.getAtaque(), guerrero.getTipoA());
                    }else{
                        caballero.Esquivar();
                    }
                    if(pelea(caballero.getTa()))
                    {
                        guerrero.Atacado(caballero.getAtaque(), caballero.getTipoA());
                    }else{
                        guerrero.Esquivar();
                    }
                    caballero.aumentoAtaque();
                    caballero.bajarDefensa();
                    guerrero.aumentoDefensa();
                }
                if(caballero.Estado()) caballero.ganador();
                else guerrero.ganador();
                break;
            }
            case "BC":
            {
                while(guerrero.Estado()&&mago.Estado())
                {
                    ronda++;
                    System.out.println("Ronda #"+ronda);
                    if(pelea(guerrero.getTa()))mago.Atacado(guerrero.getAtaque(), guerrero.getTipoA());
                    else mago.Esquivar();
                    if(pelea(mago.getTa())) guerrero.Atacado(mago.getAtaque(), mago.getTipoA());
                    else guerrero.Esquivar();
                    guerrero.aumentoDefensa();
                    mago.aumentarSalud();
                }
                if(guerrero.Estado()) guerrero.ganador();
                else mago.ganador();
                break;
            }
            case "BD":
            {
                while(guerrero.Estado()&&computadora.Estado())
                {
                    ronda++;
                    System.out.println("Ronda #"+ronda);
                    if(pelea(guerrero.getTa())) computadora.Atacado(guerrero.getAtaque(), guerrero.getTipoA());
                    else computadora.Esquivar();
                    if(pelea(computadora.getTa())) guerrero.Atacado(computadora.getAtaque(), computadora.getTipoA());
                    else guerrero.Esquivar();
                    guerrero.aumentoDefensa();
                    ((Computadora)computadora).aumentarDefensa();
                }
                if(guerrero.Estado()) guerrero.ganador();
                else computadora.ganador();
                break;
            }
            case "CA":
            {
                while(caballero.Estado()&&mago.Estado())
                {
                    ronda++;
                    System.out.println("Ronda #"+ronda);
                    if(pelea(mago.getTa())) caballero.Atacado(mago.getAtaque(), mago.getTipoA());
                    else caballero.Esquivar();
                    if(pelea(caballero.getTa()))mago.Atacado(caballero.getAtaque(), caballero.getTipoA());
                    else mago.Esquivar();
                    caballero.aumentoAtaque();
                    caballero.bajarDefensa();
                    mago.aumentarSalud();
                }
                if(caballero.Estado()) caballero.ganador();
                else mago.ganador();
                break;
            }
            case "CB":
            {
                while(guerrero.Estado()&&mago.Estado())
                {
                    ronda++;
                    System.out.println("Ronda #"+ronda);
                    if(pelea(mago.getTa())) guerrero.Atacado(mago.getAtaque(), mago.getTipoA());
                    else guerrero.Esquivar();
                    if(pelea(guerrero.getTa()))mago.Atacado(guerrero.getAtaque(), guerrero.getTipoA());
                    else mago.Esquivar();
                    guerrero.aumentoDefensa();
                    mago.aumentarSalud();
                }
                if(guerrero.Estado()) guerrero.ganador();
                else mago.ganador();
                break;
            }
            case "CD":
            {
                while(mago.Estado()&&computadora.Estado())
                {
                    ronda++;
                    System.out.println("Ronda #"+ronda);
                    if(pelea(mago.getTa())) computadora.Atacado(mago.getAtaque(), mago.getTipoA());
                    else computadora.Esquivar();
                    if(pelea(computadora.getTa())) mago.Atacado(computadora.getAtaque(), computadora.getTipoA());
                    else mago.Esquivar();
                    mago.aumentarSalud();
                    ((Computadora)computadora).aumentarDefensa();
                }
                if(mago.Estado()) mago.ganador();
                else computadora.ganador();
                break;
            }
            default:
            {
                System.out.println("Lo sentimos... Las opciones que has ingresado por el momento no se encuentran disponibles");
                break;
            }
        }
    }
    
    //Metodo para realizar pelea
    public static boolean pelea(double _ta)
    {
        boolean flag = false;
        
        Random n = new Random();
        int a = n.nextInt(100);
        
        if(a<(int)(_ta*100)) flag = true;
        return flag;
    }
    
}
