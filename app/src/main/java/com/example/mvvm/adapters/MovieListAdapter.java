package com.example.mvvm.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvvm.R;
import com.example.mvvm.models.MovieModel;

import java.util.List;

public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.myviewholder> {

    List<MovieModel> movielist;

    public MovieListAdapter(List<MovieModel> list){

        this.movielist = list;
    }

    public void updatemovielist(List<MovieModel> list){

        this.movielist = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public MovieListAdapter.myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerowdesign,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieListAdapter.myviewholder holder, int position) {

        holder.txtBranchCode.setText(movielist.get(position).getBranchCode());
        holder.txtBranchName.setText(movielist.get(position).getBranchName());
        holder.txtCityName.setText(movielist.get(position).getCityName());
        holder.txtBranchState.setText(movielist.get(position).getBranchState());
        holder.txtBranchPhone.setText(movielist.get(position).getBranchPhone());
        holder.txtBranchEmail.setText(movielist.get(position).getBranchEmail());
        holder.txtBranchContactPerson.setText(movielist.get(position).getBranchContactPerson());
        holder.txtBranchContactNumber.setText(movielist.get(position).getBranchContactNumber());
        holder.txtMobileNumber.setText(movielist.get(position).getBranchMobileNumber());
        holder.txtBranchEmailId.setText(movielist.get(position).getBranchEmailId());
        holder.txtRanchLATI.setText(movielist.get(position).getBranchLATI());
        holder.txtBranchLong.setText(movielist.get(position).getBranchLong());
        holder.txtBranchAddress.setText(movielist.get(position).getBranchAddress());

    }

    @Override
    public int getItemCount() {

        if (this.movielist!=null){
            return this.movielist.size();
        }
        else
        {
            return 0;
        }

    }

    public class myviewholder extends RecyclerView.ViewHolder {

        TextView txtBranchCode,txtBranchName,txtCityName,txtBranchState,txtBranchPhone,txtBranchEmail,
                txtBranchContactPerson,txtBranchContactNumber,txtMobileNumber,txtBranchEmailId,
                txtRanchLATI,txtBranchLong,txtBranchAddress;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            txtBranchCode = itemView.findViewById(R.id.txtBranchCode);
            txtBranchName = itemView.findViewById(R.id.txtBranchName);
            txtCityName = itemView.findViewById(R.id.txtCityName);
            txtBranchState = itemView.findViewById(R.id.txtBranchState);
            txtBranchPhone = itemView.findViewById(R.id.txtBranchPhone);
            txtBranchEmail = itemView.findViewById(R.id.txtBranchEmail);
            txtBranchContactPerson = itemView.findViewById(R.id.txtBranchContactPerson);
            txtBranchContactNumber = itemView.findViewById(R.id.txtBranchContactNumber);
            txtMobileNumber = itemView.findViewById(R.id.txtMobileNumber);
            txtBranchEmailId = itemView.findViewById(R.id.txtBranchEmailId);
            txtRanchLATI = itemView.findViewById(R.id.txtRanchLATI);
            txtBranchLong = itemView.findViewById(R.id.txtBranchLong);
            txtBranchAddress = itemView.findViewById(R.id.txtBranchAddress);
        }
    }
}
