package com.example.smilygame;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button btnUp, btnDown, btnLeft, btnRight;
    private ImageView img;
    private int count=0;
    private TextView c,gm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnUp = findViewById(R.id.btnUp);
        btnDown = findViewById(R.id.btnDown);
        btnLeft = findViewById(R.id.btnLeft);
        btnRight = findViewById(R.id.button4);
        img = findViewById(R.id.imageView3);
        c=findViewById(R.id.c);

        btnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setY(img.getY() +50);
                if(img.getY()>800){
                    img.setImageResource(R.drawable.snoopy);
                    count=count+1;
                    c.setText(count+" ");
                    if(count==5){
                        finish();
                        System.exit(0);
                    }


                }
                else
                    img.setImageResource(R.drawable.snoop);
            }
        });
        btnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setY(img.getY() -50);
                if(img.getY()<10){
                    img.setImageResource(R.drawable.snoopy);
                     count=count+1;
                     c.setText(count+" ");
                    if(count==5) {
                        finish();
                        System.exit(0);
                    }
                }
                else
                    img.setImageResource(R.drawable.snoop);
            }
        });
        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setX(img.getX() -50);
                if(img.getX()<44){
                    img.setImageResource(R.drawable.snoopy);
                    count=count+1;
                    c.setText(count+" ");
                    if(count==5) {
                        finish();
                        System.exit(0);                    }
                }
                else
                    img.setImageResource(R.drawable.snoop);
            }
        });
        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setX(img.getX() +50);
                if(img.getX()>630){
                    img.setImageResource(R.drawable.snoopy);
                    count=count+1;
                    c.setText(count+" ");
                    if(count==5) {
                        finish();
                        System.exit(0);
                    }
                }
                else
                    img.setImageResource(R.drawable.snoop);
            }
        });

    }
}