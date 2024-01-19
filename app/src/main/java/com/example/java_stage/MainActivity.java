package com.example.java_stage;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.java_stage.Myplugin;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Myplugin myPlugin = new Myplugin(this);
        myPlugin.whistleLoopEvents("eventName", "extraParameters");
    }
}