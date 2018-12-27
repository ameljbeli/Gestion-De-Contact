package com.example.amel.test;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class activity_authentification extends AppCompatActivity implements View.OnClickListener {

    private Button b_val;
    private EditText ed_nom;
    private EditText ed_mdp;
    private Button b_quit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentification);
        b_val= (Button)findViewById(R.id.b_valider_auth);
        b_quit= (Button)findViewById(R.id.b_quitter_auth);
        ed_nom= (EditText) findViewById(R.id.id_nom_auth);
        ed_mdp= (EditText) findViewById(R.id.id_mdp_auth);

        //Ecouteurs d'events
        b_val.setOnClickListener(this);
        b_quit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==b_quit)
        {
            this.finish();
        }
        else
        {
            String n=ed_nom.getText().toString();
            String mdp=ed_mdp.getText().toString();
            if(n.equalsIgnoreCase("amel") && mdp.equalsIgnoreCase("123"))
            {
                Toast.makeText(activity_authentification.this,"succès",Toast.LENGTH_LONG);

                Intent i= new Intent(this,activity_acceuil.class);
                Bundle bundle = new Bundle();
                bundle.putString("nom",n);
                i.putExtras(bundle);
                startActivity(i);
            }
            else
            {
                Toast.makeText(activity_authentification.this,"échec",Toast.LENGTH_LONG);
            }

        }

    }
}
