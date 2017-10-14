package com.aula.gama.myapplication;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TableRow;
import android.widget.Toast;

import com.aula.gama.myapplication.Screen2Activity.Screen2;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       //final LinearLayout ll = new LinearLayout(this);
       // getActionBar();
       // ActionBar actionBar = getActionBar();
       // actionBar.setIcon(R.drawable.gamaiconmdpi);

        Context context = getApplicationContext();
        CharSequence text = "opened";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        final CheckBox cb = new CheckBox(this);
        ScrollView scrl = new ScrollView(this);
        final LinearLayout lil = new LinearLayout(this);
        lil.setOrientation(LinearLayout.VERTICAL);
        scrl.addView(lil);
        final EditText EDIT_TEXT = new EditText(this);
        EDIT_TEXT.setText("");
        lil.addView(EDIT_TEXT);
        Button btn = new Button(this);
        btn.setText("Add");
        lil.addView(btn);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                //Intent intent = new Intent(MainActivity.this, Screen2.class);
                //startActivity(intent);
                for(int i = 0; i < 20; i++) {
                    CheckBox cb = new CheckBox(getApplicationContext());
                    cb.setText("I'm dynamic!");
                    lil.addView(cb);
                }

            }
        });



    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                // User chose the "Settings" item, show the app settings UI...
                return true;

            case R.id.action_favorite:
                // User chose the "Favorite" action, mark the current item
                // as a favorite...
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }
}
