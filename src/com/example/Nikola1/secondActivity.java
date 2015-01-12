package com.example.Nikola1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by GLIGA on 12/01/2015.
 */

public class secondActivity extends Activity implements View.OnClickListener {


    Button button_ok;
    Button button_nazad;
    EditText editText2;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        editText2 = (EditText)findViewById(R.id.editText2);

        button_ok = (Button) findViewById(R.id.button_ok);
        button_ok.setOnClickListener(this);

        button_nazad = (Button) findViewById(R.id.button_nazad);
        button_nazad.setOnClickListener(this);



    }

   private void button_nazadClick() {

        startActivity(new Intent("com.exemple.Nikola1.my_activity"));
        finish();
    }


    private void button_okClick() {

    startActivity(new Intent("com.exemple.Nikola1.my_activity"));
        finish();
    }

    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button_nazad:
                button_nazadClick();
                break;
        }

      switch (v.getId()){

            case R.id.button_ok:
                button_okClick();
                break;
        }

    }
}