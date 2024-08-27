package com.example.tassinandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;

public class ScreenDetailActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_detail);
    }

    @Override
    protected void onStart() {
        super.onStart();
        ImageButton button = findViewById(R.id.btn_back_main);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScreenDetailActivity.this, ScreenMainActivity.class);
                startActivity(intent);
            }
        });
    }
}
