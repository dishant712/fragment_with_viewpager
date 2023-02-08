package com.example.fragment_with_viewpager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class chatrecycleadapter extends RecyclerView.Adapter<chatrecycleadapter.myclass>{

    chats chats;
    String[] name={"Dishant Virani","Khush Patel ","Jash Gohil","Harsh Khunt","Div Italiya"," Keval Butani"};
    public  static  int[] dp ={R.drawable.profile,R.drawable.profile,R.drawable.profile,R.drawable.profile,R.drawable.profile,R.drawable.profile};



    public chatrecycleadapter(chats chats) {
        this.chats=chats;
    }

    @NonNull
    @Override
    public  myclass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(chats.getContext()).inflate(R.layout.one_item,parent,false);
        myclass m = new myclass(view);

        return m;
    }

    class myclass extends RecyclerView.ViewHolder {

        TextView textView;
        ImageView  imageView;
        public myclass(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.chat_txt_item);
            imageView=itemView.findViewById(R.id.chat_img_item);

        }
    }

    @Override
    public void onBindViewHolder(@NonNull  myclass holder, int position) {

        holder.textView.setText(name[position]);
        holder.imageView.setImageResource(dp[position]);


    }

    @Override
    public int getItemCount() {
        return name.length;
    }
}
