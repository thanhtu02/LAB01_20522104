package com.example.lab1_20522104;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] colors = {"", "", ""};
    ArrayAdapter<String> myAdapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.ListView);
        myAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_expandable_list_item_1, colors)
        {
            @NonNull @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
            {
                View view = super.getView(position, convertView, parent);
                if (position == 0) { view.setBackgroundColor(0xFFFF3300);}
                if(position == 1) { view.setBackgroundColor(0xFFFFFF66);}
                if(position == 2) { view.setBackgroundColor(0xFF03DAC5);}
                return view;
            }
        };
        listView.setAdapter(myAdapter);}
}
