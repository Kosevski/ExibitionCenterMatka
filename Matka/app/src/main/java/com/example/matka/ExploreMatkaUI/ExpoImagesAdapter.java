package com.example.matka.ExploreMatkaUI;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.matka.R;

import java.util.ArrayList;

class ExpoImagesAdapter extends RecyclerView.Adapter<ExpoImagesAdapter.ExpoImagesAdapterViewHolder>{
    ArrayList<img_model> img_models;

    public ExpoImagesAdapter(ArrayList<img_model> img_models) {
        this.img_models = img_models;
    }

    @NonNull
    @Override
    public ExpoImagesAdapter.ExpoImagesAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.expo_image_item, parent, false);
        ExpoImagesAdapterViewHolder expoImagesAdapterViewHolder= new ExpoImagesAdapterViewHolder(view);
        return expoImagesAdapterViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ExpoImagesAdapter.ExpoImagesAdapterViewHolder holder, int position) {
        img_model img_model = img_models.get(holder.getAdapterPosition());

        holder.imageView.setImageResource(img_model.imgId);

    }

    @Override
    public int getItemCount() {
        return img_models.size();
    }

    public class ExpoImagesAdapterViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;

        public ExpoImagesAdapterViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image_expo_item);
        }
    }
}
