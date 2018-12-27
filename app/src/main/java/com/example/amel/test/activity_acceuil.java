package com.example.amel.test;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class activity_acceuil extends AppCompatActivity implements View.OnClickListener{

    private Button b_val , b_quit,b_aff;
    private EditText AName ;
    private TextView title;

    public static ArrayList<Contact> data= new ArrayList<Contact>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuil);

        Bundle bundle = getIntent().getExtras();
        String name=bundle.getString("nom");
        //AName.setText(name);

        b_val= (Button)findViewById(R.id.b_ajouter_accueil);
        b_quit= (Button) findViewById(R.id.b_quitter_accueil);
        b_aff= (Button) findViewById(R.id.b_afficher);
        title=(TextView)findViewById(R.id.txt_accueil);
        //if(!data.isEmpty())
        //{
        //  title.setText("Acceuil de M"+data.get(0).getName().toString());
        //}
        title.setText("Acceuil de "+name);

        b_val.setOnClickListener(this);
        b_quit.setOnClickListener(this);
        b_aff.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        if(v==b_quit)
        {
            this.finish();
        }
        else if (v==b_aff)
        {
            Intent i= new Intent(this,activity_affichage.class);
            startActivity(i);
        }
        else if (v==b_val)
        {
            Intent i= new Intent(this,activity_ajout.class);
            startActivity(i);
        }

    }
}
