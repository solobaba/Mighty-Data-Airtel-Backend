package com.example.mighty.mightydataairtelbackend;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    // Get airtel balance(*123# for airtel)

    public void dialNumber(String code) {
        String ussdCode = "*" + code + Uri.encode("#");
        startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ussdCode)));
        startService(new Intent(this, USSDService.class));
        dailNumber("*123#");
    }

    private void dailNumber(String s) {
    }

}
