package listview.cursoandroid.com.senhaszanardo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    private EditText equipamento;
    private EditText usuario;
    private EditText senha;
    private Button btSalvar;
    private Button btVoltar;
    public static final String NOME_ARQUIVO = "dados.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        equipamento = (EditText) findViewById(R.id.equipID);
        usuario = (EditText) findViewById(R.id.userID);
        senha = (EditText) findViewById(R.id.senhaID);

        btSalvar = (Button) findViewById(R.id.salvarID);
        btVoltar = (Button) findViewById(R.id.voltarID);


        btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String txDados = "Equipamento: " + equipamento.getText().toString();
                 txDados += "Usuario: " + usuario.getText().toString();
                 txDados += "Senha: " + senha.getText().toString();

                gravar(txDados);

            }
        });

        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this,MainActivity.class));
            }
        });
    }




    private void gravar(String txDados){

        ArrayList recebeDados = new ArrayList<String>();;

        //Verifica dados anteriores
        try{
            //Abrir Arquivo
            InputStream abrir = openFileInput(NOME_ARQUIVO);

            if(abrir != null){
                //ler o arquivo
                InputStreamReader input = new InputStreamReader(abrir);

                //Buffer de leitura
                BufferedReader buffer = new BufferedReader(input);

                //Recuperar o texto
                String linhaArquivo = "";
                while((linhaArquivo = buffer.readLine()) != null){

                    recebeDados.add(linhaArquivo) ;

                }
                abrir.close();

            }

        }catch(IOException e){
            Log.v("MainActivity", e.toString());

        }

         try{
            //Salvar arquivo
            OutputStreamWriter output = new OutputStreamWriter(openFileOutput(NOME_ARQUIVO, Context.MODE_PRIVATE));
            output.write(recebeDados + txDados);

            output.close();
            Toast.makeText(Main2Activity.this, "Salvo com Sucesso!", Toast.LENGTH_SHORT).show();

        }catch(IOException e){
            Log.v("Main2Activity",e.toString());
        }


    }




}
