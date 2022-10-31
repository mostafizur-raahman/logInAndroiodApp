 package com.mostafiz.assignment_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {
    EditText userName,password;
    Button btn,reset;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btn = findViewById(R.id.login);
        reset = findViewById(R.id.reset);
        textView = findViewById(R.id.showAll);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String name =  userName.getText().toString();
               String pass = password.getText().toString();
               if ( name.isEmpty() ){
                   Toast.makeText(MainActivity.this, "Please fillup the username", Toast.LENGTH_SHORT).show();
               }
               else if ( pass.isEmpty() ){
                   Toast.makeText(MainActivity.this, "Please fillup the password", Toast.LENGTH_SHORT).show();
               }
               else
               textView.setText("Your username is " + name + " & pass is " + pass);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}