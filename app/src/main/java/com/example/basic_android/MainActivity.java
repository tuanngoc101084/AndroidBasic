package com.example.basic_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] arrayNumber  = {1,2,3,3,3,4,5};
        int [] result=returnArray(arrayNumber);
        for(int i: result)
        {
            Log.d("Result", "Value: "+ i);
        }

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
private boolean checkExistNumber(int[] input, int Number)
{
    Boolean status=false;
    for(int i: input)
    {
        if (Number==i)
        {
            status=true;
            break;
        }
    }
    return status;
}
    private int[] returnArray(int [] input)
    {
        int k=0;
        int[] Temp= new int[input.length] ;
        for(int i: input)
        {
          if (!checkExistNumber(Temp,i))
          {
              Temp[k]=i;
              k++;
          }
        }
        int m=0;
        int[] arrayFinal= new int [k];
        for (;m<k;m++)
        {
            arrayFinal[m]=Temp[m];
        }
        return arrayFinal;
    }
}
