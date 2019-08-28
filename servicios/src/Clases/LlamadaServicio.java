package Clases;

import Model.SET;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
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
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Service service = retrofit.create(Service.class);
        Call<SET> call = service.getDatos(ruc);

        call.enqueue(new Callback<SET>() {
            @Override
            public void onResponse(Call<SET> call, Response<SET> rspns) {
                switch (rspns.code()) {
                    case 200:
                        set = rspns.body();
                        LOGGER.log(Level.INFO, set.toString());
                         {
                            try {
                                finalize();
                            } catch (Throwable ex) {
                                Logger.getLogger(LlamadaServicio.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                    case 401:

                        break;
                    default:

                        break;
                }
            }

            @Override
            public void onFailure(Call<SET> call, Throwable thrwbl) {
                LOGGER.log(Level.WARNING, thrwbl.toString());
            }
        });

        return set;
    }

}
