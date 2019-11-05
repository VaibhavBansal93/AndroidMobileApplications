package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final String msg = "Logcat";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg,"Oncreate state");
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
    }

    protected void onStart(){
        super.onStart();
        Log.d(msg,"OnStart state");
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
    }

    protected void onRestart(){
        super.onRestart();
        Log.d(msg,"OnRestart state");
        Toast.makeText(this, "OnRestart", Toast.LENGTH_SHORT).show();
    }

    protected void onPause(){
        super.onPause();
        Log.d(msg,"OnPause state");
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
    }

    protected void onResume(){
        super.onResume();
        Log.d(msg,"OnResume state");
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
    }

    protected void onStop(){
        super.onStop();
        Log.d(msg,"OnStop state");
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.d(msg,"OnDestroy state");
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();
    }
}
