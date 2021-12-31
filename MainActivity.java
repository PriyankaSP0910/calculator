package com.example.sim_calc;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    TextView txt;
    Button bt1_add,bt2_sub,bt3_mul,bt4_div;
    Double  numb1,numb2,rslt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.numb1);
        et2=findViewById(R.id.numb2);
        bt1_add=findViewById(R.id.btn_add);
        bt2_sub=findViewById(R.id.btn_sub);
        bt3_mul=findViewById(R.id.btn_mul);
        bt4_div=findViewById(R.id.btn_div);
        txt=findViewById(R.id.rslt);

        bt1_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numb1=Double.parseDouble(et1.getText().toString());
                numb2=Double.parseDouble(et2.getText().toString());
                rslt=numb1+numb2;
                txt.setText(rslt.toString());
            }
        });

        bt2_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numb1=Double.parseDouble(et1.getText().toString());
                numb2=Double.parseDouble(et2.getText().toString());
                rslt=numb1-numb2;
                txt.setText(rslt.toString());
            }
        });

        bt3_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numb1=Double.parseDouble(et1.getText().toString());
                numb2=Double.parseDouble(et2.getText().toString());
                rslt=numb1*numb2;
                txt.setText(rslt.toString());
            }
        });

        bt4_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numb1=Double.parseDouble(et1.getText().toString());
                numb2=Double.parseDouble(et2.getText().toString());
                rslt=numb1/numb2;
                txt.setText(rslt.toString());
            }
        });


    }
}