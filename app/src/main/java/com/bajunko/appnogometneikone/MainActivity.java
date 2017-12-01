package com.bajunko.appnogometneikone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void onZvijezde(View view){

        TextView zvijezde = (TextView) findViewById(R.id.textViewZvijezde);
        Log.i("Tu sam", "Kliknu sam na Zvijezde");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
