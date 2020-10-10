package com.example.fristandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //第一次push
        setContentView(R.layout.activity_main);
        System.out.println("第二次push到码云 ");
    }
}
