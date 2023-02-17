package com.example.activitytransitions;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button myButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = findViewById(R.id.myButton);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MainActivity", "Button clicked");
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                //overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
                //overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                //overridePendingTransition(R.anim.scale_in, R.anim.scale_out);
                overridePendingTransition(R.anim.rotate_in, R.anim.rotate_out);
            }
        });
    }
}
