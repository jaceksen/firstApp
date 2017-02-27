package pl.jaceksen.firstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtDisplay;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtDisplay= (TextView) findViewById(R.id.txtDisplay);
        txtDisplay.setText("Tekst from Main.");
        //button2 (test)
//        button2.setText("Tekst z layoutu");
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txtDisplay= (TextView) findViewById(R.id.txtDisplay);
                txtDisplay.setText("Kliknięcie z kodu.");
            }
        });
    }

    public void buClick(View view) {
        TextView txtDisplay= (TextView) findViewById(R.id.txtDisplay);
        txtDisplay.setText("Przycisk był kliknięty.");
//        txtDisplay.setText("aaaaaa");
    }
}
