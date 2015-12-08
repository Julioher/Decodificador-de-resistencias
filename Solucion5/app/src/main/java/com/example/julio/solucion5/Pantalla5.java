package com.example.julio.solucion5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;




public class Pantalla5 extends AppCompatActivity {
    TextView txtb1,txtb2, txtb3,txtb4, txtr;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla5);

        txtb1 = (TextView) findViewById(R.id.bandaUno);
        txtb2 = (TextView) findViewById(R.id.bandaDos);
        txtb3 = (TextView) findViewById(R.id.bandaTre);
        txtb4 = (TextView) findViewById(R.id.bandaCua);
        txtr = (TextView) findViewById(R.id.total);
        String arreglo2[] = new String[5];
        Bundle recuperar = getIntent().getExtras();
        if (recuperar != null) {
            arreglo2 = recuperar.getStringArray("bandas");
        }
        txtb1.setText(arreglo2[0]);
        txtb2.setText(arreglo2[1]);
        txtb3.setText(arreglo2[2]);
        txtb4.setText(arreglo2[3]);
        txtr.setText(arreglo2[4]);

        findViewById(R.id.btnreg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pantalla5.this, Pantalla3.class));
            }
        });


    }



        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pantalla5, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
