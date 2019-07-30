package eu.siacs.conversations.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import eu.siacs.conversations.R;
import eu.siacs.conversations.ui.adapter.ViewPagerAdapter;

public class Banco extends AppCompatActivity {


    ViewPager viewPager;
    ImageButton btn1;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.banco_1);

        viewPager = (ViewPager) findViewById(R.id.viewPager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);

       // viewPager.setAdapter(viewPagerAdapter);


        btn1 = (ImageButton) findViewById(R.id.imageButton);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getApplicationContext(),ConversationActivity.class));

            }
        });
    }
}
