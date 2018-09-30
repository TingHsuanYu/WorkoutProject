package com.example.user.workoutproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class project_1 extends AppCompatActivity {

    ImageButton ibtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_1);

        ibtn1 = (ImageButton)findViewById(R.id.imgbtn1);

        ibtn1.setOnClickListener(new ImageButton.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(project_1.this,project_1week1.class);
                startActivity(intent);
            }
        });
    }
}
