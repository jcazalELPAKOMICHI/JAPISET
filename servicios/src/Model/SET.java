package Model;

public class SET {

    private String ruc;
    private int dv;
    private String estado;
    private String nombreCompleto;

    public SET(){
        
    }
    
    public SET(String ruc, int dv, String estado, String nombreCompleto) {
        this.ruc = ruc;
        this.dv = dv;
        this.estado = estado;
        this.nombreCompleto = nombreCompleto;
    }

    
    
    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public int getDv() {
        return dv;
    }

    public void setDv(int dv) {
        this.dv = dv;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    @Override
    public String toString() {
        return "SET{" + "ruc=" + ruc + ", dv=" + dv + ", estado=" + estado + ", nombreCompleto=" + nombreCompleto + "}";
    }

    
    
}
