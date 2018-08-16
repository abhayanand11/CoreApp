package com.example.coreapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    Button openViewButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         this.openViewButton = (Button) findViewById(R.id.button);
         this.openViewButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                Intent intent =   new Intent(MainActivity.this, app.example.com.helloworldgradle.HelloWorld.class);
                 startActivity(intent);
             }
         });

    }
}
