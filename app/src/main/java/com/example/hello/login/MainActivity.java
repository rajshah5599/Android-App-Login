package com.example.hello.login;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText t1, t2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.submit);
        t1 = (EditText) findViewById(R.id.usename);
        t2 = (EditText) findViewById(R.id.password);

        final ImageButton  vr = (ImageButton)  findViewById(R.id .verification ) ;


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t1.getText().toString().equals("admin") && t2.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(), "You Are Authorised", Toast.LENGTH_SHORT).show();
                    vr .setBackgroundColor(Color .parseColor("#008000") ) ;

                } else {
                    Toast.makeText(getApplicationContext(), "You Are Not Authorised", Toast.LENGTH_SHORT).show();
                    vr .setBackgroundColor(Color .parseColor("#FF0000") ) ;
                }
            }
        });

}
}
