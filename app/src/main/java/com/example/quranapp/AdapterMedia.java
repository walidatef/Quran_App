package com.example.quranapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterMedia extends BaseAdapter {

    ArrayList<InfoQuran> arrayList;
    Context context;

    public AdapterMedia() {
    }

    public AdapterMedia(Context c, ArrayList<InfoQuran> array) {
        this.arrayList = array;
        this.context = c;

    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public InfoQuran getItem(int i) {

        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        if (view == null) {
            v = LayoutInflater.from(context).inflate(R.layout.media_view, null, false);
        }
        TextView textView1 = v.findViewById(R.id.media_name);
        TextView textView2 = v.findViewById(R.id.artist_media);
        ImageView imageView = v.findViewById(R.id.image_media);

        textView1.setText(getItem(i).getSoraName());
        textView2.setText(getItem(i).getSheikhName());
        imageView.setImageResource(getItem(i).getMediaImage());

        return v;
    }
}
