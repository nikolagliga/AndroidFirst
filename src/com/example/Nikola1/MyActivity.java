package com.example.Nikola1;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MyActivity extends Activity implements View.OnClickListener {
    /**
     * Called when the activity is first created.
     */
    Button button1;
    ArrayList<String> tasks;
    MainActivityListAdapter listAdapter;
    ListView listView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_activity);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        listView = (ListView) findViewById(R.id.listView);
        listAdapter = new MainActivityListAdapter(tasks);
        listView.setAdapter(listAdapter);


    }



    private void button1Click() {

       startActivity(new Intent("com.exemple.Nikola1.secondActivity"));

    }

    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button1:
                button1Click();
                break;
        }


    }

}