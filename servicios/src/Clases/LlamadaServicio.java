package Clases;

import Model.SET;
import com.google.gson.Gson;
import java.io.IOException;

import java.util.logging.Level;
import java.util.logging.Logger;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LlamadaServicio {

    public LlamadaServicio() {

    }
    SET set;

    public SET DatosSET(String ruc) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://servicios.set.gov.py/eset-publico/")
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build();

        Service service = retrofit.create(Service.class);

        try {
            Call<SET> call = service.getDatos(ruc);
            set = call.execute().body();
            System.out.println(set.toString());
        } catch (IOException ex) {
            Logger.getLogger(LlamadaServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return set;
    }

}
