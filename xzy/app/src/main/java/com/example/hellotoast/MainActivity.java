package com.example.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnToast, btnCount;
    TextView txtNumber;
    int mCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToast = findViewById(R.id.btn_toast);
        btnCount = findViewById(R.id.btn_count);
        txtNumber = findViewById(R.id.txt_number);

        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countNumber();
            }
        });

        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,txtNumber.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void countNumber() {
        mCount++;
        txtNumber.setText(Integer.toString(mCount));

    }
}
