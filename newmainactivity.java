package com.example.signuppage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class newmainactivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_login_tab_fragmant);

        username = findViewById(R.id.login_email);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.login_button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("user") && password.getText().toString().equals(1234))
                    // **CHANGE THE VALUES**
                    Toast.makeText(newmainactivity.this, "Successfully logged in!", Toast.LENGTH_SHORT).show();
                else {
                    Toast.makeText(newmainactivity.this, "Attempt to login has failed. Try again.", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
}