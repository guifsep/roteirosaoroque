package com.windows.roteirosaoroque;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class act_main extends AppCompatActivity {

    private Button btnIniciar;
    private Button btnComoFunciona;
    private Button btnQuemSomos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.act_main);
        btnIniciar = (Button) findViewById(R.id.btnIniciar);
        btnIniciar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(act_main.this, Pergunta1.class);
                startActivity(intent);
            }
        });
        btnComoFunciona = (Button) findViewById(R.id.btnComoFunciona);
        btnComoFunciona.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(act_main.this, act_comofunciona.class);
                startActivity(intent);
            }
        });
        btnQuemSomos = (Button) findViewById(R.id.btnQuemSomos);
        btnQuemSomos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(act_main.this, act_quemsomos.class);
                startActivity(intent);
            }
        });

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.logo);
    }
}
