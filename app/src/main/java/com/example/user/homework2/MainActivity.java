package com.example.user.homework2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button= (Button) findViewById(R.id.ma_button);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Log.d(TAG, "Нажата кнопка");
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
