package com.example.fruits;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String []titles = {"Apple","Banana","Grape","Guava","Kiwi","Mango","Orange","Papaya","Pineapple","Pomegranate","Water melon"};
    String []subtitles = {"Sub 1","Sub 2","Sub 3","Sub 4","Sub 5","Sub 6","Sub 7","Sub 8","Sub 9","Sub 10", "Sub 11"};
    int []images = {R.drawable.apple,R.drawable.banana,R.drawable.grape,R.drawable.guava,R.drawable.kiwi,R.drawable.mango,R.drawable.orange,R.drawable.papaya,R.drawable.pomgranate,R.drawable.watermelon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listview = findViewById(R.id.listView);

        ListAdapter adapter = new ListAdapter();

        listview.setAdapter(adapter);
    }

    class ListAdapter extends BaseAdapter
    {
        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.list_item,null);
            ImageView image = view.findViewById(R.id.pic);
            TextView heading = view.findViewById(R.id.title);
            TextView desc = view.findViewById(R.id.subtitle);

            image.setImageResource(images[i]);
            heading.setText(titles[i]);
            desc.setText(subtitles[i]);


            return view;
        }


        /*
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = inflater.inflate(R.layout.list_item,parent,false);
            ImageView image = findViewById(R.id.pic);
            TextView mainTitle = findViewById(R.id.title);
            TextView description = findViewById(R.id.subtitle);

            image.setImageResource(images[position]);
            mainTitle.setText(titles[position]);
            description.setText(subtitles[position]);


            return row;
        }

         */
    }
}
