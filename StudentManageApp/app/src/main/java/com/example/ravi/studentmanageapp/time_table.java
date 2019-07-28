package com.example.ravi.studentmanageapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class time_table extends AppCompatActivity {
Button mon,tue,wed,thu,fri,sat;
TextView t1,t2,t3,t4,t5,t6,t7,day_of_week;
LinearLayout lay1,lay2,lay3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table);
        mon=(Button)findViewById(R.id.mon);
        tue=(Button)findViewById(R.id.tue);
        wed=(Button)findViewById(R.id.wed);
        thu=(Button)findViewById(R.id.thu);
        fri=(Button)findViewById(R.id.fri);
        sat=(Button)findViewById(R.id.sat);

        t1=(TextView)findViewById(R.id.t1);
        t2=(TextView)findViewById(R.id.t2);
        t3=(TextView)findViewById(R.id.t3);
        t4=(TextView)findViewById(R.id.t4);
        t5=(TextView)findViewById(R.id.t5);
        t6=(TextView)findViewById(R.id.t6);
        t7=(TextView)findViewById(R.id.t7);

        lay1=(LinearLayout)findViewById(R.id.lay1);
        lay2=(LinearLayout)findViewById(R.id.lay2);
        lay3=(LinearLayout)findViewById(R.id.lay3);

        day_of_week=(TextView)findViewById(R.id.day_of_week);

    }
    public void monday(View view)
    {
        day_of_week.setText("   Monday");
        t1.setText("Computer Graphics");
        t2.setText("Python Application Program");
        t3.setText("Operating Systems");                                                 // Computer Graphics   Python Application Program   Cryptography,Network Security
        t4.setText("Cryptography,Network Security");
        t5.setText("System Software Laboratory");                                          //System Software and C D     Operating Systems       Operations Research
        t6.setText("System Software Laboratory");                                         // System Software Laboratory      Computer Graphics Laboratory           Aptitude
        t7.setText("System Software Laboratory");                       //  Industrial Connect
        lay1.setVisibility(View.VISIBLE);
        lay2.setVisibility(View.VISIBLE);
        lay3.setVisibility(View.VISIBLE);

    }
    public void tuesday(View view)
    {
        day_of_week.setText("   Tuesday");
        t1.setText("Cryptography,Network Security");
        t2.setText("Computer Graphics");
        t3.setText("Operations Research");
        t4.setText("Operations Research");
        t5.setText("Industrial Connect");
        t6.setText("Industrial Connect");
        t7.setText("Industrial Connect");
        lay1.setVisibility(View.VISIBLE);
        lay2.setVisibility(View.VISIBLE);
        lay3.setVisibility(View.VISIBLE);
    }
    public void wednesday(View view)
    {
        day_of_week.setText("Wednesday");
        t1.setText("Python Application Program");
        t2.setText("Computer Graphics");
        t3.setText("Aptitude");
        t4.setText("Aptitude");
        t5.setText("System Software and C D");
        t6.setText("Operating Systems");
        t7.setText("Library");
        lay1.setVisibility(View.VISIBLE);
        lay2.setVisibility(View.VISIBLE);
        lay3.setVisibility(View.VISIBLE);
    }
    public void thursday(View view)
    {
        day_of_week.setText("  Thursday");
        t1.setText("Cryptography,Network Security");
        t2.setText("Operating Systems");
        t3.setText("System Software and C D");
        t4.setText("Python Application Program");
        t5.setText("Operations Research");
        t6.setText("Aptitude");
        t7.setText("Aptitude");
        lay1.setVisibility(View.VISIBLE);
        lay2.setVisibility(View.VISIBLE);
        lay3.setVisibility(View.VISIBLE);
    }
    public void friday(View view)
    {
        day_of_week.setText("    Friday");
        t1.setText("Operations Research");
        t2.setText("Operations Research");
        t3.setText("Computer Graphics");
        t4.setText("Operating Systems");
        t5.setText("System Software and C D");
        t6.setText("Python Application Program");
        t7.setText("Cryptography,Network Security");
        lay1.setVisibility(View.VISIBLE);
        lay2.setVisibility(View.VISIBLE);
        lay3.setVisibility(View.VISIBLE);
    }
    public void saturday(View view)
    {
        day_of_week.setText("  Saturday");
        t1.setText("System Software and C D");
        t2.setText("Computer Graphics Laboratory");
        t3.setText("Computer Graphics Laboratory");
        t4.setText("Computer Graphics Laboratory");
        t5.setText("");
        t6.setText("");
        t7.setText("");
        lay1.setVisibility(View.INVISIBLE);
        lay2.setVisibility(View.INVISIBLE);
        lay3.setVisibility(View.INVISIBLE);
    }
}
