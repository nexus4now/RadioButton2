package com.nexus4now.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {


    private RadioGroup group1;
    private RadioGroup group2;
    private RadioButton A;
    private RadioButton B;
    private RadioButton C;
    private RadioButton D;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        group1 = (RadioGroup)findViewById(R.id.group1Id);
        group2 = (RadioGroup)findViewById(R.id.group2Id);
        A = (RadioButton)findViewById(R.id.AId);
        B = (RadioButton)findViewById(R.id.BId);
        C = (RadioButton)findViewById(R.id.CId);
        D = (RadioButton)findViewById(R.id.DId);

        Listener listener = new Listener();
        group1.setOnCheckedChangeListener(listener);

    }

    class Listener implements RadioGroup.OnCheckedChangeListener{

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {

        }
    }




}
