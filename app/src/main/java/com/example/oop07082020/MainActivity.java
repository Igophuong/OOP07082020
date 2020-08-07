package com.example.oop07082020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Sinhvien sinhvienA = new Sinhvien();
        sinhvienA.ten="Nguyen Van A";
        sinhvienA.tuoi = "20";
        sinhvienA.quequan = "Tan Binh";

        Log.d("BBB",sinhvienA.ten);
    }
}