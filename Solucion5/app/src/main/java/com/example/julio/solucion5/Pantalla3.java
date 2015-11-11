package com.example.julio.solucion5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.Spinner;

import java.util.StringTokenizer;

public class Pantalla3 extends AppCompatActivity {

    double banda1r4c;
    double banda2r4c;
    double banda3r4c;
    double banda4r4c;
    double totalr4c;

    // Declaramos las variables que se necesitan para el arreglo

  public Spinner spin1, spin2, spin3, spin4;
        ArrayAdapter<String> aabanda1, aabanda2, aabanda3, aabanda4;
        String [] opcspin1= new   String [] {"NEGRO","CAFÉ", "ROJO","ANARANJADO","AMARILLO","VERDE","AZUL","VIOLETA","GRIS","BLANCO" };
        String [] opcspin2= new   String [] {"NEGRO","CAFÉ", "ROJO","ANARANJADO","AMARILLO","VERDE","AZUL","VIOLETA","GRIS","BLANCO" };
        String [] opcspin3= new   String [] {"NEGRO","CAFÉ", "ROJO","ANARANJADO","AMARILLO","VERDE","AZUL","VIOLETA","ORO","PLATA" };
        String [] opcspin4= new   String []  {"ORO","PLATA","CAFÉ", "ROJO","VERDE","AZUL","VIOLETA","GRIS","NO COLOR"};





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla3);
        findViewById(R.id.btncalculo1).setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {



                // Iniciamos un nuevo intent para pasar los datos de la variable string a la otra activity

                // evaluación de los colores de la primera banda

                if(opcspin1.equals("NEGRO")){
                    banda1r4c=0;
                }
               else if(opcspin1.equals("CAFÉ")){
                    banda1r4c=1;
                }
                else if(opcspin1.equals("ROJO")){
                    banda1r4c=2;
                }
                else if(opcspin1.equals("ANARANJADO")){
                    banda1r4c=3;
                }
                else if(opcspin1.equals("AMARILLO")){
                    banda1r4c=4;
                }
                else if(opcspin1.equals("VERDE")){
                    banda1r4c=5;
                }
                else if(opcspin1.equals("AZUL")){
                    banda1r4c=6;
                }
                else if(opcspin1.equals("VIOLETA")){
                    banda1r4c=7;
                }
                else if(opcspin1.equals("GRIS")){
                    banda1r4c=8;
                }
                else if(opcspin1.equals("BLANCO")){
                    banda1r4c=9;
                }


                // evaluación de los colores de la segunda banda

                if(opcspin2.equals("NEGRO")){
                    banda2r4c=0;
                }
                else if(opcspin2.equals("CAFÉ")){
                    banda2r4c=1;
                }
                else if(opcspin2.equals("ROJO")){
                    banda2r4c=2;
                }
                else if(opcspin2.equals("ANARANJADO")){
                    banda2r4c=3;
                }
                else if(opcspin2.equals("AMARILLO")){
                    banda2r4c=4;
                }
                else if(opcspin2.equals("VERDE")){
                    banda2r4c=5;
                }
                else if(opcspin2.equals("AZUL")){
                    banda2r4c=6;
                }
                else if(opcspin2.equals("VIOLETA")){
                    banda2r4c=7;
                }
                else if(opcspin2.equals("GRIS")){
                    banda2r4c=8;
                }
                else if(opcspin2.equals("BLANCO")){
                    banda2r4c=9;
                }


                // evaluación de los colores de la tercera banda

                else if(opcspin3.equals("ORO")){
                    banda3r4c= 0.1;
                }
                else if(opcspin3.equals("PLATA")){
                    banda3r4c= 0.01;
                }

                else if(opcspin3.equals("NEGRO")){
                    banda3r4c= 1;
                }
                else if(opcspin3.equals("CAFÉ")){
                    banda3r4c= 10;
                }
                else if(opcspin3.equals("ROJO")){
                    banda3r4c= 100;
                }
                else if(opcspin3.equals("ANARANJADO")){
                    banda3r4c= 1000;
                }
                else if(opcspin3.equals("AMARILLO")){
                    banda3r4c= 10000;
                }
                else if(opcspin3.equals("VERDE")){
                    banda3r4c= 100000;
                }
                else if(opcspin3.equals("AZUL")){
                    banda3r4c= 10000000;
                }
                else if(opcspin3.equals("VIOLETA")){
                    banda3r4c= 100000000;
                }

                // evaluación de los colores de la cuarta banda

                else if(opcspin4.equals("ORO")){
                    banda4r4c= 5;
                }
                else if(opcspin4.equals("PLATA")){
                    banda4r4c= 10;
                }

                else if(opcspin4.equals("CAFÉ")){
                    banda4r4c= 1;
                }
                else if(opcspin4.equals("ROJO")){
                    banda4r4c= 2;
                }

                else if(opcspin4.equals("VERDE")){
                    banda4r4c= 0.5;
                }
                else if(opcspin4.equals("AZUL")){
                    banda4r4c= 0.25;
                }
                else if(opcspin4.equals("VIOLETA")){
                    banda4r4c= 0.10;
                }

                else {
                    banda4r4c= 0.05;
                }


                totalr4c = Double.parseDouble((((banda1r4c*10)+(banda2r4c))*(banda3r4c))+ "+"+"/"+"-"+banda4r4c+ "%"+ "DE TOLERANCIA");



                startActivity(new Intent(Pantalla3.this, Pantalla6.class));

            }
        });

        //aquí termina el método onclick

        spin1= (Spinner) findViewById(R.id.spin1);
        spin2= (Spinner) findViewById(R.id.spin2);
        spin3= (Spinner) findViewById(R.id.spin3);
        spin4= (Spinner) findViewById(R.id.spin4);


        ArrayAdapter<String> aabanda1= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,opcspin1);
        spin1.setAdapter(aabanda1);
        ArrayAdapter<String> aabanda2= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,opcspin2);
        spin2.setAdapter(aabanda2);
        ArrayAdapter<String> aabanda3= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,opcspin3);
        spin3.setAdapter(aabanda3);
        ArrayAdapter<String> aabanda4= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,opcspin4);
        spin4.setAdapter(aabanda4);




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
