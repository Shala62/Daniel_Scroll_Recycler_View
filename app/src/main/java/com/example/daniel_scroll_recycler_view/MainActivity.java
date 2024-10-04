package com.example.daniel_scroll_recycler_view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }

    public void ScrollView(View view){
        Intent scroll = new Intent(MainActivity.this, MainScrollView.class);
        startActivity(scroll);
    }

    public void Recycler(View view) {
        Intent recycler = new Intent(MainActivity.this, MainRecyclerCardView.class);
        startActivity(recycler);
    }
}