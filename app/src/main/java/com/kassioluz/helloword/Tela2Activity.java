package com.kassioluz.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Tela2Activity extends AppCompatActivity {

    String member;
    TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        Intent intent = getIntent();
        Bundle members = intent.getExtras();
        if(members != null){
            member = members.getString("name", "Ops, Nenhum membro encontrado");
        }

        name = (TextView) findViewById(R.id.name);

        name.setText(member);
    }
}
