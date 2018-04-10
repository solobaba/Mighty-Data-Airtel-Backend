package com.example.mighty.mightydataairtelbackend;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button mButton;
    String code = "123";

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
    }

//    public void dialNumber(View view) {
//        dailNumber("*123#");
//          startService(new Intent(this, USSDService.class));
//    }

}
