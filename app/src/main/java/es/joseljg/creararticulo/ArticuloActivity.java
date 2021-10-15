package es.joseljg.creararticulo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ArticuloActivity extends AppCompatActivity {

    private TextView txt_titulo = null;
    private TextView txt_descripcion = null;
    private TextView txt_contenido = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articulo);
        //---------------------------------------------

        txt_titulo = (TextView) findViewById(R.id.txt_titulo);
        txt_descripcion = (TextView) findViewById(R.id.txt_descripcion);
        txt_contenido = (TextView) findViewById(R.id.txt_contenido);
        //--------------------------------------------------------------------

        Intent intent = getIntent();
        if(intent != null)
        {
            Articulo a = (Articulo) intent.getSerializableExtra(MainActivity.EXTRA_OBJETO_ARTICULO);
            String nombre = a.getNombre();
            String descripcion = a.getDescripcion();
            String contenido = a.getContenido();

            txt_titulo.setText(nombre);
            txt_descripcion.setText(descripcion);
            txt_contenido.setText(contenido);

            Toast.makeText(this,a.toString(),Toast.LENGTH_LONG).show();
        }
        else{

        }
    }
}