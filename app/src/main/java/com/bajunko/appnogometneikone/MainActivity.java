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

    public void onKlubovi(View view){
        TextView klubovi = (TextView) findViewById(R.id.textViewKlubovi);
        Log.i("Tu sam", "Kliknu sam na Klubovi");
    }

    public void onKviz(View view){
        TextView kviz = (TextView) findViewById(R.id.textViewKviz);
        Log.i("Tu sam", "Kliknu sam na Kviz");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
