package com.food.cencol.cencolfood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterSuccessful extends AppCompatActivity implements View.OnClickListener{

    Button btoLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_successful);

        btoLogin = (Button) findViewById(R.id.tologinbtn);

        btoLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.tologinbtn:
                startActivity(new Intent(this, Login.class));
        }
    }
}
