package com.example.transfertapp.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MaBaseSQLite extends SQLiteOpenHelper {
    /*table envoi*/
    public static final String TABLE_ENVOIS = "table_envoi";
    public static final String COL_ID = "ID";
    public static final String COL_PNOME = "PNOME";
    public static final String COL_NOME = "NOME";
    public static final String COL_TELE = "TELE";
    public static final String COL_CNIE = "CNIE";

    public static final String COL_NOMD = "NOMD";
    public static final String COL_PNOMD = "PNOMD";
    public static final String COL_TELD = "TELD";
    public static final String COL_MONTANT = "MONTANT";
    public static final String COL_NUMEROENVOI = "TRANSACTIONID";
    public static final String COL_DATE = "DATE";

    private static final String sql = "CREATE TABLE" + TABLE_ENVOIS + "("
            + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + COL_PNOME + " TEXT NOT NULL,"
            + COL_NOME + " TEXT NOT NULL,"
            + COL_TELE + " TEXT NULL,"
            + COL_CNIE + " TEXT,"
            + COL_NOMD + " TEXT NOT NULL,"
            + COL_PNOMD + " TEXT NOT NULL,"
            + COL_TELD + " TEXT NOT NULL,"
            + COL_MONTANT + " REAL NOT NULL,"
            + COL_NUMEROENVOI + " TEXT NOT NULL,"
            + COL_DATE +"TEXT);";
    /*fin table envoi*/

    public MaBaseSQLite(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //on execute le script de creation de nos tables
        //nous en avons une seule pour le moment
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //supprimer les tables
        //si on change la version les id repartent de 0
        db.execSQL("DROP TABLE" + TABLE_ENVOIS + ";");
        onCreate(db);
    }
}
