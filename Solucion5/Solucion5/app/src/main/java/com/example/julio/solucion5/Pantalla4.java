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
import android.widget.Spinner;
import android.widget.Toast;

public class Pantalla4 extends AppCompatActivity {

    int banda1r5c;
    int banda2r5c;
    int banda3r5c;
    double banda4r5c;
    double banda5r5c;
    double totalr5c ;
    String bandac1, bandac2, bandac3,bandac4, bandac5;

    private Button mostrar;

    //Declaramos las variables que se necesitan para el arreglo
    public Spinner spinb1,spinb2, spinb3, spinb4, spinb5;

    ArrayAdapter<String> aaba1,aaba2, aaba3, aaba4, aaba5;
    String[] opcspinb1= new String[] {"SELECCIONE UN COLOR","NEGRO","CAFÉ", "ROJO","ANARANJADO","AMARILLO","VERDE","AZUL","VIOLETA","GRIS","BLANCO" };
    String[] opcspinb2= new String[] {"SELECCIONE UN COLOR","NEGRO","CAFÉ", "ROJO","ANARANJADO","AMARILLO","VERDE","AZUL","VIOLETA","GRIS","BLANCO" };
    String[] opcspinb3= new String[] {"SELECCIONE UN COLOR","NEGRO","CAFÉ", "ROJO","ANARANJADO","AMARILLO","VERDE","AZUL","VIOLETA","GRIS","BLANCO" };
    String[] opcspinb4= new String[] {"SELECCIONE UN COLOR","ORO","PLATA","NEGRO","CAFÉ", "ROJO","ANARANJADO","AMARILLO","VERDE","AZUL","VIOLETA" };
    String []opcspinb5= new String[] {"SELECCIONE UN COLOR","ORO","PLATA","CAFÉ", "ROJO","VERDE","AZUL","VIOLETA","GRIS","NO COLOR"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla4);

        spinb1 = (Spinner) findViewById (R.id.spinb1);
        spinb2= (Spinner) findViewById(R.id.spinb2);
        spinb3= (Spinner) findViewById (R.id.spinb3);
        spinb4= (Spinner) findViewById(R.id.spinb4);
        spinb5= (Spinner) findViewById(R.id.spinb5);

        ArrayAdapter<String> aaba1= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,opcspinb1);
        spinb1.setAdapter(aaba1);
        ArrayAdapter<String> aaba2= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,opcspinb2);
        spinb2.setAdapter(aaba2);
        ArrayAdapter<String> aaba3= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,opcspinb3);
        spinb3.setAdapter(aaba3);
        ArrayAdapter<String> aaba4= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,opcspinb4);
        spinb4.setAdapter(aaba4);
        ArrayAdapter<String> aaba5= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,opcspinb5);
        spinb5.setAdapter(aaba5);

        spinb1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                switch (i) {
                    case 1:
                        banda1r5c = 0;
                        bandac1 = "NEGRO";
                        spinb1.setBackgroundColor(Color.rgb(54, 57, 61));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb1[i] + " " + banda1r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        banda1r5c = 1;
                        bandac1 = "CAFE";
                        spinb1.setBackgroundColor(Color.rgb(66, 41, 24));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb1[i] + " " + banda1r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 3:
                        banda1r5c = 2;
                        bandac1 = "ROJO";
                        spinb1.setBackgroundColor(Color.rgb(255, 51, 51));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb1[i] + " " + banda1r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 4:
                        banda1r5c = 3;
                        bandac1 = "ANARANJADO";
                        spinb1.setBackgroundColor(Color.rgb(255, 153, 51));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb1[i] + " " + banda1r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 5:
                        banda1r5c = 4;
                        bandac1 = "AMARILLO";
                        spinb1.setBackgroundColor(Color.rgb(255, 255, 51));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb1[i] + " " + banda1r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 6:
                        banda1r5c = 5;
                        bandac1 = "VERDE";
                        spinb1.setBackgroundColor(Color.rgb(51, 255, 51));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb1[i] + " " + banda1r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 7:
                        banda1r5c = 6;
                        bandac1 = "AZUL";
                        spinb1.setBackgroundColor(Color.rgb(51, 51, 255));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb1[i] + " " + banda1r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 8:
                        banda1r5c = 7;
                        bandac1 = "VIOLETA";
                        spinb1.setBackgroundColor(Color.rgb(255, 51, 255));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb1[i] + " " + banda1r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 9:
                        banda1r5c = 8;
                        bandac1 = "GRIS";
                        spinb1.setBackgroundColor(Color.rgb(160, 160, 160));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb1[i] + " " + banda1r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 10:
                        banda1r5c = 9;
                        bandac1 = "BLANCO";
                        spinb1.setBackgroundColor(Color.rgb(255, 255, 255));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb1[i] + " " + banda1r5c, Toast.LENGTH_LONG).show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinb2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                switch (i) {
                    case 1:
                        banda2r5c = 0;
                        bandac2 = "NEGRO";
                        spinb2.setBackgroundColor(Color.rgb(54,57,61));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb2[i] + " " + banda2r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        banda2r5c = 1;
                        bandac2 = "CAFE";
                        spinb2.setBackgroundColor(Color.rgb(66,41,24));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb2[i] + " " + banda2r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 3:
                        banda2r5c = 2;
                        bandac2 = "ROJO";
                        spinb2.setBackgroundColor(Color.rgb(255,51,51));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb2[i] + " " + banda2r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 4:
                        banda2r5c = 3;
                        bandac2 = "ANARANJADO";
                        spinb2.setBackgroundColor(Color.rgb(255,153,51));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb2[i] + " " + banda2r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 5:
                        banda2r5c = 4;
                        bandac2 = "AMARILLO";
                        spinb2.setBackgroundColor(Color.rgb(255,255,51));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb2[i] + " " + banda2r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 6:
                        banda2r5c = 5;
                        bandac2 = "VERDE";
                        spinb2.setBackgroundColor(Color.rgb(51,255,51));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb2[i] + " " + banda2r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 7:
                        banda2r5c = 6;
                        bandac2 = "AZUL";
                        spinb2.setBackgroundColor(Color.rgb(51,51,255));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb2[i] + " " + banda2r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 8:
                        banda2r5c = 7;
                        bandac2 = "VIOLETA";
                        spinb2.setBackgroundColor(Color.rgb(255,51,255));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb2[i] + " " + banda2r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 9:
                        banda2r5c = 8;
                        bandac2 = "GRIS";
                        spinb2.setBackgroundColor(Color.rgb(160,160,160));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb2[i] + " " + banda2r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 10:
                        banda2r5c = 9;
                        bandac2 = "BLANCO";
                        spinb2.setBackgroundColor(Color.rgb(255,255,255));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb2[i] + " " + banda2r5c, Toast.LENGTH_LONG).show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinb3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                switch (i) {
                    case 1:
                        banda3r5c = 0;
                        bandac3 = "NEGRO";
                        spinb3.setBackgroundColor(Color.rgb(54,57,61));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb3[i] + " " + banda3r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        banda3r5c = 1;
                        bandac3 = "CAFE";
                        spinb3.setBackgroundColor(Color.rgb(66,41,24));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb3[i] + " " + banda3r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 3:
                        banda3r5c = 2;
                        bandac3 = "ROJO";
                        spinb3.setBackgroundColor(Color.rgb(255,51,51));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb3[i] + " " + banda3r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 4:
                        banda3r5c = 3;
                        bandac3 = "ANARANJADO";
                        spinb3.setBackgroundColor(Color.rgb(255,153,51));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb3[i] + " " + banda3r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 5:
                        banda3r5c = 4;
                        bandac3 = "AMARILLO";
                        spinb3.setBackgroundColor(Color.rgb(255,255,51));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb3[i] + " " + banda3r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 6:
                        banda3r5c = 5;
                        bandac3 = "VERDE";
                        spinb3.setBackgroundColor(Color.rgb(51,255,51));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb3[i] + " " + banda3r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 7:
                        banda3r5c = 6;
                        bandac3 = "AZUL";
                        spinb3.setBackgroundColor(Color.rgb(51,51,255));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb3[i] + " " + banda3r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 8:
                        banda3r5c = 7;
                        bandac3 = "VIOLETA";
                        spinb3.setBackgroundColor(Color.rgb(255,51,255));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb3[i] + " " + banda3r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 9:
                        banda3r5c = 8;
                        bandac3 = "GRIS";
                        spinb3.setBackgroundColor(Color.rgb(160,160,160));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb3[i] + " " + banda3r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 10:
                        banda3r5c = 9;
                        bandac3 = "BLANCO";
                        spinb3.setBackgroundColor(Color.rgb(255,255,255));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb3[i] + " " + banda3r5c, Toast.LENGTH_LONG).show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinb4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                switch (i) {
                    case 1:
                        banda4r5c = 0.1;
                        bandac4 = "ORO";
                        spinb4.setBackgroundColor(Color.rgb(255,215,0));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb4[i] + " " + banda4r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        banda4r5c = 0.01;
                        bandac4 = "PLATA";
                        spinb4.setBackgroundColor(Color.rgb(192,192,192));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb4[i] + " " + banda4r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 3:
                        banda4r5c = 1;
                        bandac4 = "NEGRO";
                        spinb4.setBackgroundColor(Color.rgb(54,57,61));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb4[i] + " " + banda4r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 4:
                        banda4r5c = 10;
                        bandac4 = "CAFE";
                        spinb4.setBackgroundColor(Color.rgb(66,41,24));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb4[i] + " " + banda4r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 5:
                        banda4r5c = 100;
                        bandac4 = "ROJO";
                        spinb4.setBackgroundColor(Color.rgb(255,51,51));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb4[i] + " " + banda4r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 6:
                        banda4r5c = 1000;
                        bandac4 = "ANARANJADO";
                        spinb4.setBackgroundColor(Color.rgb(255,153,51));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb4[i] + " " + banda4r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 7:
                        banda4r5c = 10000;
                        bandac4 = "AMARILLO";
                        spinb4.setBackgroundColor(Color.rgb(255,255,51));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb4[i] + " " + banda4r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 8:
                        banda4r5c = 100000;
                        bandac4 = "VERDE";
                        spinb4.setBackgroundColor(Color.rgb(51,255,51));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb4[i] + " " + banda4r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 9:
                        banda4r5c = 1000000;
                        bandac4 = "AZUL";
                        spinb4.setBackgroundColor(Color.rgb(51,51,255));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb4[i] + " " + banda4r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 10:
                        banda4r5c = 10000000;
                        bandac4 = "VIOLETA";
                        spinb4.setBackgroundColor(Color.rgb(255,51,255));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb4[i] + " " + banda4r5c, Toast.LENGTH_LONG).show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinb5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                switch (i) {
                    case 1:
                        banda5r5c = 5;
                        bandac5 = "ORO";
                        spinb5.setBackgroundColor(Color.rgb(255,215,0));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb5[i] + " " + banda5r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        banda5r5c = 10;
                        bandac5 = "PLATA";
                        spinb5.setBackgroundColor(Color.rgb(192,192,192));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb5[i] + " " + banda5r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 3:
                        banda5r5c = 1;
                        bandac5 = "CAFE";
                        spinb5.setBackgroundColor(Color.rgb(66,41,24));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb5[i] + " " + banda5r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 4:
                        banda5r5c = 2;
                        bandac5 = "ROJO";
                        spinb5.setBackgroundColor(Color.rgb(255,51,51));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb5[i] + " " + banda5r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 5:
                        banda5r5c = 0.5;
                        bandac5 = "VERDE";
                        spinb5.setBackgroundColor(Color.rgb(51,255,51));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb5[i] + " " + banda5r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 6:
                        banda5r5c = 0.25;
                        bandac5 = "AZUL";
                        spinb5.setBackgroundColor(Color.rgb(51,51,255));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb5[i] + " " + banda5r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 7:
                        banda5r5c = 0.10;
                        bandac5 = "VIOLETA";
                        spinb5.setBackgroundColor(Color.rgb(255,51,255));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb5[i] + " " + banda5r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 8:
                        banda5r5c = 0.05;
                        bandac5 = "GRIS";
                        spinb5.setBackgroundColor(Color.rgb(160,160,160));
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb5[i] + " " + banda5r5c, Toast.LENGTH_LONG).show();
                        break;
                    case 9:
                        banda5r5c = 20;
                        bandac5 = "NO COLOR";
                        spinb5.setBackgroundColor(Color.TRANSPARENT);
                        Toast.makeText(getApplicationContext(), "es el color  " + opcspinb5[i] + " " + banda5r5c, Toast.LENGTH_LONG).show();
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        findViewById(R.id.btncalculo2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalr5c = (((banda1r5c * 100) + (banda2r5c * 10) + banda3r5c) * (banda4r5c));
                String arreglo[] = new String[6];
                arreglo[0] = String.valueOf(bandac1);
                arreglo[1] = String.valueOf(bandac2);
                arreglo[2] = String.valueOf(bandac3);
                arreglo[3] = String.valueOf(bandac4);
                arreglo[4] = String.valueOf(bandac5);
                arreglo[5] = String.valueOf(totalr5c + "  + / -  " + banda5r5c + "% de tolerancia");

                Intent I = new Intent(Pantalla4.this, Pantalla6.class);
                I.putExtra("bandas", arreglo);
                startActivity(I);
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pantalla4, menu);
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
