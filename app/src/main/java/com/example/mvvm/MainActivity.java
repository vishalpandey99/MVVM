package com.example.mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mvvm.adapters.MovieListAdapter;
import com.example.mvvm.models.MovieModel;
import com.example.mvvm.viewmodels.MovieListViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recview;
    List<MovieModel> movielist;
    MovieListViewModel listViewModel;
    MovieListAdapter adapter;
    TextView noresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recview = findViewById(R.id.recview);
        noresult = findViewById(R.id.noresult);

        recview.setLayoutManager(new LinearLayoutManager(this));
        recview.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        adapter = new MovieListAdapter(movielist);
        recview.setAdapter(adapter);

        listViewModel = new ViewModelProvider(this).get(MovieListViewModel.class);
        listViewModel.getMovielistObserver().observe(this, new Observer<List<MovieModel>>() {
            @Override
            public void onChanged(List<MovieModel> movieModels) {
                if (movieModels!=null){
                    movielist = movieModels;
                    adapter.updatemovielist(movieModels);
                    noresult.setVisibility(View.GONE);
                }
                if (movieModels==null){
                    recview.setVisibility(View.GONE);
                    noresult.setVisibility(View.VISIBLE);
                }
            }
        });

        listViewModel.makeApiCall();

    }
}