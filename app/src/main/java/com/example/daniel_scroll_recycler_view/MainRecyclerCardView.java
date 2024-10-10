package com.example.daniel_scroll_recycler_view;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainRecyclerCardView extends AppCompatActivity {

    List<ListaElementos> elementos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_recycler_card_view);

        init();
    }

    public void init(){
        elementos = new ArrayList<>();
        elementos.add(new ListaElementos("Daniel", "Soto", "Temuco", "#775447"));
        elementos.add(new ListaElementos("Rodrigo", "González", "Puente Alto", "#60728b"));
        elementos.add(new ListaElementos("Andrés", "Sotomayor", "Padre Las Casas", "#03a9f4"));
        elementos.add(new ListaElementos("Franco", "Ceballos", "Lican Ray", "#f44336"));
        elementos.add(new ListaElementos("Diego", "González", "Lima", "#009688"));

        ListaAdaptador listaAdaptador = new ListaAdaptador(elementos, this);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listaAdaptador);
    }
}