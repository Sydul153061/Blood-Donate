package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login_Page extends AppCompatActivity {
    private EditText UserNameEditText, PasswordEditText;
    private TextView TextView;
    private Button LoginBtn;
    private int counter= 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        this.setTitle("Login_Page");


        UserNameEditText=(EditText) findViewById(R.id.UserNameEditTextID);
        PasswordEditText=(EditText) findViewById(R.id.PasswordEditTextID);
        LoginBtn=(Button) findViewById(R.id.LoginButtonID);
        TextView=(TextView) findViewById(R.id.textViewID);
        TextView.setText("Incorrect attempts : 3");



    }

    public void LoginFunction(View view) {
        String UserName=UserNameEditText.getText().toString();
        String Password=PasswordEditText.getText().toString();


        if (UserName.equals("sydul15-3061@diu.edu.bd") && Password.equals("708085"))
        {
            Intent myIntent=new Intent(this,Home_Page.class);
            startActivity(myIntent);
            Toast.makeText(getApplicationContext(),"Login Successful",Toast.LENGTH_SHORT).show();
        }else {
            counter--;
           TextView.setText("Incorrect attempts : "+counter);
           if(counter==0)
           {
           LoginBtn.setEnabled(false);
           }
        }

    }
}