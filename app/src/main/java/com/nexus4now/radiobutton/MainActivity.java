package com.nexus4now.radiobutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {


    private RadioGroup group1;
    private RadioGroup group2;
    private RadioButton A;
    private RadioButton B;
    private RadioButton C;
    private RadioButton D;

    private CheckBox AppleBox;
    private CheckBox SamsungBox;
    private CheckBox MotoBox;
    private CheckBox AllBox;



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

        AppleBox = (CheckBox)findViewById(R.id.AppleId);
        SamsungBox = (CheckBox)findViewById(R.id.SamsungId);
        MotoBox = (CheckBox)findViewById(R.id.MotoId);
        AllBox = (CheckBox)findViewById(R.id.AllId);


        Listener listener = new Listener();
        group1.setOnCheckedChangeListener(listener);

        OnBoxListener boxListener = new OnBoxListener();

        AllBox.setOnCheckedChangeListener(boxListener);


    }

    class Listener implements RadioGroup.OnCheckedChangeListener{

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            //C.setChecked(checkedId == R.id.AId);
            //D.setChecked(checkedId == R.id.BId);
            C.setChecked(checkedId == A.getId());
            D.setChecked(checkedId == B.getId());

        }
    }

    class OnBoxListener implements CompoundButton.OnCheckedChangeListener{

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            CheckBox Box =(CheckBox)buttonView;
            if(Box.getId() == R.id.AllId){
                AppleBox.setChecked(isChecked);
                SamsungBox.setChecked(isChecked);
                MotoBox.setChecked(isChecked);
            }

            
        }


    }





}
