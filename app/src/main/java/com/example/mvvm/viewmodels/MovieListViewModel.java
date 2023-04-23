package com.example.mvvm.viewmodels;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvm.apis.ApiServices;
import com.example.mvvm.apis.RetrofitInstance;
import com.example.mvvm.models.MovieModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MovieListViewModel extends ViewModel {

    private MutableLiveData<List<MovieModel>> movielist;

    public MovieListViewModel(){
        movielist = new MutableLiveData<>();
    }

    public MutableLiveData<List<MovieModel>> getMovielistObserver(){
        return movielist;
    }
    public void makeApiCall(){

        ApiServices apiServices = RetrofitInstance.getInstance().getMyApi();
        Call<List<MovieModel>> call = apiServices.getMoviList();
        call.enqueue(new Callback<List<MovieModel>>() {
            @Override
            public void onResponse(Call<List<MovieModel>> call, Response<List<MovieModel>> response) {
                movielist.postValue(response.body());
            }

            @Override
            public void onFailure(Call<List<MovieModel>> call, Throwable t) {

                movielist.postValue(null);
                Log.e("Error :",t.getMessage().toString());
            }
        });
    }
}
