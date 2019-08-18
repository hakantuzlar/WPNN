package com.bishat.wpn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class welcome_activity extends AppCompatActivity {

    private Button btnWelcomeRegister, btnWelcomeLogin;

    public void init() {
        btnWelcomeLogin = (Button) findViewById(R.id.btnWelcomeLogin);
        btnWelcomeRegister = (Button) findViewById(R.id.btnWelcomeRegister);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        init();
        btnWelcomeLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLogin = new Intent(welcome_activity.this,LoginActivity.class);
                startActivity(intentLogin);
            }
        });

        btnWelcomeRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentRegistir = new Intent(welcome_activity.this,RegisterActivity.class);
                startActivity(intentRegistir);
            }
        });

    }


}
