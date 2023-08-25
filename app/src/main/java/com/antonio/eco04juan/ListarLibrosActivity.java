package com.antonio.eco04juan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.antonio.eco04juan.adapters.LibrosAdapters;
import com.antonio.eco04juan.dao.LibrosDao;

public class ListarLibrosActivity extends AppCompatActivity {

    ListView lvplatos;

    LibrosAdapters adaptador;

    LibrosDao dao = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_libros);

        lvplatos = findViewById(R.id.lvlibros);
        //
        Mostrar_Platos();
        //
        dao.Cargar_LIbros();

        lvplatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView,
                                    View view,
                                    int position,
                                    long l) {

                Intent i = new Intent(
                        ListarLibrosActivity.this,
                        DetalleLibroActivity.class
                );
                //
                i.putExtra("INDICE", position);
                //
                startActivity(i);

            }
        });

    }

    void Mostrar_Platos()
    {

        dao = new LibrosDao();
        //
        adaptador = new LibrosAdapters(
                ListarLibrosActivity.this,
                R.layout.item_libro,
                dao.ListarLIbros()
        );
        //
        lvplatos.setAdapter(adaptador);
    }

    @Override
    protected void onResume() {
        super.onResume();
        //
        Mostrar_Platos();
    }
}