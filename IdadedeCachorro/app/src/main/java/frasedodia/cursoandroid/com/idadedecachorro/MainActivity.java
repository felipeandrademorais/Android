package frasedodia.cursoandroid.com.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText caixaTexto;
    private Button btIdade;
    private TextView resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaTexto = (EditText) findViewById(R.id.caixaTextoID);
        btIdade = (Button) findViewById(R.id.btIdadeID);
        resultadoIdade = (TextView) findViewById(R.id.resultadoId);

        btIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Recuperar o que foi digitado

                String textoDg = caixaTexto.getText().toString();

                if(textoDg.isEmpty()){

                    resultadoIdade.setText("Nenhum número digitado!");

                }else{
                    int valorDg = Integer.parseInt(textoDg);
                    int resultado;

                    resultado = valorDg * 7;

                    resultadoIdade.setText("A idade do seu Cão é: " + resultado + " anos");

                }

            }
        });
    }
}
