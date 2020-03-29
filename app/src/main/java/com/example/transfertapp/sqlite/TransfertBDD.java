package com.example.transfertapp.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class TransfertBDD {
    private SQLiteDatabase bdd;
    private MaBaseSQLite maBaseSQLite;

    private static final int VERSION_BDD = 1;
    private static final String NOM_BDD = "transfert.db";

    public TransfertBDD(Context context){
        //on cree la BDD et sa Table
        maBaseSQLite = new MaBaseSQLite(context, NOM_BDD, null, VERSION_BDD);
    }

    public void open(){
        //on ouvre la BDD ecriture
        bdd = maBaseSQLite.getWritableDatabase();
    }

    public void close(){
        //on ferme l'acces a la BDD
        bdd.close();
    }

    public SQLiteDatabase getBDD(){
        return bdd;
    }

    public long insertEnvoi(Envoi envoi){
        //creation d'un contentValues(fonctionne comme une HashMap)
        ContentValues values = new ContentValues();
        values.put(MaBaseSQLite.COL_NOME, envoi.getNomEmetteur());
        values.put(MaBaseSQLite.COL_PNOME, envoi.getPrenomEmetteur());
        values.put(MaBaseSQLite.COL_TELE, envoi.getMobileEmetteur());
        values.put(MaBaseSQLite.COL_CNIE, envoi.getCniEmetteur());
        values.put(MaBaseSQLite.COL_NOMD, envoi.getNomDestinataire());
        values.put(MaBaseSQLite.COL_PNOMD, envoi.getPrenomDestinataire());
        values.put(MaBaseSQLite.COL_TELD, envoi.getMobileDestinataire());
        values.put(MaBaseSQLite.COL_MONTANT, envoi.getMontant());
        values.put(MaBaseSQLite.COL_DATE, envoi.getDate());
        values.put(MaBaseSQLite.COL_NUMEROENVOI, envoi.getTransactionId());

        //on insere l'objet dans la BDD via le ContentValues
        return bdd.insert(MaBaseSQLite.TABLE_ENVOIS, null, values);

    }

    public String ListEnvoi(){
        Cursor cursor = bdd.rawQuery("SELECT * FROM " + MaBaseSQLite.TABLE_ENVOIS, null);
        while(cursor.moveToNext()){
            System.out.println(cursor.getInt(0));
            System.out.println(cursor.getString(1));
            System.out.println(cursor.getString(2));
        }
        cursor.close();
        return"";
    }

}
