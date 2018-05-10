package com.example.student.catalinaislandboatexpress;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        double costPerTickets = 34.99;
        int numberOfTickets;
        double totalCost;
        String directionChoice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText tickets = (EditText)findViewById(R.id.txtTickets);
        final Spinner direction = (Spinner)findViewById(R.id.txtDirection);
        Button cost = (Button)findViewById(R.id.btnCost);

        cost.setOnClickListener(new View.OnClickListener() {
            final TextView result =(TextView)findViewById(R.id.txtResult);
            @Override
            public void onClick(View view) {
                numberOfTickets = Integer.parseInt(tickets.getText().toString());
                 totalCost = numberOfTickets*costPerTickets;
                directionChoice = direction.getSelectedItem().toString();
                result.setText("One way trip to "+directionChoice+" : "+totalCost);

            }
            });
        }
}

