package com.example.utkar.swingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class SearchActivity extends AppCompatActivity {
    public static String s;
    private ListView lv;
    ArrayAdapter<String> adapter;
    EditText inputSearch;
    ArrayList<HashMap<String, String>> productList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        String products[] = {"Delhi", "Mumbai", "Hyderabad", "Banglore", "Channai",
                "Rajasthan", "Kolkata",
                "Pune", "Tamil Nadu", "Punjab", "Goa"};

        lv = (ListView) findViewById(R.id.list_view);
        inputSearch = (EditText) findViewById(R.id.inputSearch);
        adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.product_name, products);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                s = lv.getItemAtPosition(i).toString();

                if (s == "Rajasthan") {
                    Intent intent = new Intent(getApplicationContext(), SwingActivity.class);
                    startActivity(intent);
                    finish();
                } else if (s == "Delhi") {

                }


                // If you want to close the adapter
            }
        });


        inputSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                SearchActivity.this.adapter.getFilter().filter(charSequence);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }


}
