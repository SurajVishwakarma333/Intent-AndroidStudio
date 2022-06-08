package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //I have to go to second activity after clicking on Button1 of first activity.
    public void btn1(View view){
        Intent intent = new Intent(this,Activity2.class); //here providing 2 parameters first is context and second is destination name.
        Toast.makeText(this, "This is Second Activity after clicking btn1", Toast.LENGTH_SHORT).show();
        startActivity(intent);
        //finish();  //use this to finish the activity.
    }

    //I have to go to second activity after clicking on Button2 of first activity.
    public void btn2(View view){
        Intent intent = new Intent(this,Activity2.class);
        Toast.makeText(this, "This is Second Activity after clicking btn2", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
    public void btn3(View view){
        Intent intent = new Intent(this,Activity2.class);
        Toast.makeText(this, "This is Second Activity after clicking btn2", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
}
/*
//WHAT IS INTENT ?
    //Intent used for communicating from 1 activity to any other activity. we can remember intent with the word intention.

Steps : suppose i have to go in second activity after clicking on button of 1st activity.
    1. add Button widget in .xml file.
       In attribute of Button1 Give onCLick and provide any name.here i am giving btn1.
    2. In com.example.package right click on it and create second activity app->new->activity->empty activity.
        Now create Intent to communicate between Activity1 to Activity2
        Intent intent = new Intent(this,Activity2.class); //here providing 2 parameters first is context and second is destination name.
        Toast.makeText(this, "This is Second Activity", Toast.LENGTH_SHORT).show();
        startActivity(intent);    */