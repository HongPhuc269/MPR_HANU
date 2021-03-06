package com.codewithphuc.tut2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView txtQues;
    private EditText txtName;
    private Button button;
    private ImageView imgTheme,imgAnd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtQues = findViewById(R.id.txtQues);
        txtName = findViewById(R.id.txtName);
        button =findViewById(R.id.btnClick);
        imgTheme = findViewById(R.id.imgTheme);
        imgAnd = findViewById(R.id.imgAnd);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Hello " + txtName.getText().toString(),Toast.LENGTH_SHORT).show();
                imgAnd.setVisibility(View.VISIBLE);
            }
        });
    }
}