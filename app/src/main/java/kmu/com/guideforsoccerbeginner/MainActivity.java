package kmu.com.guideforsoccerbeginner;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import static kmu.com.guideforsoccerbeginner.R.id.startButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         Button startButton = (Button) findViewById(R.id.startButton);

         startButton.setOnClickListener(
                 new Button.OnClickListener() {
                     @Override
                     public void onClick(View v) {
                         startActivity(new Intent(MainActivity.this, subActivity1.class));
                     }
                 }
         );



        }
}
