package unipac.com.br.visit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class VisitaActivity extends AppCompatActivity {

    TextView visitanteTV;
    EditText dataEdt;
    Button salvarBtn;
    String id;
    String nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visita);

        Toast.makeText(this, "Visita",Toast.LENGTH_LONG).show();

        visitanteTV = (TextView)findViewById(R.id.visitanteTV);
        dataEdt = (EditText) findViewById (R.id.dataEdt);
        salvarBtn =  (Button)findViewById(R.id.salvarBtn);
        findViewById(R.id.salvarBtn);

        Bundle extras = getIntent().getExtras();

        if(extras != null){

             id= extras.getString("ID_VISITANTE");
             nome= extras.getString("NOME_VISITANTE");
        }

        salvarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = dataEdt.getText().toString();

                Toast.makeText(VisitaActivity.this,
                        "Dados do Visitante" + nome + "Nome" + "Data" + data,
                        Toast.LENGTH_LONG).show();
            }

        });

    }

}

