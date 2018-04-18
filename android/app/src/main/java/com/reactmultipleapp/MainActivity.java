package com.reactmultipleapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.facebook.react.ReactActivity;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onBtnClick(View v){
        if(v.getId()==R.id.btn_test_rn_1){
            Intent intent= new Intent(this,Activity1.class);
            startActivity(intent);
        } else {
            Intent intent= new Intent(this,Activity2.class);
            startActivity(intent);
        }

    }
}
