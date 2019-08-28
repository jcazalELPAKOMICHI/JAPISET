package servicios;

import Clases.CalcularDV;
import Clases.LlamadaServicio;
import Model.SET;
import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
import java.util.logging.Level;

public class Servicios extends SET {

    CalcularDV dv = new CalcularDV();
    LlamadaServicio servicio = new LlamadaServicio();
    SET set;


    public Servicios(){        
    }
    

    public int DigitoVerificador(String ruc) {
        LOGGER.log(Level.INFO, "El RUC " + ruc + " posee el Digito Verificador Es " + dv.Pa_Calcular_Dv_11_A(ruc, 11));
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
