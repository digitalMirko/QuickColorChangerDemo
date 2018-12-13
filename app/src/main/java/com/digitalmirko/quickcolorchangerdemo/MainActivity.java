package com.digitalmirko.quickcolorchangerdemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout layout;
    RadioGroup radioGroup;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.layout);
        radioGroup = findViewById(R.id.radioGroup);
        textView = findViewById(R.id.textView);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.radioBtnRed:
                        layout.setBackgroundColor(Color.parseColor("#D63031"));
                        textView.setText("Red");
                        break;
                    case R.id.radioBtnGreen:
                        layout.setBackgroundColor(Color.parseColor("#45CE30"));
                        textView.setText("Green");
                        break;
                    case R.id.radioBtnBlue:
                        layout.setBackgroundColor(Color.parseColor("#0A79DF"));
                        textView.setText("Blue");
                        break;
                    case R.id.radioBtnPurple:
                        layout.setBackgroundColor(Color.parseColor("#BB2CD9"));
                        textView.setText("Purple");
                        break;
                    case R.id.radioBtnPink:
                        layout.setBackgroundColor(Color.parseColor("#E74292"));
                        textView.setText("Pink");
                        break;
                    case R.id.radioBtnYellow:
                        layout.setBackgroundColor(Color.parseColor("#FFF222"));
                        textView.setText("Yellow");
                        break;
                    case R.id.radioBtnOrange:
                        layout.setBackgroundColor(Color.parseColor("#ffa500"));
                        textView.setText("Orange");
                        break;
                    case R.id.radioBtnGold:
                        layout.setBackgroundColor(Color.parseColor("#ffd700"));
                        textView.setText("Gold");
                        break;
                    case R.id.radioBtnSilver:
                        layout.setBackgroundColor(Color.parseColor("#C0C0C0"));
                        textView.setText("Silver");
                        break;
                }
            }
        });
    }
}
