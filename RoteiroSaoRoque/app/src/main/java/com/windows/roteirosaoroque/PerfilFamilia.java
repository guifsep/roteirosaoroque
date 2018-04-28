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
import android.widget.ImageView;

public class PerfilFamilia extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Button btnRoteiroFamilia;
    private Button btnRefazerFamilia;
    private Button btnSairFamilia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_perfil_familia);
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

        btnRoteiroFamilia = (Button) findViewById(R.id.btnRoteiroFamilia);
        btnRoteiroFamilia.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                Intent intent = new Intent(PerfilFamilia.this, RoteiroFamilia.class);
                startActivity(intent);
            }
        });

        btnRefazerFamilia = (Button) findViewById (R.id.btnRefazerFamilia);
        btnRefazerFamilia.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                Intent intent = new Intent(PerfilFamilia.this, Pergunta1.class);
                startActivity(intent);
            }
        });

        btnSairFamilia = (Button) findViewById (R.id.btnSairFamilia);
        btnSairFamilia.setOnClickListener (new View.OnClickListener() {
            public void onClick (View v) {
                Intent intent = new Intent (PerfilFamilia.this, act_main.class);
                startActivity (intent);
            }
        });

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.logo);

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
        getMenuInflater().inflate(R.menu.perfil_familia, menu);
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
            Intent intent = new Intent(PerfilFamilia.this, act_main.class);
            startActivity(intent);
        } else if (id == R.id.nav_comofunciona) {
            Intent intent = new Intent(PerfilFamilia.this, act_comofunciona.class);
            startActivity(intent);
        } else if (id == R.id.nav_quemsomos) {
            Intent intent = new Intent(PerfilFamilia.this, act_quemsomos.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
