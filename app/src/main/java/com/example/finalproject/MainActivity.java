package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

   private EditText Name, Age, City, Phone;
   private Button InsertBTN;
   private RadioButton Male,Female,Other;
   private Spinner BloodGroup;
   String gender;

   DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setTitle("Donor Information Entry");

        databaseReference = FirebaseDatabase.getInstance().getReference("Donor");

        Name=(EditText) findViewById(R.id.nameID);
        Age=(EditText) findViewById(R.id.ageID);
        City=(EditText) findViewById(R.id.cityID);
        Phone=(EditText) findViewById(R.id.phoneID);
        Male=(RadioButton) findViewById(R.id.maleBTN);
        Female=(RadioButton) findViewById(R.id.femaleBTN);
        Other=(RadioButton) findViewById(R.id.otherBTN);
        BloodGroup= (Spinner) findViewById(R.id.BloodGroupID);


        InsertBTN=(Button) findViewById(R.id.insertBTN);


    }

    public void InsertDataBTN(View view) {

        saveData();

        Intent myIntent=new Intent(this,DetailsActivity.class);
        startActivity(myIntent);
    }

    public void saveData()
    {
        String name= Name.getText().toString().trim();
        String age=Age.getText().toString().trim();
        String city=City.getText().toString().trim();
        String phone=Phone.getText().toString().trim();
        String bloodgroup=BloodGroup.getSelectedItem().toString();
        if (Male.isChecked()) {
            gender = Male.getText().toString().trim();
        } else if (Female.isChecked()) {
            gender = Female.getText().toString().trim();
        } else if (Other.isChecked()) {
            gender = Other.getText().toString().trim();
        }

        String key = databaseReference.push().getKey();

        Donor donor = new Donor(name,age,city,phone,gender,bloodgroup);

        databaseReference.child(key).setValue(donor);


        Name.setText(null);
        Age.setText(null);
        City.setText(null);
        Phone.setText(null);

    }

    public void BackBTN(View view) {
    }
}