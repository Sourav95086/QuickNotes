package com.NextGenius.quicknotes;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> implements Filterable {

    Context context;
    ArrayList<ModalClass> arrayList;

    ArrayList<Integer> colorList = new ArrayList<>(Arrays.asList(
            Color.parseColor("#fd99ff"),
            Color.parseColor("#ff9ea0"),
            Color.parseColor("#94f590"),
            Color.parseColor("#fff599"),
            Color.parseColor("#9efffd")
    ));

    FilteredClass filteredClass;
    ArrayList<ModalClass> data;



    RecyclerAdapter( Context context ,  ArrayList<ModalClass> arrayList ){
        this .context = context;
        this.arrayList = arrayList;
        this.data= arrayList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.single_note_row,parent , false);
        ViewHolder  view = new ViewHolder(v);
        return view;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(arrayList.get(position).title);

        Random random = new Random();
        int randomNumber = random.nextInt(5);

        GradientDrawable drawable = (GradientDrawable) holder.card_bg_holder.getBackground();
        drawable.setColor(colorList.get(randomNumber));


        setAnimation(holder.itemView,position);


        holder.linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               ModalClass mc = arrayList.get(position);
                Intent intent = new Intent(context , UpdateAndDeleteActivity.class);

                intent.putExtra("id",mc.sl_no);
                intent.putExtra("title",mc.title);
                intent.putExtra("note",mc.note);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    @Override
    public Filter getFilter() {

        if(filteredClass==null){
            filteredClass = new FilteredClass(data,this);
        }
        return filteredClass;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        LinearLayout linear;
        CardView cardview;
        LinearLayout card_bg_holder;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.titlview);
            linear = itemView.findViewById(R.id.row);
            cardview = itemView.findViewById(R.id.card);

            card_bg_holder = itemView.findViewById(R.id.card_bg_holder);

        }
    }
    private void setAnimation (View view , int position) {

    Animation slideIn = AnimationUtils.loadAnimation(context , android.R.anim.slide_in_left);
    view.startAnimation(slideIn);

    }
}
