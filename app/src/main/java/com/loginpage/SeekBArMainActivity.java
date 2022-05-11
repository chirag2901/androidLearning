package com.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class SeekBArMainActivity extends AppCompatActivity {
    SeekBar seekBar;
    TextView tv_seekbar,tv_ratingbar;
    RatingBar ratingBar;
    Button btnResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar_main);
        seekBar = findViewById(R.id.seekbar);
        tv_seekbar= findViewById(R.id.tv_seekbar);
        ratingBar = findViewById(R.id.ratingbar);
        tv_ratingbar = findViewById(R.id.tv_ratingbar);
        btnResult=findViewById(R.id.btn_result);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                tv_ratingbar.setText(String.valueOf(rating));
            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tv_seekbar.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tvseekbar = tv_seekbar.getText().toString();
                String tvratingbar = tv_ratingbar.getText().toString();
                Intent i = new Intent(SeekBArMainActivity.this,HomeActivity.class);
                i.putExtra("key seekbar",tvseekbar);
                i.putExtra("key ratingbar",tvratingbar);
                startActivity(i);
            }
        });
    }
}