package com.example.gspl.labor;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Calendar;

public class NextActivity extends AppCompatActivity {


    Button date;
    DatePickerDialog datePickerDialog;
    Spinner spinner;
    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next_activity);

        date = (Button) findViewById(R.id.bt1);

        spinner=findViewById(R.id.spins);
        arrayList=new ArrayList<String>();
        arrayList.add("sqmt");
        arrayList.add("sqm");
        arrayList.add("Nos");
        arrayList.add("mm");
        arrayList.add("cm");
        arrayList.add("inc");
        arrayList.add("Mtr");
        arrayList.add("Feet");
        arrayList.add("Foot");
        arrayList.add("Km");
        arrayList.add("Mile");
        arrayList.add("Sq Ft");
        arrayList.add("sq mi");
        arrayList.add("M2");
        arrayList.add("M3");
        arrayList.add("MT");
        arrayList.add("RMT");
        arrayList.add("DM3");
        arrayList.add("CM3");
        arrayList.add("IN3");
        arrayList.add("YD3");
        arrayList.add("Acre");
        arrayList.add("Yard");
        arrayList.add("HA");
        arrayList.add("ml");
        arrayList.add("Ltr");
        arrayList.add("Gal");
        arrayList.add("bbl");
        arrayList.add("kgs");
        arrayList.add("Pound");
        arrayList.add("Bag");
        arrayList.add("other");
        adapter=new ArrayAdapter<String>(NextActivity.this,android.R.layout.simple_list_item_1,arrayList);
        spinner.setAdapter(adapter);



    }

    public void buokjt1(View view) {

        final Calendar c = Calendar.getInstance();
        int mYear = c.get(Calendar.YEAR);
        int mMonth = c.get(Calendar.MONTH);
        int mDay = c.get(Calendar.DAY_OF_MONTH); 

        datePickerDialog = new DatePickerDialog(NextActivity.this,
                new DatePickerDialog.OnDateSetListener() {

                    @Override
                    public void onDateSet(DatePicker view, int year,
                                          int monthOfYear, int dayOfMonth) {

                        date.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);

                    }
                }, mYear, mMonth, mDay);
        datePickerDialog.show();
    }
}





