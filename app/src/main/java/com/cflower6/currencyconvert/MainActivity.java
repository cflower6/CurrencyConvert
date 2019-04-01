package com.cflower6.currencyconvert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void ConvertToYen(View view){
        EditText moneyUSD = findViewById(R.id.Money);
        double usdToYen = Double.parseDouble(moneyUSD.getText().toString()) * 111.34;


        Toast.makeText(MainActivity.this, Double.toString(usdToYen) + " Yen", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
