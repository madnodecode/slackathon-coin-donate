package com.paypal.coin_donate;

/**
 * Created by mthyagarajan on 12/3/15.
 */

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class WelcomeActivity extends MainActivity{

    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_main);
        addListenerOnCauseButton();
    }

    public void addListenerOnCauseButton() {

        final Context context = this;

        button = (Button) findViewById(R.id.buttonCause);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, CauseActivity.class);
                startActivity(intent);
                Toast.makeText(context, "Cause Created Successfully !!!", Toast.LENGTH_SHORT).show();

            }

        });

    }

}
