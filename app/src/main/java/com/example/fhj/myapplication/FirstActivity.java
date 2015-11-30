package com.example.fhj.myapplication;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by fhj on 2015/11/26.
 */
public class FirstActivity extends Activity{
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.first_layout);
    }

}
