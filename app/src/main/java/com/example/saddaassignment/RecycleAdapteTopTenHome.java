package com.example.saddaassignment;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

//import ModelClasses.TopTenModelClass;


/**
 * Created by Rp on 6/14/2016.
 */
public class RecycleAdapteTopTenHome extends RecyclerView.Adapter<RecycleAdapteTopTenHome.MyViewHolder> {
    Context context;


    private List<TopTenModelClass> moviesList;




    public class MyViewHolder extends RecyclerView.ViewHolder {



        ImageView image;
        TextView title,type;
//        LinearLayout linear;


        public MyViewHolder(View view) {
            super(view);

            image = (ImageView) view.findViewById(R.id.image);
            title = (TextView)view.findViewById(R.id.title);
            type = (TextView)view.findViewById(R.id.type);



        }

    }


    public RecycleAdapteTopTenHome(Context context, List<TopTenModelClass> moviesList) {
        this.moviesList = moviesList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_top_ten_list, parent, false);


        return new MyViewHolder(itemView);


    }


    @Override
    public void onBindViewHolder(final MyViewHolder holder,final int position) {
        TopTenModelClass movie = moviesList.get(position);
        holder.image.setImageResource(movie.getImage());
        holder.title.setText(movie.getTitle());
        holder.type.setText(movie.getType());




    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }



}





