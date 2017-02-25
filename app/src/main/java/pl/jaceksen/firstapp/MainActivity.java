package pl.jaceksen.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtDisplay= (TextView) findViewById(R.id.txtDisplay);
        txtDisplay.setText("Tekst from Main.");
    }

    public void buClick(View view) {
        TextView txtDisplay= (TextView) findViewById(R.id.txtDisplay);
        txtDisplay.setText("Przycisk był kliknięty.");
    }
}
