package com.example.mvvm.apis;

import com.example.mvvm.models.MovieModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiServices {

    String baseurl = "https://api.omlogistics.co.in/";

    @GET("/branch_networkdir.php")
    Call<List<MovieModel>> getMoviList();

}
