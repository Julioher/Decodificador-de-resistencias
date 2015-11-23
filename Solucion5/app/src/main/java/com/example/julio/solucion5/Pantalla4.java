package com.example.julio.solucion5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Pantalla4 extends AppCompatActivity {

    double banda1r5c, banda2r5c, banda3r5c, banda4r5c, banda5r5c ;
    String totalr5c ;
    //Declaramos las variables que se necesitan para el arreglo
    public Spinner spinb1,spinb2, spinb3, spinb4, spinb5;

    ArrayAdapter<String> aaba1,aaba2, aaba3, aaba4, aaba5;
    String[] opcspinb1= new String[] {"NEGRO","CAFÉ", "ROJO","ANARANJADO","AMARILLO","VERDE","AZUL","VIOLETA","GRIS","BLANCO" };
    String[] opcspinb2= new String[] {"NEGRO","CAFÉ", "ROJO","ANARANJADO","AMARILLO","VERDE","AZUL","VIOLETA","GRIS","BLANCO" };
    String[] opcspinb3= new String[] {"NEGRO","CAFÉ", "ROJO","ANARANJADO","AMARILLO","VERDE","AZUL","VIOLETA","GRIS","BLANCO" };
    String[] opcspinb4= new String[] {"ORO","PLATA","NEGRO","CAFÉ", "ROJO","ANARANJADO","AMARILLO","VERDE","AZUL","VIOLETA" };
    String []opcspinb5= new String[] {"ORO","PLATA","CAFÉ", "ROJO","VERDE","AZUL","VIOLETA","GRIS","NO COLOR"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla4);
        findViewById(R.id.btncalculo2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                        startActivity(new Intent(Pantalla4.this, Pantalla5.class));



                // evaluación de los colores de la primera banda

                if(opcspinb1.equals("NEGRO")){
                    banda1r5c= 0;
                }
               else if(opcspinb1.equals("CAFÉ")){
                    banda1r5c= 1;
                }
                else if(opcspinb1.equals("ROJO")){
                    banda1r5c= 2;
                }
                else if(opcspinb1.equals("ANARANJADO")){
                    banda1r5c= 3;
                }
                else if(opcspinb1.equals("AMARILLO")){
                    banda1r5c= 4;
                }
                else if(opcspinb1.equals("VERDE")){
                    banda1r5c= 5;
                }
                else if(opcspinb1.equals("AZUL")){
                    banda1r5c= 6;
                }
                else if(opcspinb1.equals("VIOLETA")){
                    banda1r5c= 7;
                }
                else if(opcspinb1.equals("GRIS")){
                    banda1r5c= 8;
                }
                else if(opcspinb1.equals("BLANCO")){
                    banda1r5c= 9;
                }



                // evaluación de los colores de la segunda banda

                else if(opcspinb2.equals("NEGRO")){
                    banda2r5c= 0;
                }
                else if(opcspinb2.equals("CAFÉ")){
                    banda2r5c= 1;
                }
                else if(opcspinb2.equals("ROJO")){
                    banda2r5c= 2;
                }
                else if(opcspinb2.equals("ANARANJADO")){
                    banda2r5c= 3;
                }
                else if(opcspinb2.equals("AMARILLO")){
                    banda2r5c= 4;
                }
                else if(opcspinb2.equals("VERDE")){
                    banda2r5c= 5;
                }
                else if(opcspinb2.equals("AZUL")){
                    banda2r5c= 6;
                }
                else if(opcspinb2.equals("VIOLETA")){
                    banda2r5c= 7;
                }
                else if(opcspinb2.equals("GRIS")){
                    banda2r5c= 8;
                }
                else if(opcspinb2.equals("BLANCO")){
                    banda2r5c= 9;
                }



                //evaluación de los colores de la tercera banda

                else if(opcspinb3.equals("NEGRO")){
                    banda3r5c= 0;
                }
                else if(opcspinb3.equals("CAFÉ")){
                    banda3r5c= 1;
                }
                else if(opcspinb3.equals("ROJO")){
                    banda3r5c= 2;
                }
                else if(opcspinb3.equals("ANARANJADO")){
                    banda3r5c= 3;
                }
                else if(opcspinb3.equals("AMARILLO")){
                    banda3r5c= 4;
                }
                else if(opcspinb3.equals("VERDE")){
                    banda3r5c= 5;
                }
                else if(opcspinb3.equals("AZUL")){
                    banda3r5c= 6;
                }
                else if(opcspinb3.equals("VIOLETA")){
                    banda3r5c= 7;
                }
                else if(opcspinb3.equals("GRIS")){
                    banda3r5c= 8;
                }
                else if(opcspinb3.equals("BLANCO")){
                    banda3r5c= 9;
                }



                // evaluación de los colores de la cuarta banda

                else if(opcspinb4.equals("ORO")){
                    banda4r5c= 0.1;
                }
                else if(opcspinb4.equals("PLATA")){
                    banda4r5c= 0.01;
                }

                else if(opcspinb4.equals("NEGRO")){
                    banda4r5c= 1;
                }
                else if(opcspinb4.equals("CAFÉ")){
                    banda4r5c= 10;
                }
                else if(opcspinb4.equals("ROJO")){
                    banda4r5c= 100;
                }
                else if(opcspinb4.equals("ANARANJADO")){
                    banda4r5c= 1000;
                }
                else if(opcspinb4.equals("AMARILLO")){
                    banda4r5c= 10000;
                }
                else if(opcspinb4.equals("VERDE")){
                    banda4r5c= 100000;
                }
                else if(opcspinb4.equals("AZUL")){
                    banda4r5c= 10000000;
                }
                else if(opcspinb4.equals("VIOLETA")){
                    banda4r5c= 100000000;
                }



                // evaluación de los colores de la quinta banda

                else if(opcspinb5.equals("ORO")){
                    banda5r5c= 5;
                }
                else if(opcspinb5.equals("PLATA")){
                    banda5r5c= 10;
                }

                else if(opcspinb5.equals("CAFÉ")){
                    banda5r5c= 1;
                }
                else if(opcspinb5.equals("ROJO")){
                    banda5r5c= 2;
                }

                else if(opcspinb5.equals("VERDE")){
                    banda5r5c= 0.5;
                }
                else if(opcspinb5.equals("AZUL")){
                    banda5r5c= 0.25;
                }
                else if(opcspinb5.equals("VIOLETA")){
                    banda5r5c= 0.10;
                }

                else {
                    banda5r5c= 0.05;
                }

                totalr5c=((((banda1r5c*100)+(banda2r5c*10)+(banda3r5c))*(banda4r5c))+ "+" + "-" + banda5r5c +"%"+ "DE TOLERANCIA");

            }
        });

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
