package com.uts.si51.utspab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

        et_nama=findViewById(R.id.et_nama);
        et_nomor=findViewById(R.id.et_nomor);
        cb_facebook=findViewById(R.id.cb_facebook);
        cb_ig=findViewById(R.id.cb_ig);
        cb_web=findViewById(R.id.cb_web);

        btn_daftar=findViewById(R.id.btn_daftar);
        btn_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama,nomor;


                nama=et_nama.getText().toString();
                nomor=et_nomor.getText().toString();

                if(nama.trim().equals("")){
                    et_nama.setError("Nama tidak boleh kosong!");
                }
                else if(nomor.trim().equals("")){
                    et_nomor.setError("Nomor pendaftaran tidak boleh kosong!");
                }
                else if(!cb_facebook.isChecked()&&!cb_ig.isChecked()&&!cb_web.isChecked()){
                    Toast.makeText(getApplicationContext(),"Harus pilih salah satu sumber informasi!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                    intent.putExtra("varNama",nama);
                    intent.putExtra("varNomor",nomor);
                    startActivity(intent);
                }
            }
        });
    }
}