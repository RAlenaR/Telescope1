package com.example.telescope1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        float telescopePrice = 14000;//стоимость телескопа
        float acount = 1000;//остаток денег на счете
        int scholarship = 2500;//стипендия
        int percentBank = 5;//срества размещены в банке под 5% годовых
        byte month = 0;//кол-во месяцев


        //метод подсчета количества месяцев до накопления на телескоп
        private float monthPay() {
            while (acount < telescopePrice) {
                acount = acount * (1 + percentBank / 100 / 12) + scholarship;
                month++;
            }
            ;
            return month;
        }

        ;
        private TextView monthPayOut;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            monthPayOut = findViewById(R.id.monthPayOut);
            monthPayOut.setText(Float.toString(monthPay()));
        }
    }
