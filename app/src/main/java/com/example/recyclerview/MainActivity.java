package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Model> movies =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //создание списка вызываем метод setData
        setData();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        //меняет вертикальную прокрутку на горизонтальную
        recyclerView.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, true));
        //создаём адаптер
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, movies);
        //устанавливаем адаптер в RecyclerView
        recyclerView.setAdapter(adapter);
    }

    private void setData() {
        movies.add(new Model(R.drawable.odin, "Original"));
        movies.add(new Model(R.drawable.dva, "HYPERDESK"));
        movies.add(new Model(R.drawable.tri, "VOLT"));
        movies.add(new Model(R.drawable.chetire, "STATION"));
    }
}