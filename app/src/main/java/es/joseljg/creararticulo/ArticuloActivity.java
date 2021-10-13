package es.joseljg.creararticulo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class ArticuloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articulo);
        //---------------------------------------------
        Intent intent = getIntent();
        if(intent != null)
        {
            Articulo a = (Articulo) intent.getSerializableExtra(MainActivity.EXTRA_OBJETO_ARTICULO);
            Toast.makeText(this,a.toString(),Toast.LENGTH_LONG).show();
        }
        else{

        }
    }
}