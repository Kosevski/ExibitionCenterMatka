package com.example.matka.ExploreMatkaUI;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.matka.R;

class ViewPagerAdapter extends PagerAdapter {

    Context context;
    int [] imageViewVPExpo;
    String [] naslovVPExpo, textbodyVPExpo;
    LayoutInflater layoutInflater;



    public ViewPagerAdapter(Context context, int[] expo_slika_vp, String[] expo_naslov_vp, String[] expo_textbody_vp) {
        this.context = context;
        this.imageViewVPExpo = expo_slika_vp;
        this.naslovVPExpo = expo_naslov_vp;
        this.textbodyVPExpo = expo_textbody_vp;
    }

    @Override
    public int getCount() {
        return naslovVPExpo.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == ((LinearLayout) object );
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        ImageView img;
        TextView naslov, text;

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = layoutInflater.inflate(R.layout.view_pager_expo_item, container, false);

        img = itemView.findViewById(R.id.slika_vp);
        text = itemView.findViewById(R.id.text_body_vp);
        naslov = itemView.findViewById(R.id.naslov_vp);

        naslov.setText(naslovVPExpo[position]);
        text.setText(textbodyVPExpo[position]);
        img.setImageResource(imageViewVPExpo[position]);

        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout) object);
    }
}
