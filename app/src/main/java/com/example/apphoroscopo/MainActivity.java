package com.example.apphoroscopo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    String horoscopo="";
    String nombre;
    EditText textField1, textField2, textField3;
    TextView tv, a, b, c;
    int dia, mes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View boton1 = findViewById(R.id.button1);
        boton1.setOnClickListener(this);

        a = (TextView) findViewById(R.id.text2);
        b = (TextView) findViewById(R.id.text3);
        c = (TextView) findViewById(R.id.text5);

        c.setText("Ingresa tu nombre");
        a.setText("Ingresa el mes de nacimeinto(numero)");
        b.setText("Ingresa dia de nacimiento");
    }

    @Override
    public void onClick(View view) {

        textField1 = (EditText) findViewById(R.id.editText1);
        textField2 = (EditText) findViewById(R.id.editText2);
        textField3 = (EditText) findViewById(R.id.editText3);

        nombre = textField3.getText().toString();
        dia = Integer.parseInt(textField1.getText().toString());
        mes = Integer.parseInt(textField1.getText().toString());

        tv = (TextView) findViewById(R.id.text4);
        switch (mes){
            case 1:
                if(dia>21){
                    horoscopo = "Acuario";
                }else{
                    horoscopo = "Capricornio";
                }
                break;

            case 2:
                if(dia>19){
                    horoscopo = "Piscis";
                }else {
                    horoscopo = "Acuario";
                }
                break;

            case 3:
                if(dia>20){
                    horoscopo = "Aries";
                }else{
                    horoscopo = "Piscis";
                }
                break;

            case 4:
                if(dia>20){
                    horoscopo = "Tauro";
                }else {
                    horoscopo = "Aries";
                }
                break;

            case 5:
                if (dia > 21) {
                    horoscopo = "GEMINIS";
                } else {
                    horoscopo = "TAURO";
                }
                break;
            case 6:
                if (dia > 20) {
                    horoscopo = "CANCER";
                } else {
                    horoscopo = "GEMINIS";
                }
                break;
            case 7:
                if (dia > 22) {
                    horoscopo = "LEO";
                } else {
                    horoscopo = "CANCER";
                }
                break;
            case 8:
                if (dia > 21) {
                    horoscopo = "VIRGO";
                } else {
                    horoscopo = "LEO";
                }
                break;
            case 9:
                if (dia > 22) {
                    horoscopo = "LIBRA";
                } else {
                    horoscopo = "VIRGO";
                }
                break;
            case 10:
                if (dia > 22) {
                    horoscopo = "ESCORPION";
                } else {
                    horoscopo = "LIBRA";
                }
                break;
            case 11:
                if (dia > 21) {
                    horoscopo = "SAGITARIO";
                } else {
                    horoscopo = "ESCORPION";
                }
                break;
            case 12:
                if (dia > 21) {
                    horoscopo = "CAPRICORNIO";
                } else {
                    horoscopo = "SAGITARIO";
                }
                break;
                default:
        }

        tv.append(nombre + ", tu signo es: " + horoscopo);
    }
}
