package com.example.android.explicitintent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * com.example.android.explicitintent
 * Created by Peter Wanden on 13/11/2017.
 */

public class ChildActivity extends AppCompatActivity {

    // Do steps 6 & 7 in ChildActivity.java
    // COMPLETED (6) Create a TextView field to display your message
    private TextView mDisplayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        // COMPLETED (7) Get a reference to your TextView in Java
        mDisplayText = (TextView)findViewById(R.id.tv_display);

    }}
