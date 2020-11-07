package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.calculator.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    Double n1, n2;
    String x;
    int n=0, m;

    public ActivityMainBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

        b.bEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = b.textView.getText().toString();
                m = x.length();

                if (n==1) {
                    n1 = Double.parseDouble(x.substring(0,x.indexOf("+")));
                    n2 = Double.parseDouble(x.substring(x.indexOf("+")+1, m));
                    b.textView.setText(Double.toString(n1 + n2));
                }

                else if (n==2) {
                    n1 = Double.parseDouble(x.substring(0,x.indexOf("-")));
                    n2 = Double.parseDouble(x.substring(x.indexOf("-")+1, m));
                    b.textView.setText(Double.toString(n1 - n2));
                }

                else if (n==3) {
                    n1 = Double.parseDouble(x.substring(0,x.indexOf("*")));
                    n2 = Double.parseDouble(x.substring(x.indexOf("*")+1, m));
                    b.textView.setText(Double.toString(n1 * n2));
                }

                else if (n==4) {
                    n1 = Double.parseDouble(x.substring(0,x.indexOf("/")));
                    n2 = Double.parseDouble(x.substring(x.indexOf("/")+1, m));
                    b.textView.setText(Double.toString(n1 / n2));
                }

            }
        });

        b.plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n=1;
                b.textView.setText(b.textView.getText() + "+");
            }
        });

        b.minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n=2;
                b.textView.setText(b.textView.getText() + "-");
            }
        });

        b.multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n=3;
                b.textView.setText(b.textView.getText() + "*");
            }
        });

        b.divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n=4;
                b.textView.setText(b.textView.getText() + "/");
            }
        });

        b.b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.textView.setText(b.textView.getText() + "0");
            }
        });

        b.b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.textView.setText(b.textView.getText() + "1");
            }
        });

        b.b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.textView.setText(b.textView.getText() + "2");
            }
        });

        b.b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.textView.setText(b.textView.getText() + "3");
            }
        });

        b.b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.textView.setText(b.textView.getText() + "4");
            }
        });

        b.b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.textView.setText(b.textView.getText() + "5");
            }
        });

        b.b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.textView.setText(b.textView.getText() + "6");
            }
        });

        b.b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.textView.setText(b.textView.getText() + "7");
            }
        });

        b.b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.textView.setText(b.textView.getText() + "8");
            }
        });

        b.b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.textView.setText(b.textView.getText() + "9");
            }
        });

        /*b.multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Double.parseDouble(b.number1.getText().toString());
                n2 = Double.parseDouble(b.number2.getText().toString());

                b.textView.setText(Double.toString(n1*n2));
            }
        });

        b.divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Double.parseDouble(b.number1.getText().toString());
                n2 = Double.parseDouble(b.number2.getText().toString());

                b.textView.setText(Double.toString(n1/n2));
            }
        });*/
    }
}