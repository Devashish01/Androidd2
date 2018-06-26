package com.example.android.firstques;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);







        Toast.makeText(this,"onCreate() is called",Toast.LENGTH_SHORT).show();
        Toast t=Toast.makeText(this,"Hello",Toast.LENGTH_SHORT);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart() is created",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume()  created",Toast.LENGTH_SHORT).show();
    }
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this,"onRestart()",Toast.LENGTH_SHORT).show();
    }


    protected void onStop(){
        super.onStop();
        Toast.makeText(this,"onStop()",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onPause() created",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(this,"onDestroy() created",Toast.LENGTH_SHORT).show();
    }


}