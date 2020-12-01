package com.example.formulario;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.formulario.definiciones.DefBD;

public class SqlHelper extends SQLiteOpenHelper {
    public SqlHelper(@Nullable Context context, int version) {
        super(context, DefBD.nameDb, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DefBD.query1);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onCreate(db);
    }
}
