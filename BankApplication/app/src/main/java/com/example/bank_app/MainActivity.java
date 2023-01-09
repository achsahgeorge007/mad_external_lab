package com.example.bank_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String Name;
    String Account;
    String Bank;
    String Branch;
    String IFSC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onSubmit(View view){
        EditText name = (EditText) findViewById(R.id.name);
        EditText acno = (EditText) findViewById(R.id.acno);
        EditText bank = (EditText) findViewById(R.id.bank);
        EditText branch = (EditText) findViewById(R.id.branch);
        EditText ifsc = (EditText) findViewById(R.id.ifsc);
        Intent i = new Intent(getApplicationContext(), MainActivity1.class);
        Name=  name.getText().toString();
        Account = acno.getText().toString();
        Bank = bank.getText().toString();
        Branch = branch.getText().toString();
        IFSC = ifsc.getText().toString();
        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putString("name", name.getText().toString());
        myEdit.putString("account", acno.getText().toString());
        myEdit.putString("bank", bank.getText().toString());
        myEdit.putString("branch", branch.getText().toString());
        myEdit.putString("ifsc", ifsc.getText().toString());

        myEdit.apply();
        i.putExtra("Name",Name);
        i.putExtra("AccountNo",Account);
        i.putExtra("Bank",Bank);
        i.putExtra("Branch",Branch);
        i.putExtra("IFSC",IFSC);

        startActivity(i);
    }

    @Override
    protected void onResume() {
        super.onResume();
        EditText name = (EditText) findViewById(R.id.name);
        EditText add = (EditText) findViewById(R.id.acno);
        EditText phone = (EditText) findViewById(R.id.bank);
        EditText email = (EditText) findViewById(R.id.branch);
        EditText ifsc = (EditText) findViewById(R.id.ifsc);
        SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        name.setText(sh.getString("name",""));
        add.setText(sh.getString("acno",""));
        phone.setText(sh.getString("bank",""));
        email.setText(sh.getString("branch",""));
        ifsc.setText(sh.getString("branch",""));
    }
}