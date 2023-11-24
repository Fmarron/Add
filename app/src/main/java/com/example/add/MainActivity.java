package com.example.add;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ed1, ed2;
    TextView equals;
    Button button1, button2, button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);

        equals = findViewById(R.id.textView);

        button1 = findViewById(R.id.button1);

        button2 = findViewById(R.id.button2);

        button3 = findViewById(R.id.button3);

        button4 = findViewById(R.id.button4);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num1 = ed1.getText().toString();
                String num2 = ed2.getText().toString();

                int nunm1 = Integer.parseInt(num1);
                int nunm2 = Integer.parseInt(num2);

                int results = nunm1 + nunm2;

                equals.setText("Answer is: " + results);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num1 = ed1.getText().toString();
                String num2 = ed2.getText().toString();

                int nunm1 = Integer.parseInt(num1);
                int nunm2 = Integer.parseInt(num2);

                int results = nunm1 - nunm2;

                equals.setText("Answer is: " + results);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num1 = ed1.getText().toString();
                String num2 = ed2.getText().toString();

                float nunm1 = Integer.parseInt(num1);
                float nunm2 = Integer.parseInt(num2);

                float results = nunm1 / nunm2;

                equals.setText("Answer is: " + results);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num1 = ed1.getText().toString();
                String num2 = ed2.getText().toString();

                int nunm1 = Integer.parseInt(num1);
                int nunm2 = Integer.parseInt(num2);

                int results = nunm1 * nunm2;

                equals.setText("Answer is: " + results);
            }
        });
    }
}