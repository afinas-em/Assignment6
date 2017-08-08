package com.wordpress.affdroid.edittext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e = (EditText) findViewById(R.id.editText);
        t = (TextView) findViewById(R.id.text);
    }

    public void func(View v) {

        if (e.getText().toString().equals(""))
            Toast.makeText(MainActivity.this, "Pls Enter anything", Toast.LENGTH_SHORT).show();
        else
            t.setText(e.getText().toString());


    }

}


