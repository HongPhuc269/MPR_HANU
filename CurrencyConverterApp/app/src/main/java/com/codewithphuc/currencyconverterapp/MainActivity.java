package com.codewithphuc.currencyconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtMoney;
    private Button btnCon;
    private ImageView iDollar;

    private int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMoney = findViewById(R.id.txtMoney);
        btnCon = findViewById(R.id.btnCon);
        iDollar = findViewById(R.id.iDollar);

        btnCon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = Integer.parseInt(txtMoney.getText().toString());
                Toast.makeText(MainActivity.this, num + "USD is " + num * 22760 + " VND", Toast.LENGTH_SHORT).show();
            }
        });
    }
}