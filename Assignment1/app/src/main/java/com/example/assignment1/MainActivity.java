package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private EditText EditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText = (EditText) findViewById(R.id.textInputEditText);
    }
    @Override
    protected void onStart() {
        super.onStart();
    }
    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sp = getPreferences(MODE_PRIVATE);
        String text1 = sp.getString("EditText", "");
        EditText.setText(text1);
    }
    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences sp = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor edit = sp.edit();

        edit.putString("EditText", EditText.getText().toString());
        edit.apply();
    }
    @Override
    protected void onStop() {
        super.onStop();
    }
}