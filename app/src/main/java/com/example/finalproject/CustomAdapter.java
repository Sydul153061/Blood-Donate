package com.example.finalproject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<Donor> {

    private Activity context;
    private List<Donor> donorList;
    private TextView t1,t2,t3,t4,t5,t6;



    public CustomAdapter(Activity context, List<Donor> donorList) {
        super(context, R.layout.sample_layout, donorList);
        this.context = context;
        this.donorList = donorList;
    }

    @NonNull
    @Override
    public View getView(int position,View convertView, ViewGroup parent) {


        LayoutInflater layoutInflater = context.getLayoutInflater();

       View view = layoutInflater.inflate(R.layout.sample_layout,null,true);


       Donor Donor =donorList.get(position);

        t1 =view.findViewById(R.id.nameTextViewId);
        t2 =view.findViewById(R.id.ageTextViewId);
        t3 =view.findViewById(R.id.cityTextViewId);
        t4 =view.findViewById(R.id.phoneTextViewId);
        t5 =view.findViewById(R.id.genderTextViewId);
        t6 =view.findViewById(R.id.bloodgroupTextViewId);


        t1.setText("Name :"+Donor.getName());
        t2.setText("Age :"+Donor.getAge());
        t3.setText("City :"+Donor.getCity());
        t4.setText("Phone :"+Donor.getPhone());
        t5.setText("Gender :"+Donor.getGender());
        t6.setText("BloodGroup :"+Donor.getBloodgroup());




        return view;
    }




}
