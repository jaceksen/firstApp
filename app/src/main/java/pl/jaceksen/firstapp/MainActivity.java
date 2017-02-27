package pl.jaceksen.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtDisplay;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtDisplay= (TextView) findViewById(R.id.txtDisplay);
        txtDisplay.setText("Tekst from Main.");

        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();


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

    protected void onStart(){
        super.onStart();
        Toast.makeText(this,"OnStart",Toast.LENGTH_LONG).show();
    }

    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this,"OnRestart",Toast.LENGTH_LONG).show();
    }

    protected void onPause(){
        super.onPause();
        Toast.makeText(this,"OnPause",Toast.LENGTH_LONG).show();
    }

    protected void onStop(){
        super.onStop();
        Toast.makeText(this,"OnStop",Toast.LENGTH_LONG).show();
    }

    protected void onResume(){
        super.onResume();
        Toast.makeText(this,"OnResume",Toast.LENGTH_LONG).show();
    }

    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this,"OnDestroy",Toast.LENGTH_LONG).show();
    }


    public void buClick(View view) {
//        TextView txtDisplay= (TextView) findViewById(R.id.txtDisplay);
//        txtDisplay.setText("Przycisk był kliknięty.");
//        txtDisplay.setText("aaaaaa");
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("name","Jacek Seń");
        intent.putExtra("age","45");
        startActivity(intent);
    }
}
