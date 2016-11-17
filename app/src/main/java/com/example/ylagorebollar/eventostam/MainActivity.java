package com.example.ylagorebollar.eventostam;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton = (Button)findViewById(R.id.btnDetalle);
    }

    void accionar(View v){
        if(findViewById(R.id.btnDetalle)==null){
            Toast toast = Toast.makeText(getApplicationContext(), "Abre una ventana Grande", Toast.LENGTH_SHORT);
            toast.show();
        }else{
            Toast toast = Toast.makeText(getApplicationContext(), "Abre una ventana", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
