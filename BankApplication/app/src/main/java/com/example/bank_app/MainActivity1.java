package com.example.bank_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        TextView t1 = (TextView) findViewById(R.id.name2);
        TextView t2 = (TextView) findViewById(R.id.acno2);
        TextView t3 = (TextView) findViewById(R.id.bank2);
        TextView t4 = (TextView) findViewById(R.id.branch2);
        TextView t5 = (TextView) findViewById(R.id.ifsc2);
        Bundle extras = getIntent().getExtras();
        String name2 = extras.getString("Name");
        String acno2 = extras.getString("Account");
        String bank2 = extras.getString("Bank");
        String branch2 = extras.getString("Branch");
        String ifsc2 = extras.getString("IFSC");
        t1.setText(name2);
        t2.setText(acno2);
        t3.setText(bank2);
        t4.setText(branch2);
        t5.setText(ifsc2);
    }

}
