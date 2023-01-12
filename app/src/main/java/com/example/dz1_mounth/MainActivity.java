package com.example.dz1_mounth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private EditText email;
    private  EditText theme;
    private  EditText text;
    private MaterialButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();

    }
    public  void initView(){
        email = findViewById(R.id.text1);
        theme = findViewById(R.id.text2);
        text = findViewById(R.id.text3);
        button = findViewById(R.id.button1);
    }
    public  void initListener(){
        final Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("plain/text");

        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{email.getText().toString()});

        intent.putExtra(Intent.EXTRA_SUBJECT, theme.getText().toString());

        intent.putExtra(Intent.EXTRA_TEXT, text.getText().toString());
        startActivity(intent);
    }


}