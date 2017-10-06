package com.example.teacher.t2017100603;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickSet(View v)
    {
        Intent it = new Intent(MainActivity.this, SettingsActivity.class);
        startActivity(it);
    }
    public void clickRead(View v)
    {
        SharedPreferences sp = getSharedPreferences(getPackageName() + "_preferences", MODE_PRIVATE);
        String str = sp.getString("example_text", "");
        Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
    }
}
