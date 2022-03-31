package com.example.androidtoolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.androidtoolbar.fragments.SettingsFragment;
import com.example.androidtoolbar.fragments.StartFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Настраиваем toolbar
        setSupportActionBar(findViewById(R.id.toolbar));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        //getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_back);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu);

        // Стартуем стартовый фрагмент
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container_fragment, new StartFragment(), "Старт")
                .commit();
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.action_refresh:
                break;
            case R.id.action_add:
                break;
            case R.id.action_settings:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container_fragment, new SettingsFragment(), "Настройки")
                        .addToBackStack("Старт")
                        .commit();
                break;
        }
        return true;
    }
}