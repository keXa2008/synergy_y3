package com.aboba.bruh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calc(View view) {
        EditText normCountText = findViewById(R.id.normCount);
        double normCount = Double.parseDouble(normCountText.getText().toString());
        EditText childCountText = findViewById(R.id.childCount);
        double childCount = Double.parseDouble(childCountText.getText().toString());
        EditText oldCountText = findViewById(R.id.oldCount);
        double oldCount = Double.parseDouble(oldCountText.getText().toString());
        Button calc = findViewById(R.id.calcu);
        Ticket ticket = new Ticket();
        ChildTicket childTicket = new ChildTicket();
        OldTicket oldTicket = new OldTicket();
        double cost = (ticket.getCost() * normCount) +
                        (childTicket.getCost() * childCount) +
                        (oldTicket.getCost() * oldCount);
        calc.setText(String.format("Цена: %.2f руб.", cost));
    }
}