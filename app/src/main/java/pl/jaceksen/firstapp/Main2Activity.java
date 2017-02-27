package pl.jaceksen.firstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle b = getIntent().getExtras();
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText("Imię: " + b.getString("name") + "\nWiek: " + b.getString("age"));
    }
}
