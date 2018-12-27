package com.example.amel.test;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class activity_affichage extends AppCompatActivity implements View.OnLongClickListener, AdapterView.OnItemLongClickListener, AlertDialog.OnClickListener {
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affichage);
        lv= (ListView) findViewById(R.id.lv);
        //ArrayAdapter ad=new ArrayAdapter(this,android.R.layout.simple_list_item_1,MainActivity.data);
        MyAdapteur ad=new MyAdapteur(this,activity_acceuil.data);

        lv.setAdapter(ad);
        lv.setOnItemLongClickListener(this);
    }


    @Override
    public void onClick(DialogInterface dialog, int which) {

    }

    @Override
    public boolean onLongClick(View v) {
        return false;
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        AlertDialog.Builder alert=new AlertDialog.Builder(this);
        alert.setTitle("Attention");
        alert.setMessage("Choisir une action");
        alert.setPositiveButton("Supprimer",this);
        alert.setNegativeButton("Supprimer tout",this);
        alert.setNeutralButton("Modifier",this);

        alert.show();

        return false;    }
}
