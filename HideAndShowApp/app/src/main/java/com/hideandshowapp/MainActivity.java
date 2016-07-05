package com.hideandshowapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView im;
    Button bt;
   Boolean isImageView=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        im=(ImageView)findViewById(R.id.im1);
        bt=(Button)findViewById(R.id.btn);
        bt.setText("Hide");
       bt.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(isImageView)
               {

                   im.setVisibility(View.INVISIBLE);
                   bt.setText("Show");
                   isImageView=false;
               }
               else {
                   im.setVisibility(View.VISIBLE);
                   bt.setText("hide");
                   isImageView=true;
               }
           }
       });

    }
}
