package escolaarcadia.blogspot.com.br.multi_idiomas;

/*
prof. Martin Morães
    http://lattes.cnpq.br/2746554350570335
    http://escolaarcadia.blogspot.com.br/
    https://github.com/martinmoraes
    https://www.youtube.com/channel/UCLih7IZ3jwhfkLg-Q0vb9Lg

Este código está disponível em: https://github.com/martinmoraes/Android-Multi-Idioma

FONTES:
http://developer.android.com/intl/pt-br/reference/java/util/Locale.html

ISO 639-1 - IDIOMA
https://en.wikipedia.org/wiki/ISO_639-1
http://www.loc.gov/standards/iso639-2/php/code_list.php

ISSO 3166-1 - REGIÃO
https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2
https://www.iso.org/obp/ui/#search
*/



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView tvNome, tvDtNasc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNome = (TextView) findViewById(R.id.textView);
        tvDtNasc = (TextView) findViewById(R.id.textView2);
    }

    public void altera(View view){
        tvNome.setText(getString(R.string.nome));
        tvDtNasc.setText(getString(R.string.dtnascimento));
    }

}
