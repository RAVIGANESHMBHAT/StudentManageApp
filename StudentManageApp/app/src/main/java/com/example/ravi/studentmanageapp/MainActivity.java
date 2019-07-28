package com.example.ravi.studentmanageapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button edit;
TextView crypto,crypto1,crypto2,crypto3,crypto4,crypto5, cg,cg1,cg2,cg3,cg4,cg5;
TextView sd,sd1,sd2,sd3,sd4,sd5, os,os1,os2,os3,os4,os5, or,or1,or2,or3,or4,or5;
TextView pa,pa1,pa2,pa3,pa4,pa5, sl,sl1,sl2,sl3,sl4,sl5, cl,cl1,cl2,cl3,cl4,cl5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit=(Button)findViewById(R.id.edit);

        crypto=(TextView)findViewById(R.id.crypto);
        crypto1=(TextView)findViewById(R.id.crypto1);
        crypto2=(TextView)findViewById(R.id.crypto2);
        crypto3=(TextView)findViewById(R.id.crypto3);
        crypto4=(TextView)findViewById(R.id.crypto4);
        crypto5=(TextView)findViewById(R.id.crypto5);

        cg1=(TextView)findViewById(R.id.cg1 );
        cg2=(TextView)findViewById(R.id.cg2 );
        cg3=(TextView)findViewById(R.id.cg3 );
        cg4=(TextView)findViewById(R.id.cg4 );
        cg5=(TextView)findViewById(R.id.cg5 );

        sd1=(TextView)findViewById(R.id.sscd1 );
        sd2=(TextView)findViewById(R.id.sscd2 );
        sd3=(TextView)findViewById(R.id.sscd3 );
        sd4=(TextView)findViewById(R.id.sscd4 );
        sd5=(TextView)findViewById(R.id.sscd5 );

        os1=(TextView)findViewById(R.id.os1 );
        os2=(TextView)findViewById(R.id.os2 );
        os3=(TextView)findViewById(R.id.os3 );
        os4=(TextView)findViewById(R.id.os4 );
        os5=(TextView)findViewById(R.id.os5 );

        or1=(TextView)findViewById(R.id.or1 );
        or2=(TextView)findViewById(R.id.or2 );
        or3=(TextView)findViewById(R.id.or3 );
        or4=(TextView)findViewById(R.id.or4 );
        or5=(TextView)findViewById(R.id.or5 );

        pa1=(TextView)findViewById(R.id.pap1 );
        pa2=(TextView)findViewById(R.id.pap2 );
        pa3=(TextView)findViewById(R.id.pap3 );
        pa4=(TextView)findViewById(R.id.pap4 );
        pa5=(TextView)findViewById(R.id.pap5 );

        sl1=(TextView)findViewById(R.id.ssosl1 );
        sl2=(TextView)findViewById(R.id.ssosl2 );
        sl3=(TextView)findViewById(R.id.ssosl3 );
        sl4=(TextView)findViewById(R.id.ssosl4 );
        sl5=(TextView)findViewById(R.id.ssosl5 );

        cl1=(TextView)findViewById(R.id.cgl1 );
        cl2=(TextView)findViewById(R.id.cgl2 );
        cl3=(TextView)findViewById(R.id.cgl3 );
        cl4=(TextView)findViewById(R.id.cgl4 );
        cl5=(TextView)findViewById(R.id.cgl5 );

        Intent j=getIntent();
        String p=j.getStringExtra("cry1");
        String q=j.getStringExtra("cry2");
        String r=j.getStringExtra("cg1");
        String s=j.getStringExtra("cg2");
        String t=j.getStringExtra("sscd1");
        String u=j.getStringExtra("sscd2");
        String v=j.getStringExtra("os1");
        String w=j.getStringExtra("os2");
        String x=j.getStringExtra("or1");
        String y=j.getStringExtra("or2");
        String z=j.getStringExtra("pap1");
        String zz=j.getStringExtra("pap2");
        String zzz=j.getStringExtra("ssosl1");
        String zzzz=j.getStringExtra("ssosl2");
        String zzzzz=j.getStringExtra("cgl1");
        String zzzzzz=j.getStringExtra("cgl2");

        if(p!=null)
        {
            crypto1.setText("Classes held: "+p);
        }
        if(q!=null)
        {
            crypto2.setText("Classes attended: "+q);
            String cry=String.format("%.2f",(Float.parseFloat(q)/Float.parseFloat(p))*100);
            crypto3.setText("Percentage  :"+cry);
            if(Float.parseFloat(cry)>=85.00) {
                crypto4.setText("Status: No shortage");
                crypto5.setText("Note: Oops!! You dont have shortage of attendance...");
            }
            else {
                crypto4.setText("Status: Have shortage");
                double aa = Double.parseDouble(p), bb = Double.parseDouble(q);
                int a = 0;
                double ab = Double.parseDouble(cry);
                while (ab < 85.00) {
                    aa++;
                    bb++;
                    a++;
                    ab = (bb / aa) * 100;
                }
                crypto5.setText("Note: Should attend continuous " + Integer.toString(a) + " classes to overcome shortage of attendance!!");
            }
        }
        if(r!=null)
        {
            cg1.setText("Classes held: "+r);
        }
        if(s!=null)
        {
            cg2.setText("Classes attended: " +s);
            String cry=String.format("%.2f",(Float.parseFloat(s)/Float.parseFloat(r))*100);
            cg3.setText("Percentage  :"+cry);
            if(Float.parseFloat(cry)>=85.00) {
                cg4.setText("Status: No shortage");
                cg5.setText("Note: Oops!! You dont have shortage of attendance...");
            }
            else {
                cg4.setText("Status: Have shortage");
                double aa = Double.parseDouble(r), bb = Double.parseDouble(s);
                int a = 0;
                double ab = Double.parseDouble(cry);
                while (ab < 85.00) {
                    aa++;
                    bb++;
                    a++;
                    ab = (bb / aa) * 100;
                }
                cg5.setText("Note: Should attend continuous " + Integer.toString(a) + " classes to overcome shortage of attendance!!");
            }
        }
        if(t!=null)
        {
            sd1.setText("Classes held: "+t);
        }
        if(u!=null)
        {
            sd2.setText("Classes attended: "+u);
            String cry=String.format("%.2f",(Float.parseFloat(u)/Float.parseFloat(t))*100);
            sd3.setText("Percentage  :"+cry);
            if(Float.parseFloat(cry)>=85.00) {
                sd4.setText("Status: No shortage");
                sd5.setText("Note: Oops!! You dont have shortage of attendance...");
            }
            else {
                sd4.setText("Status: Have shortage");
                double aa = Double.parseDouble(t), bb = Double.parseDouble(u);
                int a = 0;
                double ab = Double.parseDouble(cry);
                while (ab < 85.00) {
                    aa++;
                    bb++;
                    a++;
                    ab = (bb / aa) * 100;
                }
                sd5.setText("Note: Should attend continuous " + Integer.toString(a) + " classes to overcome shortage of attendance!!");
            }
        }
        if(v!=null)
        {
            os1.setText("Classes held: "+v);
        }
        if(w!=null)
        {
            os2.setText("Classes attended: "+w);
            String cry=String.format("%.2f",(Float.parseFloat(w)/Float.parseFloat(v))*100);
            os3.setText("Percentage  :"+cry);
            if(Float.parseFloat(cry)>=85.00) {
                os4.setText("Status: No shortage");
                os5.setText("Note: Oops!! You dont have shortage of attendance...");
            }
            else {
                os4.setText("Status: Have shortage");
                double aa = Double.parseDouble(v), bb = Double.parseDouble(w);
                int a = 0;
                double ab = Double.parseDouble(cry);
                while (ab < 85.00) {
                    aa++;
                    bb++;
                    a++;
                    ab = (bb / aa) * 100;
                }
                os5.setText("Note: Should attend continuous " + Integer.toString(a) + " classes to overcome shortage of attendance!!");
            }
        }
        if(x!=null)
        {
            or1.setText("Classes held: "+x);
        }
        if(y!=null)
        {
            or2.setText("Classes attended: "+y);
            String cry=String.format("%.2f",(Float.parseFloat(y)/Float.parseFloat(x))*100);
            or3.setText("Percentage  :"+cry);
            if(Float.parseFloat(cry)>=85.00) {
                or4.setText("Status: No shortage");
                or5.setText("Note: Oops!! You dont have shortage of attendance...");
            }
            else {
                or4.setText("Status: Have shortage");
                double aa = Double.parseDouble(x), bb = Double.parseDouble(y);
                int a = 0;
                double ab = Double.parseDouble(cry);
                while (ab < 85.00) {
                    aa++;
                    bb++;
                    a++;
                    ab = (bb / aa) * 100;
                }
                or5.setText("Note: Should attend continuous " + Integer.toString(a) + " classes to overcome shortage of attendance!!");
            }
        }
        if(z!=null)
        {
            pa1.setText("Classes held: "+z);
        }
        if(zz!=null)
        {
            pa2.setText("Classes attended: "+zz);
            String cry=String.format("%.2f",(Float.parseFloat(zz)/Float.parseFloat(z))*100);
            pa3.setText("Percentage  :"+cry);
            if(Float.parseFloat(cry)>=85.00) {
                pa4.setText("Status: No shortage");
               pa5.setText("Note: Oops!! You dont have shortage of attendance...");
            }
            else {
                pa4.setText("Status: Have shortage");
                double aa = Double.parseDouble(z), bb = Double.parseDouble(zz);
                int a = 0;
                double ab = Double.parseDouble(cry);
                while (ab < 85.00) {
                    aa++;
                    bb++;
                    a++;
                    ab = (bb / aa) * 100;
                }
                pa5.setText("Note: Should attend continuous " + Integer.toString(a) + " classes to overcome shortage of attendance!!");
            }
        }
        if(zzz!=null)
        {
            sl1.setText("Classes held: "+zzz);
        }
        if(zzzz!=null)
        {
           sl2.setText("Classes attended: "+zzzz);
            String cry=String.format("%.2f",(Float.parseFloat(zzzz)/Float.parseFloat(zzz))*100);
            sl3.setText("Percentage  :"+cry);
            if(Float.parseFloat(cry)>=85.00) {
                sl4.setText("Status: No shortage");
                sl5.setText("Note: Oops!! You dont have shortage of attendance...");
            }
            else {
                sl4.setText("Status: Have shortage");
                double aa = Double.parseDouble(zzz), bb = Double.parseDouble(zzzz);
                int a = 0;
                double ab = Double.parseDouble(cry);
                while (ab < 85.00) {
                    aa++;
                    bb++;
                    a++;
                    ab = (bb / aa) * 100;
                }
                sl5.setText("Note: Should attend continuous " + Integer.toString(a) + " classes to overcome shortage of attendance!!");
            }
        }
        if(zzzzz!=null)
        {
            cl1.setText("Classes held: "+zzzzz);
        }
        if(zzzzzz!=null)
        {
            cl2.setText("Classes attended: "+zzzzzz);
            String cry=String.format("%.2f",(Float.parseFloat(zzzzzz)/Float.parseFloat(zzzzz))*100);
            cl3.setText("Percentage  :"+cry);
            if(Float.parseFloat(cry)>=85.00) {
                cl4.setText("Status: No shortage");
                cl5.setText("Note: Oops!! You dont have shortage of attendance...");
            }
            else {
                cl4.setText("Status: Have shortage");
                double aa = Double.parseDouble(zzzzz), bb = Double.parseDouble(zzzzzz);
                int a = 0;
                double ab = Double.parseDouble(cry);
                while (ab < 85.00) {
                    aa++;
                    bb++;
                    a++;
                    ab = (bb / aa) * 100;
                }
                cl5.setText("Note: Should attend continuous " + Integer.toString(a) + " classes to overcome shortage of attendance!!");
            }
        }



    }
    public void editing(View view)
    {
        Intent i=new Intent(MainActivity.this,editing_page.class);
        startActivity(i);


    }
    public void timetable(View view)
    {
        startActivity(new Intent(MainActivity.this,time_table.class));
    }

}
