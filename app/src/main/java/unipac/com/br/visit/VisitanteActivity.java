package unipac.com.br.visit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import unipac.com.br.visit.model.domain.Visitante;

public class VisitanteActivity extends AppCompatActivity {

    EditText nomeEdt,emailEdt;
    Button salvarBtn;
    List<Visitante> visitantes;
    ListView listaVisitanteView;
    VisitanteDAO dao = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visitante);

        Toast.makeText(this, "Visitante Activity",Toast.LENGTH_LONG).show();

         nomeEdt = (EditText) findViewById(R.id.nomeEdt);
         emailEdt = (EditText) findViewById(R.id.emailEdt);

         salvarBtn = (Button) findViewById(R.id.salvarBtn);


        //visitantes = new ArrayList<>();

        dao = new VisitanteDAO(this);
        //VisitanteAdapter adapter =  new VisitanteAdapter(visitantes, this );
        VisitanteAdapter adapter =  new VisitanteAdapter(dao.pegaTodos(), this );
        listaVisitanteView = (ListView) findViewById(R.id.listaVisitantes);
        listaVisitanteView.setAdapter(adapter);

        salvarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = nomeEdt.getText().toString();
                String email = emailEdt.getText().toString();

                Visitante visitante = new Visitante();
                visitante.setNome(nome);
                visitante.setEmail(email);
                dao.salvar(visitante);

                //visitantes.add(visitante);

                Toast.makeText(VisitanteActivity.this,
                        "Dados do Visitante" + nome + "Nome" + "Email" + email,
                        Toast.LENGTH_LONG).show();

                Intent i = new Intent(VisitanteActivity.this,VisitaActivity.class);
                i.putExtra("ID_VISITANTE",email);
                i.putExtra("NOME_VISITANTE",nome);
                startActivity(i);



            }
        });

    }

}
