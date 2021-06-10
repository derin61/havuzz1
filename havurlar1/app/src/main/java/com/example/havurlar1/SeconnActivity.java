package com.example.havurlar1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SeconnActivity extends AppCompatActivity {
    Button btntel1, btntel2, btntel3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seconn);

        btntel1 = (Button) findViewById(R.id.bttel1) ;
        btntel2 = (Button) findViewById(R.id.bttel2) ;
        btntel3 = (Button) findViewById(R.id.bttel3) ;

        btntel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i̇ntent = new Intent(Intent.ACTION_DIAL);
                i̇ntent.setData(Uri.parse("tel:05462741598")) ;
                startActivity(i̇ntent);

            }
        });
        btntel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i̇ntent = new Intent(Intent.ACTION_DIAL);
                i̇ntent.setData(Uri.parse("tel:05321973515")) ;
                startActivity(i̇ntent);

            }
        });
        btntel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i̇ntent = new Intent(Intent.ACTION_DIAL);
                i̇ntent.setData(Uri.parse("tel:05374576518")) ;
                startActivity(i̇ntent);

            }
        });
    }
}