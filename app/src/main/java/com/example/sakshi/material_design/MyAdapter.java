package com.example.sakshi.material_design;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by sakshi on 7/22/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    //MyAdapter class extending the recyclerview.adapter
    private ArrayList<String> list;
    private Context context;
    //declaring list and context
    //parametrized constructor wiith context and arraylist as parameters
    public MyAdapter(Context context,ArrayList<String> list) {
        super();
        this.list = list;
        this.context = context;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating the row layout
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        //setting this view to viewholder
        ViewHolder viewholder = new ViewHolder(view);
        //returning view holder
        return viewholder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //setting textview
        holder.textview.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        //returning size of list
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public CardView cardview;
        public TextView textview;
        public ViewHolder(View itemView) {

            super(itemView);
            //associating cardlayout and Textview from row.XML
            textview = (TextView)itemView.findViewById(R.id.textview);
            cardview = (CardView)itemView.findViewById(R.id.cardlayout);
        }
    }
}
