package com.buddytrainers.alisheraz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showCustomToast(View v)
    {
        View convertedXml;
        LayoutInflater objectLayoutInflater=getLayoutInflater();
        convertedXml=objectLayoutInflater.inflate( R.layout.ali_cutsom_toast,null );
        Toast objectToast=new Toast(this);
        objectToast.setGravity(Gravity.FILL_HORIZONTAL, 0, 0);
        objectToast.setDuration(Toast.LENGTH_SHORT);
        objectToast.setView(convertedXml);
        objectToast.show();
    }
}
