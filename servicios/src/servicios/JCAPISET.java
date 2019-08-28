package servicios;

import Clases.CalcularDV;
import Clases.LlamadaServicio;
import Model.SET;


public class JCAPISET extends SET {

    CalcularDV dv = new CalcularDV();
    LlamadaServicio servicio = new LlamadaServicio();
    SET set;


    public JCAPISET(){        
    }
    

    public int DigitoVerificador(String ruc) {
    
        return dv.Pa_Calcular_Dv_11_A(ruc, 11);
    }

    public void DatosSet(String ruc) {
        set = servicio.DatosSET(ruc);        
        this.setDv(set.getDv());
        this.setEstado(set.getEstado());
        this.setNombreCompleto(set.getNombreCompleto());
        this.setRuc(ruc);
        
    } 

}
