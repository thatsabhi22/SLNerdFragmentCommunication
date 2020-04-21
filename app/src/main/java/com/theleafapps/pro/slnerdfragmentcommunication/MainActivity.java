package com.theleafapps.pro.slnerdfragmentcommunication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void respond(String data) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentB fb = (FragmentB) fragmentManager.findFragmentById(R.id.fragment_b);
        fb.changeTVText(data);
    }
}
