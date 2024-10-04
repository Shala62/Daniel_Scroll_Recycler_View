package com.example.daniel_scroll_recycler_view;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainScrollView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_scroll_view);

    }

    public void Seleccion(View View){
        String cadena = getResources().getResourceEntryName(View.getId());
        Toast.makeText(this, "Este puchen esta respresentando un " + cadena, Toast.LENGTH_SHORT).show();
    }
}