package com.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.QuickContactBadge;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtEmail;
    Button btnLogin;
    ImageView imgLogo;
    TextView tvAppName;
    RadioGroup radioGroup;
    CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtEmail = findViewById(R.id.edt_email);
        btnLogin = findViewById(R.id.btn_login);
        imgLogo = findViewById(R.id.img_logo);
        tvAppName = findViewById(R.id.tv_uplabs);
        checkBox = findViewById(R.id.chb);
        radioGroup = findViewById(R.id.radio_grp);
        btnLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(checkBox.isChecked()){
                    int radioId = radioGroup.getCheckedRadioButtonId();
                    
                    RadioButton radioButton = findViewById(radioId);
                    imgLogo.setImageResource(R.drawable.instagram);
                    tvAppName.setText("Royal");
                    tvAppName.setTextColor(Color.MAGENTA);
                    String radioName = radioButton.getText().toString();
                    String email = edtEmail.getText().toString();
                    Toast.makeText(MainActivity.this, "Email Id is "+email+" "+radioName, Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this,HomeActivity.class);
                    i.putExtra("Key email",email);
                    startActivity(i);
                 }else{
                    Toast.makeText(MainActivity.this, "No Data Found", Toast.LENGTH_SHORT).show();

                    }
                }
        });
    }
}