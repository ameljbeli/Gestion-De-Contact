package com.example.amel.test;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by ASUS on 07/11/2018.
 */

public class MyAdapteur extends BaseAdapter {


    Context c;
    ArrayList<Contact> Ct;

    @Override
    public int getCount() {
        return Ct.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public MyAdapteur(Context c, ArrayList<Contact>Ct)
    {
        this.c=c;
        this.Ct=Ct;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView T1=new TextView(c);
        TextView T2=new TextView(c);
        TextView T3=new TextView(c);

        LinearLayout L1=new LinearLayout(c);
        LinearLayout L2=new LinearLayout(c);

        L1.setOrientation(LinearLayout.HORIZONTAL);
        L2.setOrientation(LinearLayout.VERTICAL);


        L2.addView(T2);
        L2.addView(T3);
        L1.addView(T1);
        L1.addView(L2);



        T1.setText(Ct.get(i).getName());
        T2.setText(Ct.get(i).getPassword());
        T3.setText(Ct.get(i).getTel());

        return L1;
    }
}
