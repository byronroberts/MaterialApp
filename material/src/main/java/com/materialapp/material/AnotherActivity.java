package com.materialapp.material;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.view.ViewGroup;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        Toolbar toolbar = (Toolbar) findViewById(R.id.another_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    protected void onPostResume() {
        super.onPostResume();

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        TransitionManager.go(Scene.getSceneForLayout((ViewGroup)findViewById(R.id.another_root), R.layout.another_scene, AnotherActivity.this));
    }
}
