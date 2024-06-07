package com.example.myapplication;
import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manolayout);
    }

    public void addCount(View v){
        //Button button = (Button) v;
        TextView rezultatas = findViewById(R.id.counter);
        Button button = findViewById(R.id.startbutton);
        button.setText("Paspausta");
        count++;
        rezultatas.setText(String.valueOf(count));
        switch(count){
            case 2:
                button.setBackgroundColor(Color.RED);
                break;
            case 4:
                button.setBackgroundColor(Color.BLUE);
                break;
            case 6:
                button.setBackgroundColor(Color.GREEN);
                break;
        }
    }

}