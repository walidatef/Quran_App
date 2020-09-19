package com.example.quranapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<InfoQuran> arrayList = new ArrayList<>();


        arrayList.add(new InfoQuran("سورة المزمل", " ياسر الدوسرى ", R.raw.elmozml, R.drawable.quran_1));
        arrayList.add(new InfoQuran("سورة يس", " ياسر الدوسرى", R.raw.yassen, R.drawable.quran_1));
        arrayList.add(new InfoQuran("سورة القمر", " المنشاوى", R.raw.alqamar, R.drawable.quran_1));
        arrayList.add(new InfoQuran(" سورة النحل", " المنشاوى", R.raw.alnahl, R.drawable.quran_1));
        arrayList.add(new InfoQuran(" سورة مريم", " المنشاوى", R.raw.maryam, R.drawable.quran_1));
        arrayList.add(new InfoQuran(" سورة الاحزاب", " المنشاوى", R.raw.alahzab, R.drawable.quran_1));
        arrayList.add(new InfoQuran(" سورة الفتح", " المنشاوى", R.raw.alfath, R.drawable.quran_1));
        arrayList.add(new InfoQuran(" سورةالقلم", " المنشاوى", R.raw.alqalam, R.drawable.quran_1));

        AdapterMedia adapterMedia = new AdapterMedia(MainActivity.this, arrayList);

        ListView listView = findViewById(R.id.list_items);

        listView.setAdapter(adapterMedia);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                InfoQuran infoQuran = (InfoQuran) adapterView.getAdapter().getItem(i);


                Intent intent = new Intent(MainActivity.this, DetailsMedia.class);

                intent.putExtra("MEDIA_SOURA", infoQuran.getMediaSora());
                intent.putExtra("SORA_NAME", infoQuran.getSoraName());


                startActivity(intent);


            }
        });


    }
}