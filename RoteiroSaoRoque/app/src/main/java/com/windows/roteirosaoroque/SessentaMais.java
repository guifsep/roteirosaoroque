package com.windows.roteirosaoroque;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
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

public class SessentaMais extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Button btnSim60mais;
    private Button btnNao60mais;
    private Button btnVoltar60mais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_sessenta_mais);
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

        btnSim60mais = (Button) findViewById(R.id.btnSim60mais);
        btnSim60mais.setOnClickListener (new View.OnClickListener() {
            public void onClick (View v) {
                Intent intent = new Intent(SessentaMais.this, PerfilFamilia.class);
                startActivity(intent);
            }
        });

        btnNao60mais = (Button) findViewById(R.id.btnNao60mais);
        btnNao60mais.setOnClickListener (new View.OnClickListener() {
            public void onClick (View v) {
                Intent intent = new Intent(SessentaMais.this, PerfilMelhorIdade.class);
                startActivity(intent);
            }
        });

        btnVoltar60mais = (Button) findViewById(R.id.btnVoltar60mais);
        btnVoltar60mais.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(SessentaMais.this, Pergunta1.class);
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
        getMenuInflater().inflate(R.menu.sessenta_mais, menu);
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
            Intent intent = new Intent(SessentaMais.this, act_main.class);
            startActivity(intent);
        } else if (id == R.id.nav_comofunciona) {
            Intent intent = new Intent(SessentaMais.this, act_comofunciona.class);
            startActivity(intent);
        } else if (id == R.id.nav_quemsomos) {
            Intent intent = new Intent(SessentaMais.this, act_quemsomos.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
