package unipac.com.br.visit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

        Button visitanteBtn, visitaBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        visitanteBtn = (Button) findViewById(R.id.visitantebtn);

        visitaBtn = (Button) findViewById(R.id.visitaBtn);

        visitanteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this,VisitanteActivity.class);
                startActivity(i);

            }
        });

        visitaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this,VisitaActivity.class);
                startActivity(i);

            }
        });
    }
}
