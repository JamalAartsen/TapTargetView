package com.example.taptargetview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.taptargetview2.TapTarget;
import com.example.taptargetview2.TapTargetView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TapTargetView.showFor(this,
                TapTarget.forView(findViewById(R.id.textView), "TextView",
                        "Dit is een TextView.")
                        .tintTarget(false)
                        .targetRadius(50)
                        .outerCircleColor(R.color.Green)
                        .titleTextSize(30)
                        .cancelable(true)
                        .dimColor(R.color.Black)
                        .descriptionTextSize(20));
    }
}
