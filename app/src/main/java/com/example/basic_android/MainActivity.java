package com.example.basic_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] arrayNumber  = {1,10,11,20,18,1,21,99};
        findNumber(arrayNumber,1);
    }
//   private int sumarrayNumber(int[] input)
//   {
//       int Sum=0;
//       for(int i: input)
//       {
//           Sum+=i;
//       }
//       return Sum;
//   }
private void findNumber(int[] input, int Number)
{
    int j=0;
    Boolean status=false;
    for(int i: input)
    {
        if (Number==i)
        {
            Log.d("Number" + Number,"Index is "+ j);
            status=true;
            break;
        }
        j++;
    }
    if (!status)
    {
        Log.d("Number" + Number,"Index is "+ "-1");
    }

}
}
