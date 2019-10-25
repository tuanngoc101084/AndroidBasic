package com.example.basic_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] arrayNumber  = {1,2,5,6,7,9,10,23,4,5};
        Log.d("BBB","Sum is "+ sumarrayNumber(arrayNumber));
    }
   private int sumarrayNumber(int[] input)
   {
       int Sum=0;
       for(int i: input)
       {
           Sum+=i;
       }
       return Sum;
   }
}
