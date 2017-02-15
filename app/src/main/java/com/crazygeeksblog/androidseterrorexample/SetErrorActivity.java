package com.crazygeeksblog.androidseterrorexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SetErrorActivity extends AppCompatActivity {

    private EditText etUsername, etPassword;
    private Button btnValidate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_error);

        etUsername = (EditText) findViewById(R.id.etUserName);
        etPassword = (EditText) findViewById(R.id.etPassword);
        btnValidate= (Button) findViewById(R.id.btnValidate);

        btnValidate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                // Show error message if username is empty
                if(userName.equals("")) {
                    etUsername.setError(getString(R.string.error_username));
                    return;
                }
                // Show error message if password is empty
                if(password.equals("")){
                    etPassword.setError(getString(R.string.error_password));
                    return;
                }
                // Show success toast
                Toast.makeText(getApplicationContext(),
                        R.string.success_message,Toast.LENGTH_LONG).show();
            }
        });
    }
}
