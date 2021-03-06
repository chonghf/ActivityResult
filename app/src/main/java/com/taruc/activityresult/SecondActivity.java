package com.taruc.activityresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editText=findViewById(R.id.editText);
        button= findViewById(R.id.buttonSubmit);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String message=editText.getText().toString();

        Intent intent=new Intent();
        intent.putExtra("key", message);

        setResult(0, intent);
        finish();

    }
}
