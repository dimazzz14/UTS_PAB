package com.uts.si51.utspab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    private Button btn_daftar;
    private EditText et_nama, et_nomor;
    private CheckBox cb_facebook, cb_ig, cb_web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_daftar=findViewById(R.id.btn_daftar);
        et_nama=findViewById(R.id.et_nama);
        et_nomor=findViewById(R.id.et_nomor);
        cb_facebook=findViewById(R.id.cb_facebook);
        cb_ig=findViewById(R.id.cb_ig);
        cb_web=findViewById(R.id.cb_web);
        btn_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nama)
                if(!cb_facebook.isChecked()&&!cb_ig.isChecked()&&!cb_web.isChecked()){
                    Toast.makeText(getApplicationContext(),"Harus pilih salah satu sumber informasi!", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}