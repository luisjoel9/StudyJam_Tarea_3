package com.miramicodigo.studyjam_ii_views_ii;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int sw;
    private double oper1;
    private double oper2;
    private double resul;
    private TextView tvRes;
    private String res1;
    private String res2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        tvRes = (TextView) findViewById(R.id.tvResultado);
    }

    public void uno(View v){
        res1 = tvRes.getText().toString();
        tvRes.setText(res1+"1");
    }
    public void dos(View v){
        res1 = tvRes.getText().toString();
        tvRes.setText(res1+"2");
    }
    public void tres(View v){
        res1 = tvRes.getText().toString();
        tvRes.setText(res1+"3");
    }
    public void cuatro(View v){
        res1 = tvRes.getText().toString();
        tvRes.setText(res1+"4");
    }
    public void cinco(View v){
        res1 = tvRes.getText().toString();
        tvRes.setText(res1+"5");
    }
    public void seis(View v){
        res1 = tvRes.getText().toString();
        tvRes.setText(res1+"6");
    }
    public void siete(View v){
        res1 = tvRes.getText().toString();
        tvRes.setText(res1+"7");
    }
    public void ocho(View v){
        res1 = tvRes.getText().toString();
        tvRes.setText(res1+"8");
    }
    public void nueve(View v){
        res1 = tvRes.getText().toString();
        tvRes.setText(res1+"9");
    }
    public void cero(View v){
        res1 = tvRes.getText().toString();
        tvRes.setText(res1+"0");
    }
    public void punto(View v){
        res1 = tvRes.getText().toString();
        tvRes.setText(res1+".");
    }


    public void sumar(View v){
        res2 = tvRes.getText().toString();
        tvRes.setText("0");
        sw=1;
    }
    public void restar(View v){
        res2 = tvRes.getText().toString();
        tvRes.setText("0");
        sw=2;
    }

    public void multiplicar(View v){
        res2 = tvRes.getText().toString();
        tvRes.setText("0");
        sw=3;
    }

    public void dividir(View v){
        res2 = tvRes.getText().toString();
        tvRes.setText("0");
        sw=4;
    }


    public void igual(View v){
        res1 = tvRes.getText().toString();
        oper1=Double.parseDouble(res2);
        oper2=Double.parseDouble(res1);
        if(sw==1) {
            resul = oper1 + oper2;
            tvRes.setText("" + resul);
        }
        if(sw==2) {
            resul = oper1 - oper2;
            tvRes.setText("" + resul);
        }
        if(sw==3) {
            resul = oper1 * oper2;
            tvRes.setText("" + resul);
        }
        if(sw==4) {
            resul = oper1 / oper2;
            tvRes.setText("" + resul);
        }
    }
    public void ce(View v){
        res1="0";
        res2="0";
        tvRes.setText("0");
    }

}
