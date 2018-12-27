package com.example.amel.test;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activity_ajout extends AppCompatActivity implements View.OnClickListener {
    EditText nom,pass,tel;
    Button ajout,quit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout);
        nom=(EditText)findViewById(R.id.ed_nom_ajout);
        pass=(EditText)findViewById(R.id.ed_pre_ajout);
        tel= (EditText) findViewById(R.id.ed_tel_ajout);
        ajout=(Button)findViewById(R.id.btn_valid);
        quit=(Button)findViewById(R.id.btn_quitter);

        ajout.setOnClickListener( this);
        quit.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view==ajout)
        {
            String nom1=nom.getText().toString();
            String pass1=pass.getText().toString();
            String tel1=tel.getText().toString();
            Contact c=new Contact(nom1,pass1,tel1);
            activity_acceuil.data.add(c);
            this.finish();
        }
        else if (view==quit)
            this.finish();


    }
}
