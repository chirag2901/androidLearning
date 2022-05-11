package com.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AlertDialog extends AppCompatActivity {

    Button btnAlertDialog,btnCustomDialog,btncustomToast,btnsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);
        btnAlertDialog=findViewById(R.id.btn_alert_dialog);
        btnCustomDialog = findViewById(R.id.btn_custom_dialog);
        btncustomToast= findViewById(R.id.btn_custom_toast);


        btncustomToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater layoutInflater = getLayoutInflater();
                View myview = layoutInflater.inflate(R.layout.raw_custom_toast,null);
                Toast toast = new Toast(AlertDialog.this);
                toast.setView(myview);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        btnCustomDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                androidx.appcompat.app.AlertDialog.Builder builder = new androidx.appcompat.app.AlertDialog.Builder(AlertDialog.this);
                LayoutInflater layoutInflater = getLayoutInflater();
                View myview = layoutInflater.inflate(R.layout.raw_custom_dialog,null);
                androidx.appcompat.app.AlertDialog alertDialog = builder.create();
                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                alertDialog.setView(myview);
                alertDialog.show();
                EditText tvdata;
                tvdata = myview.findViewById(R.id.tv_data);
                btnsubmit = myview.findViewById(R.id.btn_submit);
                btnsubmit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String tv_data = tvdata.getText().toString();
                        Intent i = new Intent(AlertDialog.this,HomeDialog.class);
                        i.putExtra("key data",tv_data);
                        startActivity(i);
                    }
                });
            }
        });
        btnAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                androidx.appcompat.app.AlertDialog.Builder builder = new androidx.appcompat.app.AlertDialog.Builder(AlertDialog.this);
                builder.setIcon(R.drawable.ic_person);
                builder.setTitle("Login Alert");
                builder.setMessage("Are You Sure ,you want to login?");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(AlertDialog.this,"Yes is Clicked",Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(AlertDialog.this,"No",Toast.LENGTH_SHORT).show();

                    }
                });
                builder.setNeutralButton("Finish", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();

                    }
                });
                builder.show();
            }
        });
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        androidx.appcompat.app.AlertDialog.Builder builder = new androidx.appcompat.app.AlertDialog.Builder(AlertDialog.this);
        builder.setIcon(R.drawable.ic_person);
        builder.setTitle("Login Alert");
        builder.setMessage("Are You Sure ,you want to Exit?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
//                Toast.makeText(AlertDialog.this,"Yes is Clicked",Toast.LENGTH_SHORT).show();
               finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
//                Toast.makeText(AlertDialog.this,"No",Toast.LENGTH_SHORT).show();
                dialog.dismiss();

            }
        });
        builder.setNeutralButton("Finish", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();

            }
        });
        builder.show();
    }

}