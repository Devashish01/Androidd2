package com.example.android.secondques;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast th=Toast.makeText(this,"Toast at center",Toast.LENGTH_LONG);

        th.setGravity(Gravity.CENTER,0,0);

        th.show();
    }
}
