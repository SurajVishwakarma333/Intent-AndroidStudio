package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    Button btn1,btn2,btn3;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    //I have to go to Main activity after clicking on Button3 of second activity.
    public void btn3(View view){
        Intent intent = new Intent(this,MainActivity.class);
        Toast.makeText(this, "Return to First Activity after clicking btn3", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
}
