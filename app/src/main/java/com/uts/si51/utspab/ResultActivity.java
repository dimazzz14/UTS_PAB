package com.uts.si51.utspab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity{
    private TextView tv_nama, tv_nomor;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tv_nama=findViewById(R.id.tv_nama);
        tv_nomor=findViewById(R.id.tv_nomor);

        Intent intent = getIntent();
        tv_nama.setText(intent.getStringExtra("varNama"));
        tv_nomor.setText(intent.getStringExtra("varNomor"));

    }
}
