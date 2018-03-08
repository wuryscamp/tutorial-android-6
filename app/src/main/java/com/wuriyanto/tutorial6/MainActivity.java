package com.wuriyanto.tutorial6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox cbCpp, cbJava, cbGolang;
    private Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbCpp = (CheckBox) findViewById(R.id.cb_cpp);
        cbJava = (CheckBox) findViewById(R.id.cb_java);
        cbGolang = (CheckBox) findViewById(R.id.cb_golang);

        btnOk = (Button) findViewById(R.id.btn1);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String result = process();

                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();

            }
        });
    }

    private String process(){
        StringBuilder builder = new StringBuilder();

        builder.append("You Choose :\n");

        if(cbCpp.isChecked()){
            builder.append("* C++\n");
        }

        if(cbJava.isChecked()){
            builder.append("* Java\n");
        }

        if(cbGolang.isChecked()){
            builder.append("* Golang");
        }
        return builder.toString();
    }
}
