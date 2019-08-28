package Clases;

/**
 * Si alguien modifica esta libreria TE ENCONTRARE Y TE MATARE Y SERA LO ULTIMO QUE TOQUES EN TU VIDA
 * TE DEJARE DE UN MODO EN QUE CAMINARAS SIMPATICO POR EL RESTO DE TU VIDA....
 * @author EL PAKASO MICHI
 */
public class CalcularDV {

    public int Pa_Calcular_Dv_11_A(String p_numero, int p_basemax) {
        int v_total, v_resto, k, v_numero_aux, v_digit;
        String v_numero_al = "";

        for (int i = 0; i < p_numero.length(); i++) {
            char c = p_numero.charAt(i);
            if (Character.isDigit(c)) {
                v_numero_al += c;
            } else {
                v_numero_al += (int) c;
            }
        }

        k = 2;
        v_total = 0;

        for (int i = v_numero_al.length() - 1; i >= 0; i--) {
            k = k > p_basemax ? 2 : k;
            v_numero_aux = v_numero_al.charAt(i) - 48;
            v_total += v_numero_aux * k++;
        }

        v_resto = v_total % 11;
        v_digit = v_resto > 1 ? 11 - v_resto : 0;
        return v_digit;

    }

    public static void main(String[] args) {

    }

}
