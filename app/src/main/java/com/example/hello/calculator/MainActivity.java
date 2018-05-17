package com.example.hello.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    DateFormat formatdatetime=DateFormat.getDateInstance();
    Calendar datetime=Calendar.getInstance();
    EditText Et1,Et2,Et3,Et4,Et5,Et6,Et7,Et8,Et9,Et10,Et_avg,Et_sum;
    Button bt_cal,bt_reset;
    private TextView tv_date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_date=(TextView)findViewById(R.id.tv_date);
        Et1=(EditText)findViewById(R.id.ET1);
        Et2=(EditText)findViewById(R.id.ET2);
        Et3=(EditText)findViewById(R.id.ET3);
        Et4=(EditText)findViewById(R.id.ET4);
        Et5=(EditText)findViewById(R.id.ET5);
        Et6=(EditText)findViewById(R.id.ET6);
        Et7=(EditText)findViewById(R.id.ET7);
        Et8=(EditText)findViewById(R.id.ET8);
        Et9=(EditText)findViewById(R.id.ET9);
        Et10=(EditText)findViewById(R.id.ET10);
        Et_avg=(EditText)findViewById(R.id.ET11_avg);
        Et_sum=(EditText)findViewById(R.id.ET_sum);
        bt_cal=(Button)findViewById(R.id.bt_cal);
        bt_reset=(Button)findViewById(R.id.bt_reset);
        Et1.setText("0");
        Et2.setText("0");
        Et3.setText("0");
        Et4.setText("0");
        Et5.setText("0");
        Et6.setText("0");
        Et7.setText("0");
        Et8.setText("0");
        Et9.setText("0");
        Et10.setText("0");

        updateTextLabel();



        bt_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double et1,et2,et3,et4,et5,et6,et7,et8,et9,et10,avg=0,sum=0;

                et1=Integer.parseInt(Et1.getText().toString());
                et2=Integer.parseInt(Et2.getText().toString());
                et3=Integer.parseInt(Et3.getText().toString());
                et4=Integer.parseInt(Et4.getText().toString());
                et5=Integer.parseInt(Et5.getText().toString());
                et6=Integer.parseInt(Et6.getText().toString());
                et7=Integer.parseInt(Et7.getText().toString());
                et8=Integer.parseInt(Et8.getText().toString());
                et9=Integer.parseInt(Et9.getText().toString());
                et10=Integer.parseInt(Et10.getText().toString());


                if(et1==0){

                    avg=0;
                    sum=0;


                }
                else if (et2 == 0) {

                    avg = et1;
                    sum=et1;

                }
                else if (et3 == 0) {

                    avg =(et1+et2)/2;
                    sum=et1+et2;

                }
                else if (et4 == 0) {

                    avg =(et1+et2+et3)/3;
                    sum=et1+et2+et3;

                }
                else if (et5 == 0) {

                    avg = (et1+et2+et3+et4)/4;
                    sum=et1+et2+et3+et4;

                }
                else if (et6 == 0) {

                    avg =(et1+et2+et3+et4+et5)/5;
                    sum=et1+et2+et3+et4+et5;

                }
                else if (et7 == 0) {

                    avg =(et1+et2+et3+et4+et5+et6)/6;
                    sum=et1+et2+et3+et4+et5+et6;

                }
                else if (et8 == 0) {

                    avg = (et1+et2+et3+et4+et5+et6+et7)/7;
                    sum=et1+et2+et3+et4+et5+et6+et7;

                }
                else if (et9 == 0) {

                    avg = (et1+et2+et3+et4+et5+et6+et7+et8)/8;
                    sum=et1+et2+et3+et4+et5+et6+et7+et8;

                }
                else if (et10 == 0) {

                    avg = (et1+et2+et3+et4+et5+et6+et7+et8+et9)/9;
                    sum=et1+et2+et3+et4+et5+et6+et7+et8+et9;

                }
                else if(et10!=0){

                    avg = (et1+et2+et3+et4+et5+et6+et7+et8+et9+et10)/10;
                    sum=et1+et2+et3+et4+et5+et6+et7+et8+et9+et10;
                }
                    Et_avg.setText(String.valueOf(avg));
                    Et_sum.setText(String.valueOf(sum));
                }

        });
        bt_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Et1.setText("0");
                Et2.setText("0");
                Et3.setText("0");
                Et4.setText("0");
                Et5.setText("0");
                Et6.setText("0");
                Et7.setText("0");
                Et8.setText("0");
                Et9.setText("0");
                Et10.setText("0");
                Et_avg.setText("0");
                Et_sum.setText("0");
            }
        });



    }
    private void updateTextLabel(){
        tv_date.setText(formatdatetime.format(datetime.getTime()));
    }
}
