package com.example.ashis.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1= (EditText)findViewById(R.id.num1);
                EditText num2= (EditText)findViewById(R.id.num2);
                TextView text= (TextView)findViewById(R.id.textView);

                int n1= Integer.parseInt(num1.getText().toString());
                int n2= Integer.parseInt(num2.getText().toString());

                int sum = n1 + n2;

                text.setText(sum+"");

            }
        });
    }
}
