package com.abdulrehman.android.itempire;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle actionBarDrawerToggle;

    WebView webView;

    String Url = "http://itempire.net/index.php?display=index";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawer);

        navigationView = findViewById(R.id.navigation);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout,toolbar, R.string.app_name, R.string.app_name);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        
        webView = findViewById(R.id.webview);


        WebSettings webViewSettings = webView.getSettings();
        webViewSettings.setJavaScriptEnabled(true);
        webView.loadUrl(Url);






        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.home) {
                    Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, HomeActivity.class));
                }
                if (item.getItemId() == R.id.about) {
                    Toast.makeText(MainActivity.this, "About Us", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, AboutActivity.class));
                }
                if (item.getItemId() == R.id.portfolio) {
                    Toast.makeText(MainActivity.this, "Portfolio", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, PortfolioActivity.class));
                }
                if (item.getItemId() == R.id.team) {
                    Toast.makeText(MainActivity.this, "Team", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, TeamActivity.class));
                }
                if (item.getItemId() == R.id.gallery) {
                    Toast.makeText(MainActivity.this, "Gallery", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, GalleryActivity.class));
                }
                if (item.getItemId() == R.id.contact) {
                    Toast.makeText(MainActivity.this, "Contact Us", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, ContactActivity.class));
                }
                if (item.getItemId() == R.id.skills) {
                    Toast.makeText(MainActivity.this, "Skills", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, SkillsActivity.class));
                }
                return false;
            }
        });


    }

}
