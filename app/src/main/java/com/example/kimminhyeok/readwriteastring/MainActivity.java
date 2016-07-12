package com.example.kimminhyeok.readwriteastring;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void change(View view){
        EditText e = (EditText) findViewById(R.id.edit_text_view);
        TextView t = (TextView) findViewById(R.id.text_view);
        t.setText(e.getText());
    }
}
