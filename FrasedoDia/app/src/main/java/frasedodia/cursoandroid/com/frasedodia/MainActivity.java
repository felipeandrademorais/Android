package frasedodia.cursoandroid.com.frasedodia;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView txNovaFrase;
    private View tela;


    private String[] frases = {
            "Nossa, como é dificil não pensar em você mesmo depois de algumas horas sem te ver já bate aquela saudade, e logo da vontade de te dar aquele abraço gostoso com um beijinho e te encher de carinho, para que o amor fique no ar."
            ,"Eu prometo te dizer eu te amo todas as noites e te provar isso todos os dias."
            ,"Haa esse ar,que respiramos juntos quando eu deito do seu lado quando a gente fica abraçado, e quando beijamos por minutos sem parar nessas horas me vem uma alegria que me faz viver uma fantasia e no final, tudo eu quero e sempre vou querer."
            ,"Eu imagino a gente daqui trinta anos, Eu imagino o mundo todo diferente, Eu vejo um lugar coberto de flores, Só pra nós dois."
            ,"Mas um Deus que é todo poderoso tinha reservado o meu coração, e aos pouquinhos foi me transfomando e tudo devido a sua oração."
            ,"Numero 22 é o meu numero da sorte, porque foi nesse dia que eu entreguei o meu coração para a mulher da minha vida."
            ,"Fecho os olhos e me lembro daquele primeiro momento em que eu olhei pra você e você pra mim."
            ,"Te amo. Com todas as letras, palavras e pronúncias. Em todas as línguas e sotaques. Em todos os sentidos e jeitos. Com todas as circunstâncias e motivos. Simplesmente, te amo."
            ,"Quando eu digo que te amo, eu falo para te lembrar que você é a melhor coisa que aconteceu na minha vida."
            ,"Não existe um dia se quer em que eu não acorde pensando em você. E quer saber? Não há pensamento melhor e mais agradável."
            ,"A vida é minha. Mas o coração, é seu. O sorriso é meu. Mas o motivo, é você."
            ,"Mesmo cheio de amor, ainda insisto em produzir mais e mais desse sentimento. E que em todos os momentos  ele  nos lembre o quão incrível nosso amor é."
            ,"Encoste em mim, me abrace, me faça sorrir, mexa no meu cabelo, fica comigo,e me de tua paciência, teu amor, tua alegria…"
            ,"Sabe quando você quer que um momento dure para sempre? Então, é assim quando estou com você."
            ,"Bom dia, amor! Por sua causa eu tenho lindos sonhos para sonhar. Por sua causa, minha vida está cheia de amor. E hoje mais do que nunca, te amo como nunca!"
            ,"Até o infinito fica pequeno quando se trata do que eu sinto por você. Te amo Demais."
            ,"Eu amo estar com você, eu amo ficar com você, seu cheirinho me faz viajar, sua voz me faz suspirar."
            ,"Foi o seu abraço que tirou a graça de todos os outros abraços."
            ,"Toda história de amor é linda, mas a nossa é a melhor."
            ,"Você não é apenas a razão do meu viver, você é minha vida!"
            ,"O amor que eu sinto por você, pode até não ser o mais perfeito… mas com certeza, é o mais sincero."
            ,"Amor se sente minha falta, me chama, eu vou corrente até você."
            ,"Você está triste? Você não tem motivo pra isso, por que eu te amo."
            ,"Você é a escolhida, a minha princesa e a Rainha do meu coração. TE AMO!"
            ,"Eu sem você sou só desamor. Um barco sem mar, um campo sem flor. Tristeza que vai, tristeza que vem. Sem você, meu amor, eu não sou ninguém?"
            ,"Hey, não consigo parar de pensar em você."
            ,"Eu te amo e vou gritar pra todo mundo ouvir, ter você é meu desejo de viver."
            ,"Nem todos os anjos têm asas, às vezes, eles têm apenas o dom de te apaixonar, como você"
            ,"Apesar da distância que nosa separa, você está sempre na minha cabeça e no meu coração."
            ,"Posso estar no pior dia da minha vida, mesmo assim vou fazer de tudo para ver você sorrir."
            ,"Me perguntaram…O que você viu nela? Eu respondi… O que faltava em mim!"
            ,"O casal perfeito não é aquele que nunca tem problemas, mas sim aquele que apesar dos obstáculos sempre permanece juntos."
            ,"Não dá para negar, é você, tem sido você e vai continuar sendo você… Minha escolha, minha certeza, meu amor."
            ,"É impossível não sorrir quando me lembro de você?"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txNovaFrase = (TextView) findViewById(R.id.novaFraseID);
        tela = findViewById(R.id.telaID);

        Animation animation = new AlphaAnimation(1.0f,0.5f);
        animation.setDuration(1000);
        tela.startAnimation(animation);

        tela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Random r = new Random();
                int aleatorio = r.nextInt(frases.length);

                txNovaFrase.setText(frases[aleatorio]);
            }
        });
    }
}
