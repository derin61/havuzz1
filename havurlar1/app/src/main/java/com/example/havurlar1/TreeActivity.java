package com.example.havurlar1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TreeActivity extends AppCompatActivity {
    Button btnphone ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tree_main);
        btnphone = (Button) findViewById(R.id.btnphone);

        btnphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i̇ntent = new Intent(Intent.ACTION_DIAL);
                i̇ntent.setData(Uri.parse("tel:0(266)4231567")) ;
                startActivity(i̇ntent);
            }
        });
    }
}