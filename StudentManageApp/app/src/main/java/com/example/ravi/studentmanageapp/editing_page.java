package com.example.ravi.studentmanageapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class editing_page extends AppCompatActivity {
    EditText crypt1,crypt2,cg1,cg2,sscd1,sscd2,os1,os2,or1,or2,pap1,pap2,ssosl1,ssosl2,cgl1,cgl2;
    int count=0,count1=0;
    String aa,bb,cc,dd,ee,ff,gg,hh,ii,jj,kk,ll,mm,nn,oo,pp="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editing_page);
        crypt1=(EditText)findViewById(R.id.crypt1);
        crypt2=(EditText)findViewById(R.id.crypt2);
        cg1=(EditText)findViewById(R.id.cg1);
        cg2=(EditText)findViewById(R.id.cg2);
        sscd1=(EditText)findViewById(R.id.sscd1);
        sscd2=(EditText)findViewById(R.id.sscd2);
        os1=(EditText)findViewById(R.id.os1);
        os2=(EditText)findViewById(R.id.os2);
        or1=(EditText)findViewById(R.id.or1);
        or2=(EditText)findViewById(R.id.or2);
        pap1=(EditText)findViewById(R.id.pap1);
        pap2=(EditText)findViewById(R.id.pap2);
        ssosl1=(EditText)findViewById(R.id.ssosl1);
        ssosl2=(EditText)findViewById(R.id.ssosl2);
        cgl1=(EditText)findViewById(R.id.cgl1);
        cgl2=(EditText)findViewById(R.id.cgl2);

    }
    public void submit(View view)
    {
        Intent i=new Intent(editing_page.this,MainActivity.class);
        String aa=crypt1.getText().toString(),bb=crypt2.getText().toString(),cc=cg1.getText().toString(),dd=cg2.getText().toString(),
                ee=sscd1.getText().toString(),ff=sscd2.getText().toString(),gg=os1.getText().toString();
        String hh=os2.getText().toString(),ii=or1.getText().toString(),jj=or2.getText().toString(),kk=pap1.getText().toString(),
                ll=pap2.getText().toString(),mm=ssosl1.getText().toString();
        String nn=ssosl2.getText().toString(),oo=cgl1.getText().toString(),pp=cgl2.getText().toString();


        if(!aa.isEmpty() && !bb.isEmpty())
        {
            count1++;
            boolean a1 = TextUtils.isDigitsOnly(crypt1.getText()),a2 = TextUtils.isDigitsOnly(crypt2.getText());
            if(a1==true&&a2==true) {
                if (Integer.parseInt(aa) >= Integer.parseInt(bb)) {
                    i.putExtra("cry1", aa);
                    i.putExtra("cry2", bb);
                    count++;
                } else {
                    Toast.makeText(editing_page.this, "Fill the fields with proper values", Toast.LENGTH_SHORT).show();
                    count=count1=0;
                }
            }
            else {
                Toast.makeText(editing_page.this, "Fill the fields with proper values", Toast.LENGTH_SHORT).show();
                count = count1 = 0;
            }
        }
        if(!cc.isEmpty()&&!dd.isEmpty()){
            count1++;
            boolean a1 = TextUtils.isDigitsOnly(crypt1.getText()),a2 = TextUtils.isDigitsOnly(crypt2.getText());
            if(a1==true&&a2==true) {
                if (Integer.parseInt(cc) >= Integer.parseInt(dd)) {
                    i.putExtra("cg1", cc);
                    i.putExtra("cg2", dd);
                    count++;
                } else {
                    Toast.makeText(editing_page.this, "Fill the fields with proper values", Toast.LENGTH_SHORT).show();
                    count=count1=0;
                }
            }
            else {
                Toast.makeText(editing_page.this, "Fill the fields with proper values", Toast.LENGTH_SHORT).show();
                count=count1=0;
            }
       }
        if(!ee.isEmpty()&&!ff.isEmpty()){
            count1++;
            boolean a1 = TextUtils.isDigitsOnly(crypt1.getText()),a2 = TextUtils.isDigitsOnly(crypt2.getText());
            if(a1==true&&a2==true) {
                if (Integer.parseInt(ee) >= Integer.parseInt(ff)) {
                    i.putExtra("sscd1", ee);
                    i.putExtra("sscd2", ff);
                    count++;
                } else {
                    Toast.makeText(editing_page.this, "Fill the fields with proper values", Toast.LENGTH_SHORT).show();
                    count = count1 = 0;
                }
            }
            else {
                Toast.makeText(editing_page.this, "Fill the fields with proper values", Toast.LENGTH_SHORT).show();
                count = count1 = 0;
            }
        }
        if(!gg.isEmpty()&&!hh.isEmpty()){
            count1++;
            boolean a1 = TextUtils.isDigitsOnly(crypt1.getText()),a2 = TextUtils.isDigitsOnly(crypt2.getText());
            if(a1==true&&a2==true) {
                if (Integer.parseInt(gg) >= Integer.parseInt(hh)) {
                    i.putExtra("os1", gg);
                    i.putExtra("os2", hh);
                    count++;
                } else {
                    Toast.makeText(editing_page.this, "Fill the fields with proper values", Toast.LENGTH_SHORT).show();
                    count=count1=0;
                }
            }
            else {
                Toast.makeText(editing_page.this, "Fill the fields with proper values", Toast.LENGTH_SHORT).show();
                count=count1=0;
            }
        }
        if(!ii.isEmpty()&&!jj.isEmpty()){
            count1++;
            boolean a1 = TextUtils.isDigitsOnly(crypt1.getText()),a2 = TextUtils.isDigitsOnly(crypt2.getText());
            if(a1==true&&a2==true) {
                if (Integer.parseInt(ii) >= Integer.parseInt(jj)) {
                    i.putExtra("or1", ii);
                    i.putExtra("or2", jj);
                    count++;
                } else {
                    Toast.makeText(editing_page.this, "Fill the fields with proper values", Toast.LENGTH_SHORT).show();
                    count=count1=0;
                }
            }
            else {
                Toast.makeText(editing_page.this, "Fill the fields with proper values", Toast.LENGTH_SHORT).show();
                count=count1=0;
            }
        }
        if(!kk.isEmpty()&&!ll.isEmpty()){
            count1++;
            boolean a1 = TextUtils.isDigitsOnly(crypt1.getText()),a2 = TextUtils.isDigitsOnly(crypt2.getText());
            if(a1==true&&a2==true) {
                if (Integer.parseInt(kk) >= Integer.parseInt(ll)) {
                    i.putExtra("pap1", kk);
                    i.putExtra("pap2", ll);
                    count++;
                }else {
                    Toast.makeText(editing_page.this, "Fill the fields with proper values", Toast.LENGTH_SHORT).show();
                    count=count1=0;
                }
            }
            else {
                Toast.makeText(editing_page.this, "Fill the fields with proper values", Toast.LENGTH_SHORT).show();
                count=count1=0;
            }
        }
        if(!mm.isEmpty()&&!nn.isEmpty()){
            count1++;
            boolean a1 = TextUtils.isDigitsOnly(crypt1.getText()),a2 = TextUtils.isDigitsOnly(crypt2.getText());
            if(a1==true&&a2==true) {
                if (Integer.parseInt(mm) >= Integer.parseInt(nn)) {
                    i.putExtra("ssosl1", mm);
                    i.putExtra("ssosl2", nn);
                    count++;
                } else {
                    Toast.makeText(editing_page.this, "Fill the fields with proper values", Toast.LENGTH_SHORT).show();
                    count=count1=0;
                }
            }
            else {
                Toast.makeText(editing_page.this, "Fill the fields with proper values", Toast.LENGTH_SHORT).show();
                count=count1=0;
            }
        }
        if(!oo.isEmpty()&&!pp.isEmpty()){
            count1++;
            boolean a1 = TextUtils.isDigitsOnly(crypt1.getText()),a2 = TextUtils.isDigitsOnly(crypt2.getText());
            if(a1==true&&a2==true) {
                if (Integer.parseInt(oo) >= Integer.parseInt(pp)) {
                    i.putExtra("cgl1", oo);
                    i.putExtra("cgl2", pp);
                    count++;
                }else {
                    Toast.makeText(editing_page.this, "Fill the fields with proper values", Toast.LENGTH_SHORT).show();
                    count=count1=0;

                }
            }
            else {
                Toast.makeText(editing_page.this, "Fill the fields with proper values", Toast.LENGTH_SHORT).show();
                count=count1=0;
            }
        }


        if((count1==count)&&count!=0)
        {
            startActivity(i);
        }
        else {
            Toast.makeText(editing_page.this,"Fill the fields with proper values",Toast.LENGTH_SHORT).show();

        }
    }
    public void back(View view)
    {
        Intent i=new Intent(editing_page.this,MainActivity.class);
        startActivity(i);
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("cry1",aa);
        outState.putString("cry2",bb);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        aa=savedInstanceState.getString("cry1");
        crypt1.setText(aa);
        bb=savedInstanceState.getString("cry2");
        crypt2.setText(bb);
    }
}