package com.example.julio.solucion5;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SimpleCursorAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.StringTokenizer;

public class Pantalla3 extends AppCompatActivity {


    /* Declaramos las variables que se necesitan
        para almacenar los valores numéricos que
        tendrá cada una de las bandas de colores
     */
    double banda1r4c, banda2r4c, banda3r4c, banda4r4c, totalr4c;

    String resultado, bandac1, bandac2, bandac3,bandac4;
    private Button mostrar;
    // Declaramos las variables que se necesitan para el arreglo

    public Spinner spin1, spin2, spin3, spin4;
    ArrayAdapter<String> aabanda1, aabanda2, aabanda3, aabanda4;
    String [] opcspin1= new   String [] {"SELECCIONE UN COLOR","NEGRO","CAFÉ", "ROJO","ANARANJADO","AMARILLO","VERDE","AZUL","VIOLETA","GRIS","BLANCO" };
    String [] opcspin2= new   String [] {"SELECCIONE UN COLOR","NEGRO","CAFÉ", "ROJO","ANARANJADO","AMARILLO","VERDE","AZUL","VIOLETA","GRIS","BLANCO" };
    String [] opcspin3= new   String [] {"SELECCIONE UN COLOR","NEGRO","CAFÉ", "ROJO","ANARANJADO","AMARILLO","VERDE","AZUL","VIOLETA","ORO","PLATA" };
    String [] opcspin4= new   String[]  {"SELECCIONE UN COLOR","ORO","PLATA","CAFÉ", "ROJO","VERDE","AZUL","VIOLETA","GRIS","NO COLOR"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla3);

        spin1= (Spinner) findViewById(R.id.spin1);
        spin2= (Spinner) findViewById(R.id.spin2);
        spin3= (Spinner) findViewById(R.id.spin3);
        spin4= (Spinner) findViewById(R.id.spin4);
        mostrar = (Button)findViewById(R.id.btnMostrar);

        final ArrayAdapter<String> aabanda1= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,opcspin1);
        spin1.setAdapter(aabanda1);
        final ArrayAdapter<String> aabanda2= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,opcspin2);
        spin2.setAdapter(aabanda2);
        final ArrayAdapter<String> aabanda3= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,opcspin3);
        spin3.setAdapter(aabanda3);
        final ArrayAdapter<String> aabanda4= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,opcspin4);
        spin4.setAdapter(aabanda4);

        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {

               /* Este switch evalúa cada una de las opciones de colores
                  que puede escoger el usuario en la primera banda que le
                  indican la primera cifra significativa
                */

                switch (i) {

                    case 1:
                        banda1r4c = 0;
                        bandac1 = "NEGRO";
                        spin1.setBackgroundColor(Color.rgb(54, 57, 61));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin1[i] + " " + banda1r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        banda1r4c = 1;
                        bandac1 = "CAFE";
                        spin1.setBackgroundColor(Color.rgb(66,41,24));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin1[i] + " " + banda1r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 3:
                        banda1r4c = 2;
                        bandac1 = "ROJO";
                        spin1.setBackgroundColor(Color.rgb(255,51,51));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin1[i] + " " + banda1r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 4:
                        banda1r4c = 3;
                        bandac1 = "ANARANJADO";
                        spin1.setBackgroundColor(Color.rgb(255,153,51));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin1[i] + " " + banda1r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 5:
                        banda1r4c = 4;
                        bandac1 = "AMARILLO";
                        spin1.setBackgroundColor(Color.rgb(255,255,51));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin1[i] + " " + banda1r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 6:
                        banda1r4c = 5;
                        bandac1 = "VERDE";
                        spin1.setBackgroundColor(Color.rgb(51,255,51));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin1[i] + " " + banda1r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 7:
                        banda1r4c = 6;
                        bandac1 = "AZUL";
                        spin1.setBackgroundColor(Color.rgb(51,51,255));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin1[i] + " " + banda1r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 8:
                        banda1r4c = 7;
                        bandac1 = "VIOLETA";
                        spin1.setBackgroundColor(Color.rgb(255,51,255));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin1[i] + " " + banda1r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 9:
                        banda1r4c = 8;
                        bandac1 = "GRIS";
                        spin1.setBackgroundColor(Color.rgb(160,160,160));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin1[i] + " " + banda1r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 10:
                        banda1r4c = 9;
                        bandac1 = "BLANCO";
                        spin1.setBackgroundColor(Color.rgb(255,255,255));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin1[i] + " " + banda1r4c, Toast.LENGTH_LONG).show();
                        break;
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {

               /* Este switch evalúa cada una de las opciones de colores
                  que puede escoger el usuario en la segunda banda que le
                  indican la segunda cifra significativa
                */
                switch (i) {
                    case 0:
                        banda2r4c = -1;
                        spin2.setBackgroundColor(Color.TRANSPARENT);
                        Toast.makeText(getApplicationContext(), "SELECCIONE UN COLOR  POR FAVOR ", Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        banda2r4c = 0;
                        bandac2 = "NEGRO";
                        spin2.setBackgroundColor(Color.rgb(54,57,61));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin2[i] + " " + banda2r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        banda2r4c = 1;
                        bandac2 = "CAFE";
                        spin2.setBackgroundColor(Color.rgb(66,41,24));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin2[i] + " " + banda2r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 3:
                        banda2r4c = 2;
                        bandac2 = "ROJO";
                        spin2.setBackgroundColor(Color.rgb(255,51,51));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin2[i] + " " + banda2r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 4:
                        banda2r4c = 3;
                        bandac2 = "ANARANJADO";
                        spin2.setBackgroundColor(Color.rgb(255,153,51));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin2[i] + " " + banda2r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 5:
                        banda2r4c = 4;
                        bandac2 = "AMARILLO";
                        spin2.setBackgroundColor(Color.rgb(255,255,51));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin2[i] + " " + banda2r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 6:
                        banda2r4c = 5;
                        bandac2 = "VERDE";
                        spin2.setBackgroundColor(Color.rgb(51,255,51));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin2[i] + " " + banda2r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 7:
                        banda2r4c = 6;
                        bandac2 = "AZUL";
                        spin2.setBackgroundColor(Color.rgb(51,51,255));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin2[i] + " " + banda2r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 8:
                        banda2r4c = 7;
                        bandac2 = "VIOLETA";
                        spin2.setBackgroundColor(Color.rgb(255,51,255));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin2[i] + " " + banda2r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 9:
                        banda2r4c = 8;
                        bandac2 = "GRIS";
                        spin2.setBackgroundColor(Color.rgb(160,160,160));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin2[i] + " " + banda2r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 10:
                        banda2r4c = 9;
                        bandac2 = "BLANCO";
                        spin2.setBackgroundColor(Color.rgb(255,255,255));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin2[i] + " " + banda2r4c, Toast.LENGTH_LONG).show();
                        break;
                }



            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spin3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {

              /* Este switch evalúa cada una de las opciones de colores
                  que puede escoger el usuario en la tercera banda que le
                   indican el multiplicador
                */

                switch (i) {

                    case 1:
                        banda3r4c = 1;
                        bandac3 = "NEGRO";
                        spin3.setBackgroundColor(Color.rgb(54,57,61));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin3[i] + " " + banda3r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        banda3r4c = 10;
                        bandac3 = "CAFE";
                        spin3.setBackgroundColor(Color.rgb(66,41,24));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin3[i] + " " + banda3r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 3:
                        banda3r4c = 100;
                        bandac3 = "ROJO";
                        spin3.setBackgroundColor(Color.rgb(255,51,51));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin3[i] + " " + banda3r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 4:
                        banda3r4c = 1000;
                        bandac3 = "ANARANJADO";
                        spin3.setBackgroundColor(Color.rgb(255,153,51));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin3[i] + " " + banda3r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 5:
                        banda3r4c = 10000;
                        bandac3 = "AMARILLO";
                        spin3.setBackgroundColor(Color.rgb(255,255,51));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin3[i] + " " + banda3r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 6:
                        banda3r4c = 100000;
                        bandac3 = "VERDE";
                        spin3.setBackgroundColor(Color.rgb(51,255,51));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin3[i] + " " + banda3r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 7:
                        banda3r4c = 1000000;
                        bandac3 = "AZUL";
                        spin3.setBackgroundColor(Color.rgb(51,51,255));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin3[i] + " " + banda3r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 8:
                        banda3r4c = 10000000;
                        bandac3 = "VIOLETA";
                        spin3.setBackgroundColor(Color.rgb(255,51,255));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin3[i] + " " + banda3r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 9:
                        banda3r4c = 0.1;
                        bandac3 = "ORO";
                        spin3.setBackgroundColor(Color.rgb(255,215,0));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin3[i] + " " + banda3r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 10:
                        banda3r4c = 0.01;
                        bandac3 = "PLATA";
                        spin3.setBackgroundColor(Color.rgb(192,192,192));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin3[i] + " " + banda3r4c, Toast.LENGTH_LONG).show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spin4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {

                /* Este switch evalúa cada una de las opciones de colores
                  que puede escoger el usuario en la cuarta banda que le indican
                  la tolerancia de la resistencia
                */

                switch (i) {

                    case 1:
                        banda4r4c = 5;
                        bandac4 = "ORO";
                        spin4.setBackgroundColor(Color.rgb(255,215,0));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin4[i] + " " + banda4r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        banda4r4c = 10;
                        bandac4 = "PLATA";
                        spin4.setBackgroundColor(Color.rgb(192,192,192));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin4[i] + " " + banda4r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 3:
                        banda4r4c = 1;
                        bandac4 = "CAFE";
                        spin4.setBackgroundColor(Color.rgb(66,41,24));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin4[i] + " " + banda4r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 4:
                        banda4r4c = 2;
                        bandac4 = "ROJO";
                        spin4.setBackgroundColor(Color.rgb(255,51,51));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin4[i] + " " + banda4r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 5:
                        banda4r4c = 0.5;
                        bandac4 = "VERDE";
                        spin4.setBackgroundColor(Color.rgb(51,255,51));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin4[i] + " " + banda4r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 6:
                        banda4r4c = 0.25;
                        bandac4 = "AZUL";
                        spin4.setBackgroundColor(Color.rgb(51,51,255));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin4[i] + " " + banda4r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 7:
                        banda4r4c = 0.10;
                        bandac4 = "VIOLETA";
                        spin4.setBackgroundColor(Color.rgb(255,51,255));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin4[i] + " " + banda4r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 8:
                        banda4r4c = 0.05;
                        bandac4 = "GRIS";
                        spin4.setBackgroundColor(Color.rgb(160,160,160));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin4[i] + " " + banda4r4c, Toast.LENGTH_LONG).show();
                        break;
                    case 9:
                        banda4r4c = 20;
                        bandac4 = "NO COLOR";
                        spin4.setBackgroundColor(Color.TRANSPARENT);
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspin4[i] + " " + banda4r4c, Toast.LENGTH_LONG).show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




        findViewById(R.id.btncalculo1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalr4c=(((banda1r4c*10)+banda2r4c)*(banda3r4c));
                String arreglo[] = new String[4];
                arreglo[0] = String.valueOf(aabanda1);
                arreglo[1] = String.valueOf(aabanda2);
                arreglo[2] = String.valueOf(aabanda3);
                arreglo[3] = String.valueOf(aabanda4);


                Intent I = new Intent(Pantalla3.this, Pantalla5.class);
                I.putExtra("bandas", arreglo);
                startActivity(I);

            }
        });




        mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalr4c=(((banda1r4c*10)+banda2r4c)*(banda3r4c));
                Toast.makeText(getApplicationContext(), " El resultado es:  "  + totalr4c + "  + /-  "+ banda4r4c + "% de tolerancia", Toast.LENGTH_LONG).show();
            }
        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pantalla3, menu);
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
