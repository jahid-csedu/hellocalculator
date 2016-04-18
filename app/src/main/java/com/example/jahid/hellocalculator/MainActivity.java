package com.example.jahid.hellocalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText firstNumber, secondNumber;
    TextView result;
    Button add, subtract;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNumber= (EditText) findViewById(R.id.firstNumberEditText);
        secondNumber= (EditText) findViewById(R.id.secondNumberEditText);
        result=(TextView)findViewById(R.id.showResultTextView);
        add= (Button) findViewById(R.id.addButton);
        subtract= (Button) findViewById(R.id.subtractButton);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1,num2;
                num1=firstNumber.getText().toString();
                num2=secondNumber.getText().toString();
                try {
                    int res = Integer.parseInt(num1) + Integer.parseInt(num2);
                    result.setText(Integer.toString(res));
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Please enter a number",Toast.LENGTH_LONG);
                }
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1,num2;
                num1=firstNumber.getText().toString();
                num2=secondNumber.getText().toString();
                try {
                    int res = Integer.parseInt(num1) - Integer.parseInt(num2);
                    result.setText(Integer.toString(res));
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Please enter a number",Toast.LENGTH_LONG);
                }
            }
        });

    }
}
