package com.example.daniel_scroll_recycler_view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListaAdaptador extends RecyclerView.Adapter<ListaAdaptador.ViewHolder> {

    private List<ListaElementos> mData;
    private LayoutInflater mInflater;
    private Context context;

    public ListaAdaptador(List<ListaElementos> itemList, Context context) {
        this.mData = itemList;
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
    }

    @NonNull
    @Override
    public ListaAdaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.lista_elementos, null);
        return new ListaAdaptador.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ListaAdaptador.ViewHolder holder, final int position) {
        holder.bindData(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void setItems(List<ListaElementos> items){
        mData = items;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iconImage;
        TextView nombre, apellido, ciudad;

        ViewHolder(View itemView){
            super(itemView);
            iconImage = itemView.findViewById(R.id.imgCarita);
            nombre = itemView.findViewById(R.id.txtNombre);
            apellido = itemView.findViewById(R.id.txtApellido);
            ciudad = itemView.findViewById(R.id.txtCiudad);
        }


        void bindData(final ListaElementos item) {
            iconImage.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);
            nombre.setText(item.getNombre());
            apellido.setText(item.getApellido());
            ciudad.setText(item.getCiudad());
        }
    }
}
