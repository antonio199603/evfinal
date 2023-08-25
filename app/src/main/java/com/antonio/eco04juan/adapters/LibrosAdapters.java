package com.antonio.eco04juan.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.antonio.eco04juan.R;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.antonio.eco04juan.entity.Libro;
import com.bumptech.glide.Glide;

import java.util.List;

public class LibrosAdapters extends ArrayAdapter<Libro> {

    Context micontexto;
    int milayout;
    List<Libro> milista;


    public LibrosAdapters(@NonNull Context context,
                          int resource,
                          @NonNull List<Libro> objects) {
        super(context, resource, objects);

        micontexto = context;
        milayout = resource;
        milista = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        convertView = LayoutInflater.from(micontexto).inflate(milayout, null);
        //
        Libro libro = milista.get(position);
        //
        TextView tv1 = convertView.findViewById(R.id.tvLIBRO1);
        TextView tv2 = convertView.findViewById(R.id.tvLIBRO2);
        TextView tv3 = convertView.findViewById(R.id.tvLIBRO3);
        //
        ImageView img = convertView.findViewById(R.id.imgIMAGEN);
        //
        tv1.setText(libro.getNomlibro());
        tv2.setText("Autor: " + libro.getAutor());
        tv3.setText("Genero: " + libro.getGenero());
        //
        /*Glide.with(micontexto)
                .load(libro.getImgurl())
                .into(img);*/
        img.setImageResource(obtener_Id_Imagen(libro.getCodlibro()));
        //
        return convertView;
    }

    int obtener_Id_Imagen(int codigo)
    {
        String nom_imagen = "p" + codigo;
        String recurso = "drawable";
        String paquete = getContext().getPackageName();
        //
        int resultado =
                getContext().getResources()
                        .getIdentifier(nom_imagen, recurso, paquete);
        //
        return resultado;
    }

}
