package udacity.tab.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MyAppPortfolio extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_app_portfolio);

        Button button;

        button = (Button) findViewById(R.id.button_app1);
        button.setOnClickListener(this);
        button = (Button) findViewById(R.id.button_app2);
        button.setOnClickListener(this);
        button = (Button) findViewById(R.id.button_app3);
        button.setOnClickListener(this);
        button = (Button) findViewById(R.id.button_app4);
        button.setOnClickListener(this);
        button = (Button) findViewById(R.id.button_app5);
        button.setOnClickListener(this);
        button = (Button) findViewById(R.id.button_app6);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        String app = null;

        switch (view.getId()) {
            case R.id.button_app1:
                app = getString(R.string.app1_name);
                break;
            case R.id.button_app2:
                app = getString(R.string.app2_name);
                break;
            case R.id.button_app3:
                app = getString(R.string.app3_name);
                break;
            case R.id.button_app4:
                app = getString(R.string.app4_name);
                break;
            case R.id.button_app5:
                app = getString(R.string.app5_name);
                break;
            case R.id.button_app6:
                app = getString(R.string.app6_name);
                break;
        }

        if (app != null) {
            Toast.makeText(getApplicationContext(), String.format(getString(R.string.button_message), app), Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_app_portfolio, menu);
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
}
