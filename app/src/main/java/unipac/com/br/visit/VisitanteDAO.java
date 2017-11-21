package unipac.com.br.visit;

import android.app.ListActivity;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import unipac.com.br.visit.model.domain.DataBaseConnection;
import unipac.com.br.visit.model.domain.Visitante;

/**
 * Created by Antonio Carlos on 19/09/2017.
 */

public class VisitanteDAO extends DataBaseConnection{
    private SQLiteDatabase db;


    public VisitanteDAO(Context context) {
        super(context);
    }

    public void salvar(Visitante visitante){
        SQLiteDatabase database = this.getReadableDatabase();
        ContentValues valores = new ContentValues();
        valores .put("nome",visitante.getNome());
        database.insert("visitante",null,valores);

    }

    public List<Visitante> pegaTodos(){

        SQLiteDatabase database = this.getReadableDatabase();
        List<Visitante> visitantes = new ArrayList<>();

        String sql = "SELECT * FROM visitante";

        Cursor c = database.rawQuery(sql,null);

        while (c.moveToNext()){

            Visitante visitante = new Visitante();
            visitante.setNome(c.getString(1));
            visitantes.add(visitante);
        }
        return visitantes;
    }
}
