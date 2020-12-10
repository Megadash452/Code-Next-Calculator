package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;

    private Button buttonEnter;
    private Button buttonPlus;
    private Button buttonMinus;
    private Button buttonMultiply;
    private Button buttonDivide;
    private Button buttonClear;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputView = this.findViewById(R.id.inputView);
        outputView = this.findViewById(R.id.outputView);

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){public void onClick(View view)
        {appendNumToInput('1');}});

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){public void onClick(View view)
        {appendNumToInput('2');}});

        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){public void onClick(View view)
        {appendNumToInput('3');}});

        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener(){public void onClick(View view)
        {appendNumToInput('4');}});

        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener(){public void onClick(View view)
        {appendNumToInput('5');}});

        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener(){public void onClick(View view)
        {appendNumToInput('6');}});

        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener(){public void onClick(View view)
        {appendNumToInput('7');}});

        button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener(){public void onClick(View view)
        {appendNumToInput('8');}});

        button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener(){public void onClick(View view)
        {appendNumToInput('9');}});

        button0 = findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener(){public void onClick(View view)
        {appendNumToInput('0');}});

        buttonEnter = findViewById(R.id.buttonEnter);
        buttonEnter.setOnClickListener(new View.OnClickListener(){public void onClick(View view)
        {
            try {
                output += Calculator.evaluate(input);
                clearInput();
                print(output);
            } catch (Exception e) {
               print("Error!");
               clearInput();
            }
        }});

        buttonPlus = findViewById(R.id.buttonPlus);
        buttonPlus.setOnClickListener(new View.OnClickListener(){public void onClick(View view)
        {appendOperatorToInput('+');}});

        buttonMinus = findViewById(R.id.buttonMinus);
        buttonMinus.setOnClickListener(new View.OnClickListener(){public void onClick(View view)
        {appendOperatorToInput('-');}});

        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonMultiply.setOnClickListener(new View.OnClickListener(){public void onClick(View view)
        {appendOperatorToInput('*');}});

        buttonDivide = findViewById(R.id.buttonDivide);
        buttonDivide.setOnClickListener(new View.OnClickListener(){public void onClick(View view)
        {appendOperatorToInput('/');}});

        buttonClear = findViewById(R.id.buttonClear);
        buttonClear.setOnClickListener(new View.OnClickListener(){public void onClick(View view)
        {clearInput();}});
    }

    private void appendNumToInput(char num)
    {
        input += num;
        inputView.setText(input);
    }

    private void appendOperatorToInput(char op)
    {
        input += op;
        inputView.setText(input);
    }

    private void clearInput()
    {
        input = "";
        inputView.setText("");
    }

    private void print(String str){outputView.setText(str);}

    private String input = "";
    private String output = "";
    TextView inputView;
    TextView outputView;
}