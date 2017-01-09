package com.gulzar.animatedghost.android;

import android.graphics.drawable.Animatable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView mghostly;
    View root;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mghostly= (ImageView) findViewById(R.id.ghostly);
        root=findViewById(R.id.activity_main);
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Animatable) mghostly.getDrawable()).start();
            }
        });

    }
}
