package sergiogutierrez.dev.currencyconverter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
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
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /****My Stuffs*****/


    //per dollar exchange rates:
    // usd ~ 1
    // yen ~ 112
    // pesos ~ 19
    // can ~ 1.35
    // eur ~ 0.9


    public void canToUsd(View view)
    {
        EditText usd = (EditText) findViewById(R.id.enteredAmount);
        String pseudoYen = usd.getText().toString();
        double yen = Math.round( Double.parseDouble(pseudoYen) / 1.35 );
        Toast.makeText(this, "The USD Amount Is:  $" + yen, Toast.LENGTH_SHORT).show();
    }

    public void usdToCan(View view)
    {
        EditText usd = (EditText) findViewById(R.id.enteredAmount);
        String pseudoYen = usd.getText().toString();
        double yen = Math.round( Double.parseDouble(pseudoYen) * 1.35 );
        Toast.makeText(this, "The CAN Amount Is:  $" + yen, Toast.LENGTH_SHORT).show();
    }

    public void eurToUsd(View view)
    {
        EditText usd = (EditText) findViewById(R.id.enteredAmount);
        String pseudoYen = usd.getText().toString();
        double yen = Math.round( Double.parseDouble(pseudoYen) / 0.9 );
        Toast.makeText(this, "The USD Amount Is:  $" + yen, Toast.LENGTH_SHORT).show();
    }

    public void usdToEur(View view)
    {
        EditText usd = (EditText) findViewById(R.id.enteredAmount);
        String pseudoYen = usd.getText().toString();
        double yen = Math.round( Double.parseDouble(pseudoYen) * 0.9 );
        Toast.makeText(this, "The EUR Amount Is:  €" + yen, Toast.LENGTH_SHORT).show();
    }

    public void pesosToUsd(View view)
    {
        EditText usd = (EditText) findViewById(R.id.enteredAmount);
        String pseudoYen = usd.getText().toString();
        double yen = Math.round( Double.parseDouble(pseudoYen) / 19.1 );
        Toast.makeText(this, "The USD Amount Is:  $" + yen, Toast.LENGTH_SHORT).show();
    }

    public void usdToPesos(View view)
    {
        EditText usd = (EditText) findViewById(R.id.enteredAmount);
        String pseudoYen = usd.getText().toString();
        double yen = Math.round( Double.parseDouble(pseudoYen) * 19.1 );
        Toast.makeText(this, "The Pesos Amount Is:  $" + yen, Toast.LENGTH_SHORT).show();
    }


    public void usdToYen(View view)
    {
        EditText usd = (EditText) findViewById(R.id.enteredAmount);
        String pseudoYen = usd.getText().toString();
        double yen = Math.round( Double.parseDouble(pseudoYen) * 112.0 );
        Toast.makeText(this, "The Yen Amount Is:  ¥" + yen, Toast.LENGTH_SHORT).show();
    }

    public void yenToUsd(View view)
    {
        EditText yen = (EditText) findViewById(R.id.enteredAmount);
        String pseudoUsd = yen.getText().toString();
        double usd = Math.round( Double.parseDouble(pseudoUsd) / 112.0 );
        Toast.makeText(this, "The USD Amount Is:  $" + usd, Toast.LENGTH_SHORT).show();
    }

}
