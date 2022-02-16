package com.codewithphuc.logmein;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtUser;
    private EditText txtPass;
    private Button button;
    private ImageView img,imgAndr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUser = findViewById(R.id.txtUserName);
        txtPass = findViewById(R.id.txtPass);
        button = findViewById(R.id.txtLog);

        img = findViewById(R.id.img);
        imgAndr = findViewById(R.id.imgAnd);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((txtUser.getText().toString().equals("admin")) && (txtPass.getText().toString().equals("admin")))
                Toast.makeText(MainActivity.this, "Welcome back!", Toast.LENGTH_SHORT).show();
                else{
                    Toast.makeText(MainActivity.this, "Incorrect username or password!", Toast.LENGTH_SHORT).show();
                    imgAndr.setVisibility(View.VISIBLE);
                }
            }
        });


    }
}