package id.ac.poliban.mi.latihan04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
/*
    Event Handling & Listener with
    Lambda
*/


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btKrisna = findViewById(R.id.btKrisna);
        Button btBasudewa = findViewById(R.id.btBasudewa);
        Button btAbimanyu = findViewById(R.id.btAbimanyu);
        Button btBismaDewaBrata = findViewById(R.id.btBismaDewaBrata);

        btKrisna.setOnClickListener((v)-> Toast.makeText(this, "Hello Krisna", Toast.LENGTH_SHORT).show());
        btBasudewa.setOnClickListener((v)-> Toast.makeText(this, "Hello Basudewa", Toast.LENGTH_SHORT).show());
        btAbimanyu.setOnClickListener((v)-> Toast.makeText(this, "Hello Abimanyu", Toast.LENGTH_SHORT).show());
        btBismaDewaBrata.setOnClickListener((v)-> Toast.makeText(this, "Hello Resi Bisma", Toast.LENGTH_SHORT).show());
    }
}
