package es.joseljg.creararticulo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_OBJETO_ARTICULO = "es.joseljg.MainActivity.articulo" ;
    private EditText edt_nombre_alta = null;
    private EditText edt_descripcion_alta = null;
    private EditText edt_contenido_alta = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_nombre_alta = (EditText) findViewById(R.id.edt_nombre_alta);
        edt_descripcion_alta = (EditText) findViewById(R.id.edt_descripcion_alta);
        edt_contenido_alta = (EditText) findViewById(R.id.edt_texto_alta);
    }


    public void crearArticulo(View view) {
        String nombre = String.valueOf(edt_nombre_alta.getText());
        String descripcion = String.valueOf(edt_descripcion_alta.getText());
        String contenido = String.valueOf(edt_contenido_alta.getText());
        Articulo a = new Articulo(nombre, descripcion, contenido);
       //--------------------------------------------------------------------------
        Intent intent = new Intent(this,ArticuloActivity.class);
        intent.putExtra(EXTRA_OBJETO_ARTICULO,a);
        startActivity(intent);
    }
}
