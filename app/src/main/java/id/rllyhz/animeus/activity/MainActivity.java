package id.rllyhz.animeus.activity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

import id.rllyhz.animeus.R;
import id.rllyhz.animeus.ui.AnimeFragment;
import id.rllyhz.animeus.ui.CharacterFragment;
import id.rllyhz.animeus.ui.MangaFragment;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private Toolbar toolbar;
    private DrawerLayout drawer;
    private NavigationView navigationView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setToolbar();
        initNavigationView();
        initDrawerMenu();

        // is the first time
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_layout,
                    new AnimeFragment()).commit();

            navigationView.setCheckedItem(R.id.drawer_menu_anime);
        }

        // SEARCH endpoint hasn't been implemented yet!

        // type: (anime, manga, character, person)
        // https://api.jikan.moe/v3/search/type?q=Fate/Zero&page=1
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.drawer_menu_anime:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_layout,
                        new AnimeFragment()).commit();
                break;
            case R.id.drawer_menu_manga:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_layout,
                        new MangaFragment()).commit();
                break;
            case R.id.drawer_menu_character:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_layout,
                        new CharacterFragment()).commit();
                break;
            case R.id.drawer_menu_share:
                showToast("Share");
                break;
            case R.id.drawer_menu_send:
                showToast("Send");
                break;
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void initNavigationView() {
        navigationView = findViewById(R.id.navigation_layout);
        navigationView.setNavigationItemSelectedListener(this);
    }

    private void initDrawerMenu() {
        drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }

    private void setToolbar() {
        toolbar = findViewById(R.id.toolbar_layout);
        this.setSupportActionBar(toolbar);
    }

    private void showToast(CharSequence message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
