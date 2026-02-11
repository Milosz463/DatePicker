package com.example.myapplication;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
EditText editTextKto;
Button buttonData, buttonDodaj;
ListView listView;
ArrayAdapter<Oosoby> arrayAdapter;
ArrayList<Oosoby>lista=new ArrayList<>();
Calendar calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        editTextKto=findViewById(R.id.editTextText);
        buttonData=findViewById(R.id.button);
        buttonDodaj=findViewById(R.id.button2);
        listView=findViewById(R.id.ListView);

        buttonData.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        DatePickerDialog datePickerDialog=new DatePickerDialog(MainActivity.this,
                                new DatePickerDialog.OnDateSetListener() {
                                    @Override
                                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                                        Toast.makeText(MainActivity.this, "rok"+i+"mc"+i1+"dzien"+i2, Toast.LENGTH_SHORT).show();
                                        calendar=Calendar.getInstance();
                                        calendar.set(Calendar.YEAR,i);
                                        calendar.set(Calendar.MONTH,i1+1);
                                        calendar.set(Calendar.DAY_OF_MONTH,i2);
                                        buttonData.setText("rok"+i+" mc "+(i1+1)+" dzien"+i2);
                                    }
                                },1990,4,1);
                        datePickerDialog.show();
                    }
                }
        );

        buttonDodaj.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String imie=editTextKto.getText().toString();
                        arrayAdapter.add(new Oosoby(imie,calendar));
                        arrayAdapter.notifyDataSetChanged();
                    }
                }
        );

        lista.add(new Oosoby("Jaś",2000,1,2));
        lista.add(new Oosoby("Małgosia",2008,9,30));
        lista.add(new Oosoby("Ed",2007,3,4));

        arrayAdapter=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,lista);
        listView.setAdapter(arrayAdapter);


    }

}