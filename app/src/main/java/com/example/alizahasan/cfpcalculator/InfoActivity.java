package com.example.alizahasan.cfpcalculator;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InfoActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
    }

    public void cfpButtonPressed(View view) {
        Intent cfp = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cotap.org/reduce-carbon-footprint/"));
        startActivity(cfp);
    }

    public void whyButtonPressed(View view) {
        Intent cfpWhy = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cotap.org/reduce-carbon-footprint/"));
        startActivity(cfpWhy);
    }

    public void videoButtonPressed(View view) {
        Intent video = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=63hAHbkzJG4.kh"));
        startActivity(video);
    }
}
