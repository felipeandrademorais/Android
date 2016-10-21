package listview.cursoandroid.com.senhaszanardo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btNovo;
    private ListView list;
    private ArrayAdapter<String> adapter;
    private ArrayList arrayList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btNovo = (Button) findViewById(R.id.novoID);
        list = (ListView) findViewById(R.id.listID);

        arrayList = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item,arrayList);
        list.setAdapter(adapter);

        btNovo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
            }
        });


        //Recuperar Arquivo
        if(abrir() != null){
            arrayList.add(abrir());
            adapter.notifyDataSetChanged();
            //texto.setText(abrir());
        }

    }

    public String abrir(){

        String recebeDados = "";

        try{
            //Abrir Arquivo
            InputStream abrir = openFileInput(Main2Activity.NOME_ARQUIVO);

            if(abrir != null){
                //ler o arquivo
                InputStreamReader input = new InputStreamReader(abrir);

                //Buffer de leitura
                BufferedReader buffer = new BufferedReader(input);

                //Recuperar o texto
                String linhaArquivo = "";
                while((linhaArquivo = buffer.readLine()) != null){

                    recebeDados +=  linhaArquivo ;

                }
                abrir.close();

            }

        }catch(IOException e){
            Log.v("MainActivity", e.toString());

        }

        return recebeDados;

    }
}
