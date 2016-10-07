package frasedodia.cursoandroid.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView txNovaFrase;
    private Button btNovaFrase;

    private String[] frases = {
            "teste","teste2","teste3","teste4","teste5"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txNovaFrase = (TextView) findViewById(R.id.novaFraseID);
        btNovaFrase = (Button) findViewById(R.id.btNovaFraseID);

        btNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random r = new Random();
                int aleatorio = r.nextInt(frases.length);

                txNovaFrase.setText(frases[aleatorio]);
            }
        });

    }
}
