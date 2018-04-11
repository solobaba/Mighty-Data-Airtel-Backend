package com.example.mighty.mightydataairtelbackend;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.Toolbar;


public class MainActivity extends Activity {

    Button mButton;
    String code = "123";
    String ussdCode = "ussdCode";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button)findViewById(R.id.check_balance);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Check_Balance(code);
            }
        });

    }

    // Get airtel balance(*123# for airtel)
    private void Check_Balance(String code) {
        String ussdCode = "*" + code + Uri.encode("#");
        startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ussdCode)));
        startService(new Intent(this, USSDService.class));
        Toast.makeText(getApplicationContext(), ussdCode, Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_catalog, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.log_data:
                Check_Balance(code);
                return true;

            case R.id.check_balance_request:
                // do your sign-out stuff
                return true;

            case R.id.request_check:
                // do your sign-out stuff
                return true;

            case R.id.contact_network:
                // do your sign-out stuff
                return true;

            // case blocks for other MenuItems (if any)
        }
        return super.onOptionsItemSelected(item);
    }

//    public void dialNumber(View view) {
//        dailNumber("*123#");
//          startService(new Intent(this, USSDService.class));
//    }


}
