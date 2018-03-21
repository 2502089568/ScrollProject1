package com.example.zz.scrollproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnView(View view) {
        startActivity(new Intent(this,Main2Activity.class));
    }

    public void btnViewGroup(View view) {
        startActivity(new Intent(this,Main3Activity.class));
    }
}
