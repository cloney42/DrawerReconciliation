package com.cloney42.drawerreconcilation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.cloney42.drawerreconcilation.R;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

int pennies, nickels, dimes, quarters, halves, pRolls, nRolls, dRolls, qRolls, ones, fives, tens, twenties, fifties, hundreds;
double total, pull;
EditText penniesTF, nickelsTF, dimesTF, quartersTF, halvesTF, pRollsTF, nRollsTF, dRollsTF, qRollsTF, onesTF, fivesTF, tensTF, twentiesTF, fiftiesTF, hundredsTF;
TextView displayLabel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        penniesTF = findViewById(R.id.penniesTF);
        nickelsTF = findViewById(R.id.nickelsTF);
        dimesTF = findViewById(R.id.dimesTF);
        quartersTF = findViewById(R.id.quartersTF);
        halvesTF = findViewById(R.id.halvesTF);

        pRollsTF = findViewById(R.id.pRollsTF);
        nRollsTF = findViewById(R.id.nRollsTF);
        dRollsTF = findViewById(R.id.dRollsTF);
        qRollsTF = findViewById(R.id.qRollsTF);

        onesTF = findViewById(R.id.onesTF);
        fivesTF = findViewById(R.id.fivesTF );
        tensTF = findViewById(R.id.tensTF);
        twentiesTF = findViewById(R.id.twentiesTF);
        fiftiesTF = findViewById(R.id.fiftiesTF);
        hundredsTF = findViewById(R.id.hundredsTF);

        displayLabel = findViewById(R.id.displayLabel);
    }

    public void calculate(View v){
        try {
            pennies = Integer.parseInt(penniesTF.getText().toString());
        }catch(NumberFormatException e){
            pennies = 0;
        }

        try {
            nickels = Integer.parseInt(nickelsTF.getText().toString());
        }catch(NumberFormatException e){
            nickels = 0;
        }

        try {
            dimes = Integer.parseInt(dimesTF.getText().toString());
        }catch(NumberFormatException e){
            dimes = 0;
        }

        try {
            quarters = Integer.parseInt(quartersTF.getText().toString());
        }catch(NumberFormatException e){
            quarters = 0;
        }

        try {
            halves = Integer.parseInt(halvesTF.getText().toString());
        }catch(NumberFormatException e){
            halves = 0;
        }

        try {
            pRolls = Integer.parseInt(pRollsTF.getText().toString());
        }catch(NumberFormatException e){
            pRolls = 0;
        }

        try {
            nRolls = Integer.parseInt(nRollsTF.getText().toString());
        }catch (NumberFormatException e){
            nRolls = 0;
        }

        try {
            dRolls = Integer.parseInt(dRollsTF.getText().toString());
        }catch (NumberFormatException e){
            dRolls = 0;
        }

        try {
            qRolls = Integer.parseInt(qRollsTF.getText().toString());
        }catch (NumberFormatException e){
            qRolls = 0;
        }

        try {
            ones = Integer.parseInt(onesTF.getText().toString());
        }catch(NumberFormatException e){
            ones = 0;
        }

        try {
            fives = Integer.parseInt(fivesTF.getText().toString());
        }catch (NumberFormatException e){
            fives = 0;
        }

        try {
            tens = Integer.parseInt(tensTF.getText().toString());
        }catch (NumberFormatException e){
            tens = 0;
        }

        try {
            twenties = Integer.parseInt(twentiesTF.getText().toString());
        }catch (NumberFormatException e){
            twenties = 0;
        }

        try {
            fifties = Integer.parseInt(fiftiesTF.getText().toString());
        }catch (NumberFormatException e){
            fifties = 0;
        }

        try {
            hundreds = Integer.parseInt(hundredsTF.getText().toString());
        }catch (NumberFormatException e){
            hundreds = 0;
        }

        total = 0;

        total += (pennies * .01);
        total += (nickels * .05);
        total += (dimes * .1);
        total += (quarters * .25);
        total += (halves * .5);

        total += (pRolls * .5);
        total += (nRolls * 2);
        total += (dRolls * 5);
        total += (qRolls * 10);

        total += ones;
        total += (fives * 5);
        total += (tens * 10);
        total += (twenties * 20);
        total += (fifties * 50);
        total += (hundreds * 100);

        pull = (total - 100);

        DecimalFormat df = new DecimalFormat("0.00");
        String displayText = "Total = $" + df.format(total);
        displayLabel.setText(displayText);
    }

    public void clear(View v){
        penniesTF.setText("");
        nickelsTF.setText("");
        dimesTF.setText("");
        quartersTF.setText("");
        halvesTF.setText("");

        pRollsTF.setText("");
        nRollsTF.setText("");
        dRollsTF.setText("");
        qRollsTF.setText("");

        onesTF.setText("");
        fivesTF.setText("");
        tensTF.setText("");
        twentiesTF.setText("");
        fiftiesTF.setText("");
        hundredsTF.setText("");

        displayLabel.setText("");
    }
}
