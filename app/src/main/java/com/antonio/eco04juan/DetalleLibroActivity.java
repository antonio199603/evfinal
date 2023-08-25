package com.antonio.eco04juan;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.antonio.eco04juan.dao.LibrosDao;
import com.antonio.eco04juan.entity.Libro;
import com.bumptech.glide.Glide;

public class DetalleLibroActivity extends AppCompatActivity {

    TextView tvnompla, tvresumen, tvautor, tvgenero;
    ImageView imglibro;
    LibrosDao dao = null;
    Button btnfavo;
    Boolean estado = false;
    Integer codigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_libro);
        EnlazarControles();
        //
        Intent x = getIntent();
        int idx = x.getIntExtra("INDICE", 0);
        //
        dao = new LibrosDao();
        Libro objpla = dao.ListarLIbros().get(idx);
        //
        codigo = objpla.getCodlibro();
        tvnompla.setText(objpla.getNomlibro()+"");
        tvresumen.setText(objpla.getResumen());
        tvautor.setText(objpla.getAutor());
        tvgenero.setText(objpla.getGenero());

        String url = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fblog.plazavea.com.pe%2Fpreparar-ceviche-peruano%2F&psig=AOvVaw3syn2nqPCqRzwA4QucemKJ&ust=1693015453413000&source=images&cd=vfe&opi=89978449&ved=0CBAQjRxqFwoTCLCf2Zfc9oADFQAAAAAdAAAAABAS";
        Glide.with(this)
                .load(url)
                .into(imglibro);

        btnfavo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                estado = true;
                Libro obj = new Libro(
                        codigo,
                       estado
                );

                //
                AlertDialog.Builder dialogo = new AlertDialog.Builder(DetalleLibroActivity.this);
                //
                dialogo.setTitle("Añadiendo a favorito");
                //

                dialogo.setMessage("¿Esta seguro de añadir a favaritos?");
                //
                dialogo.setIcon(android.R.drawable.ic_menu_upload);
                //
                dialogo.setCancelable(false);
                //
                dialogo.setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        String cadena = dao.Actualizar_Libro(obj);
                        //
                        Toast.makeText(DetalleLibroActivity.this,
                                cadena, Toast.LENGTH_LONG).show();

                    }
                });
                //
                dialogo.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //dialog.dismiss();
                    }
                });
                //
                dialogo.create().show();
                //
            }
        });

    }



    void EnlazarControles(){

        tvnompla = findViewById(R.id.tvNomLibro);
        imglibro = findViewById(R.id.imgLIBRO2);
        tvresumen =  findViewById(R.id.tvRESUMEN);
        btnfavo = findViewById(R.id.btnfavorito);
        tvautor = findViewById(R.id.tvAutor);
        tvgenero = findViewById(R.id.tvGenero);

    }

}