package com.example.android.calcv11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    Button one,two,three,four,five,six,seven,eight,nine,zero,plus,minus,mul,div,equals,clear,dot;
    TextView disp;
    double n1=0,n2=0;
    String optr; // operator

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getBaseContext(),"Welcome!", Toast.LENGTH_SHORT).show();

        one = (Button)findViewById(R.id.button_1);
        two = (Button)findViewById(R.id.button_2);
        three = (Button)findViewById(R.id.button_3);
        four = (Button)findViewById(R.id.button_4);
        five = (Button)findViewById(R.id.button_5);
        six = (Button)findViewById(R.id.button_6);
        seven = (Button)findViewById(R.id.button_7);
        eight = (Button)findViewById(R.id.button_8);
        nine = (Button)findViewById(R.id.button_9);
        zero = (Button)findViewById(R.id.button_0);
        plus = (Button)findViewById(R.id.button_plus);
        minus = (Button)findViewById(R.id.button_minus);
        mul = (Button)findViewById(R.id.button_mul);
        div = (Button)findViewById(R.id.button_div);
        equals = (Button)findViewById(R.id.button_equals);
        clear = (Button)findViewById(R.id.button_clear);
        dot = (Button)findViewById(R.id.button_dot);

        disp = (TextView)findViewById(R.id.display);

        try{

            one.setOnClickListener(new Button.OnClickListener()
            {
                public void onClick(View v)
                {
                    disp.append("1");
                }
            });
            two.setOnClickListener(new Button.OnClickListener()
            {
                public void onClick(View v)
                {
                    disp.append("2");
                }
            });
            three.setOnClickListener(new Button.OnClickListener()
            {
                public void onClick(View v)
                {
                    disp.append("3");
                }
            });
            four.setOnClickListener(new Button.OnClickListener()
            {
                public void onClick(View v)
                {
                    disp.append("4");
                }
            });
            five.setOnClickListener(new Button.OnClickListener()
            {
                public void onClick(View v)
                {
                    disp.append("5");
                }
            });
            six.setOnClickListener(new Button.OnClickListener()
            {
                public void onClick(View v)
                {
                    disp.append("6");
                }
            });
            seven.setOnClickListener(new Button.OnClickListener()
            {
                public void onClick(View v)
                {
                    disp.append("7");
                }
            });
            eight.setOnClickListener(new Button.OnClickListener()
            {
                public void onClick(View v)
                {
                    disp.append("8");
                }
            });
            nine.setOnClickListener(new Button.OnClickListener()
            {
                public void onClick(View v)
                {
                    disp.append("9");
                }
            });
            zero.setOnClickListener(new Button.OnClickListener()
            {
                public void onClick(View v)
                {
                    disp.append("0");
                }
            });
            plus.setOnClickListener(new Button.OnClickListener()
            {
                public void onClick(View v)
                {
                    if(disp.getText().length()==0){
                        Toast.makeText(getBaseContext(),"Please enter a number", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        n1 = Double.parseDouble(disp.getText().toString());
                        disp.setText("");
                        optr = "+";
                    }
                }
            });
            minus.setOnClickListener(new Button.OnClickListener()
            {
                public void onClick(View v)
                {
                    if(disp.getText().length()==0){
                        Toast.makeText(getBaseContext(),"Please enter a number", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        n1 = Double.parseDouble(disp.getText().toString());
                        disp.setText("");
                        optr = "-";
                    }
                }
            });
            mul.setOnClickListener(new Button.OnClickListener()
            {
                public void onClick(View v)
                {
                    if(disp.getText().length()==0){
                        Toast.makeText(getBaseContext(),"Please enter a number", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        n1 = Double.parseDouble(disp.getText().toString());
                        disp.setText("");
                        optr = "*";
                    }
                }
            });
            div.setOnClickListener(new Button.OnClickListener()
            {
                public void onClick(View v)
                {
                    if(disp.getText().length()==0){
                        Toast.makeText(getBaseContext(),"Please enter a number", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        n1 = Double.parseDouble(disp.getText().toString());
                        disp.setText("");
                        optr = "/";
                    }
                }
            });
            equals.setOnClickListener(new Button.OnClickListener()
            {
                public void onClick(View v)
                {
                    if(disp.getText().length()==0){
                        Toast.makeText(getBaseContext(),"Please enter a number", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        n2 = Double.parseDouble(disp.getText().toString());

                        if (optr == "+") {
                            n1 = n1 + n2;
                            disp.setText(Double.toString(n1));
                        } else if (optr == "-") {
                            n1 = n1 - n2;
                            disp.setText(Double.toString(n1));
                        } else if (optr == "*") {
                            n1 = n1 * n2;
                            disp.setText(Double.toString(n1));
                        } else if (optr == "/" && n2 != 0) {
                            n1 = n1 / n2;
                            disp.setText(Double.toString(n1));
                        }
                        if (optr == "/" && n2 == 0) {
                            disp.setText("Math Error");
                        }
                    }
                }
            });
            clear.setOnClickListener(new Button.OnClickListener()
            {
                public void onClick(View v)
                {
                    n1=0;
                    n2=0;
                    disp.setText("");
                }
            });
            dot.setOnClickListener(new Button.OnClickListener()
            {
                public void onClick(View v)
                {
                    disp.append(".");
                }
            });

        }
        catch(Exception e){
            disp.setText("Math Error");
        }
    }
    
}
