package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.appcompat.widget.ButtonBarLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
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