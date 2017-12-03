package com.hw.github;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by hover on 2017/12/3.
 */

public class OneActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("OneActivity");
    }
}
