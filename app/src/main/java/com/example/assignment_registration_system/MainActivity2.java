
package com.example.assignment_registration_system;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private Spinner typeofperiod;
    private EditText firstname;
    private EditText lastname;
    private EditText nationality;
    private EditText dateofbirth;
    private EditText email;
    private EditText phone;
    private TextView message;
    private Button btnadd;
    private Button btnview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initializeViews();
        setupSpinnerData();

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setData();
            }
        });

    }

    @SuppressLint("WrongViewCast")
    private void initializeViews() {
        typeofperiod = findViewById(R.id.spinperiod);
        firstname = findViewById(R.id.firstname);
        lastname = findViewById(R.id.lastname);
        nationality = findViewById(R.id.nationality);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);

        dateofbirth = findViewById(R.id.dateofbirth);
        message = findViewById(R.id.message);

        btnadd = findViewById(R.id.btnadd);
        btnview = findViewById(R.id.btnview);
    }

        private void setupSpinnerData() {
        String[] arr = getSpinnerTypeOfPeriodData();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, arr);
        typeofperiod.setAdapter(adapter);
    }

    private String[] getSpinnerTypeOfPeriodData() {
        Db_Set db = new Db_Set();
        return db.typeofperiod();
    }


    private void setData() {
        String fname, lname, nation, emailStr, phoneStr, date, tperiod;
        fname = firstname.getText().toString();
        lname = lastname.getText().toString();
        nation = nationality.getText().toString();
        emailStr = email.getText().toString();
        phoneStr = phone.getText().toString();
        date = dateofbirth.getText().toString();
        tperiod = typeofperiod.getSelectedItem().toString();
        Students student = new Students(fname, lname, nation, date, Integer.parseInt(phoneStr), emailStr, tperiod);
        Db_Set db = new Db_Set();
        db.addStudent(student);
        message.setText("Add is successfully");
        message.setVisibility(View.VISIBLE);
        btnview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String[] names = db.getAllNames();
                String[] data = db.getAllStudentsData(); // Retrieve all student data
                startMainActivity3(names, data); // Pass both names and data arrays to MainActivity3
            }
        });
    }

    private void startMainActivity3(String[] names, String[] data) {
        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
        intent.putExtra("names", names); // Pass names array
        intent.putExtra("data", data); // Pass data array
        startActivity(intent);
    }
}
