package com.example.conversordemoedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void converterKwanza(View view) {
        EditText edtxEuro = (EditText) findViewById(R.id.edtxtEuros);

        try {

            Float aoa = ((float)795.61)*Float.parseFloat(edtxEuro.getText()+"");

            toastSms("EURO - AOA: "+aoa);

        }catch (Exception ex){
            toastSms("Insira o valor");
        }
    }

    public void converterReal(View view) {
        EditText edtxEuro = (EditText) findViewById(R.id.edtxtEuros);

        try {

            Float euro = ((float)6.37)*Float.parseFloat(edtxEuro.getText()+"");

            toastSms("EURO - REAL: "+euro);

        }catch (Exception ex){
            toastSms("Insira o valor");
        }

    }

    public void converterDollar(View view) {
        EditText edtxEuro = (EditText) findViewById(R.id.edtxtEuros);

        try {

            Float dollar = ((float)1.22)*Float.parseFloat(edtxEuro.getText()+"");

            toastSms("EURO - DOLLAR: "+dollar);

        }catch (Exception ex){
            toastSms("Insira o valor");
        }
    }

    public void toastSms(String sms){
        Toast t = Toast.makeText(this, sms, Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER, 0, 0);
        t.show();
    }
}