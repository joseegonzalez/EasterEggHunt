package nyc.c4q.josegonzalez.easteregghunt;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import nyc.c4q.josegonzalez.easteregghunt.model.Insect;

import static nl.qbusict.cupboard.CupboardFactory.cupboard;

/**
 * Created by hakeemsackes-bramble on 12/17/16.
 */

public class InsectDatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "animal.db";
    private static final int DATABASE_VERSION = 1;
    private static InsectDatabaseHelper instance;

    public static synchronized InsectDatabaseHelper getInstance(Context context) {

        if (instance == null) {
            instance = new InsectDatabaseHelper(context.getApplicationContext());
        }
        return instance;
    }

    private InsectDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    static {
        cupboard().register(Insect.class);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        cupboard().withDatabase(db).createTables();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        cupboard().withDatabase(db).upgradeTables();
    }
}
