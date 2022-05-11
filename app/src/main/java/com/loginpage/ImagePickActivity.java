package com.loginpage;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.time.Instant;

public class ImagePickActivity extends AppCompatActivity {
    ImageView imgDp;
    Button btnGallery;
    Button btnCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_pick);
        btnGallery=findViewById(R.id.btn_gallery);
        imgDp = findViewById(R.id.img_dp);
        btnCamera=findViewById(R.id.btn_camera);
        btnGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_PICK);
                i.setType("image/*");

                startActivityForResult(i,  1);


            }
        });
        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =  new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i,2);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable  Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==1 && resultCode == RESULT_OK){
            Uri uri = data.getData();
            imgDp.setImageURI(uri);

        }
        if (requestCode==2){
            Bitmap bitmap = (Bitmap)data.getExtras().get("data");
            imgDp.setImageBitmap(bitmap);
        }
    }
}