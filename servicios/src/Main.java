
import servicios.Servicios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josec
 */
public class Main {
    public static void main(String[] args) {
          Servicios sev = new Servicios();
        
        sev.DatosSet("5183637");
        
        System.out.println(sev.getRuc());
        System.out.println(sev.getNombreCompleto());
    }
}
