package Clases;


import Model.SET;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface Service {
   @GET("contribuyente/estado") 
   Call<SET> getDatos(@Query("ruc")String ruc);
   
}
