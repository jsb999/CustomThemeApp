package com.example.themeapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity3 extends AppCompatActivity {

    int[] buttonIDs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        buttonIDs = new int[]{R.id.toggleButton,R.id.toggleButton2,R.id.toggleButton3};

    }

    public void onClick(View v){
        boolean checked = ((ToggleButton) v).isChecked();
        switch(v.getId()) {
            case R.id.toggleButton:
                if(checked){
                    Log.i("logOutput", "toggle1 is checked on");
                } else{
                    Log.i("logOutput", "toggle1 is checked off");
                }
                setOff(v.getId());
                break;
            case R.id.toggleButton2:
                if(checked){
                    Log.i("logOutput", "toggle2 is checked on");
                } else{
                    Log.i("logOutput", "toggle2 is checked off");
                }
                setOff(v.getId());
                break;
            case R.id.toggleButton3:
                if(checked){
                    Log.i("logOutput", "toggle3 is checked on");
                } else{
                    Log.i("logOutput", "toggle3 is checked off");
                }
                setOff(v.getId());
                break;
        }
    }

    public void setOff(int id){
        for (int i = 0; i < buttonIDs.length; i++) {
            if(buttonIDs[i] != id) {
                ((ToggleButton) findViewById(buttonIDs[i])).setChecked(false);
            }
        }
    }
}
