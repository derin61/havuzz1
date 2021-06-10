package com.example.havurlar1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login, cangel;
    Context context = this;

   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState) ;

    setContentView(R.layout.linearlayout);

        login = (Button) findViewById(R.id.btnGönder) ;
        cangel = (Button) findViewById(R.id.btnTemizle) ;

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SeconnActivity.class);
                startActivity(intent);

            }
        });
        cangel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tree = new Intent(context, TreeActivity.class);
                startActivity(tree);

            }
        });

    }
}