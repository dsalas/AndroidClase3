package pe.com.pucp.dti.clase2;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import pe.com.pucp.dti.clase2.Fragments.AccountFragment;
import pe.com.pucp.dti.clase2.Fragments.ContactsFragment;
import pe.com.pucp.dti.clase2.Fragments.HomeFragment;

public class MainActivity extends AppCompatActivity {

    //Constants
    private static final String TAG = "MainActivity";

    //Views
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setObjects();
        showFragment(new HomeFragment())    ;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle item selection
        switch (item.getItemId())
        {
            case R.id.action_configuration:
            {
                Toast.makeText(this, getResources().getString(R.string.toast_text), Toast.LENGTH_SHORT).show();
                return true;
            }

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void setObjects() {
        setBottomNavigationView();
    }

    private void setBottomNavigationView() {
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_home:
                                Log.i(TAG,"Show Home");
                                showFragment(new HomeFragment());
                                break;
                            case R.id.action_contacts:
                                showFragment(new ContactsFragment());
                                Log.i(TAG,"Show Contacts");
                                break;
                            case R.id.action_account:
                                showFragment(new AccountFragment());
                                Log.i(TAG,"Show My Account");
                                break;
                            default:
                                Log.i(TAG,"Error");
                                break;
                        }
                        return true;
                    }
                });
        bottomNavigationView.setSelectedItemId(R.id.action_home);
    }


    private void showFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.content, fragment).commit();
    }
}
