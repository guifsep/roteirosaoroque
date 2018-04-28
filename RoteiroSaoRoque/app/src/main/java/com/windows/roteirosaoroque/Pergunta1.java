package com.windows.roteirosaoroque;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class Pergunta1 extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Button btn18a30;
    private Button btn30a60;
    private Button btn60mais;
    private Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_pergunta1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        android.support.v7.app.ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#800000")));

        btn18a30 = (Button) findViewById(R.id.btn18a30);
        btn18a30.setOnClickListener (new View.OnClickListener() {
            public void onClick (View v) {
                Intent intent = new Intent(Pergunta1.this, DezoitoTrinta.class);
                startActivity(intent);
            }
        });

        btn30a60 = (Button) findViewById(R.id.btn30a60);
        btn30a60.setOnClickListener (new View.OnClickListener() {
            public void onClick (View v) {
                Intent intent = new Intent(Pergunta1.this, TrintaSessenta.class);
                startActivity(intent);
            }
        });

        btn60mais = (Button) findViewById(R.id.btn60mais);
        btn60mais.setOnClickListener (new View.OnClickListener() {
            public void onClick (View v) {
                Intent intent = new Intent(Pergunta1.this, SessentaMais.class);
                startActivity(intent);
            }
        });

        btnVoltar = (Button) findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Pergunta1.this, act_main.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.pergunta1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Intent intent = new Intent(Pergunta1.this, act_main.class);
            startActivity(intent);
        } else if (id == R.id.nav_comofunciona) {
            Intent intent = new Intent(Pergunta1.this, act_comofunciona.class);
            startActivity(intent);
        } else if (id == R.id.nav_quemsomos) {
            Intent intent = new Intent(Pergunta1.this, act_quemsomos.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
