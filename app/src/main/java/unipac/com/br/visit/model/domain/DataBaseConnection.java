package unipac.com.br.visit.model.domain;

import android.content.Context;
import android.database.sqlite.SQLiteAbortException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Antonio Carlos on 19/09/2017.
 */

public class DataBaseConnection extends SQLiteOpenHelper {
    public DataBaseConnection(Context context) {
        super(context, "visit.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE visitante (ID INTEGER PRIMARY KEY autoincrement," + "nome VARCHAR(100))");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        db.execSQL("DROP TABLT visitante");
        onCreate(db);

    }
}
