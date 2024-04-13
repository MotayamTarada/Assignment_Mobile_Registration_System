////
////package com.example.assignment_registration_system;
////
////import androidx.appcompat.app.AppCompatActivity;
////
////import android.content.Intent;
////import android.os.Bundle;
////import android.widget.ArrayAdapter;
////import android.widget.ListView;
////import android.widget.Spinner;
////
////public class MainActivity3 extends AppCompatActivity {
////
////    private Spinner names;
////
////    private ListView data;
////
////    @Override
////    protected void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_main3);
////        initializeViews();
////        populateSpinnerWithNames();
////    }
////
////    private void initializeViews() {
////        names = findViewById(R.id.spiname);
////        data = findViewById(R.id.data);
////    }
////
////    private void populateSpinnerWithNames() {
////        String[] namesArray = getIntent().getStringArrayExtra("names"); // Retrieve the names array from Intent
////        if (namesArray != null && namesArray.length > 0) {
////            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, namesArray);
////            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
////            names.setAdapter(adapter);
////        }
////    }
////
////    private void populateListViewWithAlldata() {
////        Db_Set db = new Db_Set();
////        String[]dataArray = db.getAllStudents();
////        if (names.isSelected()) {
////            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_multiple_choice, dataArray);
////            data.setAdapter(adapter);
////        }
////    }
////
////
////}
//package com.example.assignment_registration_system;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.widget.ArrayAdapter;
//import android.widget.ListView;
//import android.widget.Spinner;
//import android.widget.AdapterView;
//
//public class MainActivity3 extends AppCompatActivity {
//
//    private Spinner names;
//    private ListView data;
//    private Db_Set db;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main3);
//        initializeViews();
//        populateSpinnerWithNames();
//        setupSpinnerListener();
//        db = new Db_Set();
//    }
//
//    private void initializeViews() {
//        names = findViewById(R.id.spiname);
//        data = findViewById(R.id.data);
//    }
//
//    private void populateSpinnerWithNames() {
//        String[] namesArray = getIntent().getStringArrayExtra("names"); // Retrieve the names array from Intent
//        if (namesArray != null && namesArray.length > 0) {
//            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, namesArray);
//            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//            names.setAdapter(adapter);
//        }
//    }
//
//    private void setupSpinnerListener() {
//        names.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, android.view.View view, int position, long id) {
//                // When an item is selected from the Spinner, populate the ListView with corresponding data
//                String selectedName = parent.getItemAtPosition(position).toString();
//                String[] allStudentsData = db.getAllStudents();
//                ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity3.this, android.R.layout.simple_list_item_1, allStudentsData);
//                data.setAdapter(adapter);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                // Do nothing if nothing is selected
//            }
//        });
//    }
//}
//package com.example.assignment_registration_system;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.widget.ArrayAdapter;
//import android.widget.ListView;
//import android.widget.Spinner;
//import android.widget.AdapterView;
//
//public class MainActivity3 extends AppCompatActivity {
//
//    private Spinner names;
//    private ListView data;
//    private Db_Set db;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main3);
//        initializeViews();
//        populateSpinnerWithNames();
//        setupSpinnerListener();
//        db = new Db_Set();
//    }
//
//    private void initializeViews() {
//        names = findViewById(R.id.spiname);
//        data = findViewById(R.id.data);
//    }
//
//    private void populateSpinnerWithNames() {
//        String[] namesArray = getIntent().getStringArrayExtra("names"); // Retrieve the names array from Intent
//        if (namesArray != null && namesArray.length > 0) {
//            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, namesArray);
//            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//            names.setAdapter(adapter);
//        }
//    }
//
//    private void setupSpinnerListener() {
//        names.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, android.view.View view, int position, long id) {
//                // When an item is selected from the Spinner, populate the ListView with corresponding data
//                String selectedName = parent.getItemAtPosition(position).toString();
//                String[] selectedStudentData = db.getStudentData(selectedName);
//                if (selectedStudentData != null) {
//                    ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity3.this, android.R.layout.simple_list_item_1, selectedStudentData);
//                    data.setAdapter(adapter);
//                }
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                // Do nothing if nothing is selected
//            }
//        });
//    }
//}
package com.example.assignment_registration_system;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.AdapterView;

public class MainActivity3 extends AppCompatActivity {

    private Spinner names;
    private ListView data;
    private Db_Set db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        db = new Db_Set();
        initializeViews();
        populateSpinnerWithNames();
        setupSpinnerListener();

    }

    private void initializeViews() {
        names = findViewById(R.id.spiname);
        data = findViewById(R.id.data);
    }

    private void populateSpinnerWithNames() {
        String[] namesArray = getIntent().getStringArrayExtra("names"); // Retrieve the names array from Intent
        if (namesArray != null && namesArray.length > 0) {
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, namesArray);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            names.setAdapter(adapter);
        }
    }


    private void setupSpinnerListener() {


        String[] allStudentData = getIntent().getStringArrayExtra("data");

        if (allStudentData != null) {
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, allStudentData);
            data.setAdapter(adapter);
        }
    }



}
