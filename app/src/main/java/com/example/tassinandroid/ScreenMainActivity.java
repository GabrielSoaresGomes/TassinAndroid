package com.example.tassinandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class ScreenMainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Button button = findViewById(R.id.btn_top_stories);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScreenMainActivity.this, ScreenDetailActivity.class);
                startActivity(intent);
            }
        });
    }
}
