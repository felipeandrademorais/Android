package alcoolougasolina.cursoandroid.com.alcoolougasolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Alcool;
    private EditText Gasolina;
    private TextView resultadoTX;
    private Button BtCalcular;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Alcool = (EditText) findViewById(R.id.precoAlcoolID);
        Gasolina = (EditText) findViewById(R.id.precoGasolinaID);
        BtCalcular = (Button) findViewById(R.id.buttonID);
        resultadoTX = (TextView) findViewById(R.id.resultadoID);


        BtCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Recupera valor em formato texto
                String precoAlcool = Alcool.getText().toString();
                String precoGasolina = Gasolina.getText().toString();

                if(precoAlcool.isEmpty() || precoGasolina.isEmpty()){

                    Toast.makeText(MainActivity.this, "Preencha todos os campos", Toast.LENGTH_LONG).show();
                    resultadoTX.setText("Dados Incorretos");

                }else {

                    //Converte valor para Double
                    Double valorAlcool = Double.parseDouble(precoAlcool);
                    Double valorGasolina = Double.parseDouble(precoGasolina);

                    Double resultado = valorAlcool / valorGasolina;

                    if (resultado >= 0.7) {
                        resultadoTX.setText("É melhor utilizar Gasolina");
                    } else {
                        resultadoTX.setText("É melhor utilizar Alcool");
                    }
                }

            }
        });

    }
}
