package com.example.formulario.controladores;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

import com.example.formulario.SqlHelper;
import com.example.formulario.definiciones.DefBD;
import com.example.formulario.modelos.Estacion;

public class ControladorEstacion {

    private SqlHelper db;
    private Context context;


    public ControladorEstacion(Context context) {
        this.db = new SqlHelper(context,1);
        this.context = context;
    }

    public boolean AgregarEstacion(Estacion estacion){
        try {
            SQLiteDatabase sql = db.getWritableDatabase();
            ContentValues valores = new ContentValues();
            valores.put(DefBD.estacion_nombre, estacion.getNombre());
            valores.put(DefBD.estacion_empresa, estacion.getEmpresa());
            valores.put(DefBD.estacion_departamento, estacion.getDepartamento());
            valores.put(DefBD.estacion_municipio, estacion.getMunicipio());
            valores.put(DefBD.estacion_longitud, estacion.getLongitud());
            valores.put(DefBD.estacion_latitud, estacion.getLatitud());

            sql.insert(DefBD.tablaEstaciones, null, valores);
            db.close();
            return true;
        }catch (Exception e){
            Toast.makeText(context,"Error al registrar estación", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    public Cursor ObtenerEstaciones(){
        try {
            SQLiteDatabase sql = db.getReadableDatabase();
            Cursor c = sql.rawQuery("SELECT * FROM "+DefBD.tablaEstaciones, null);
            return c;
        } catch (Exception ex) {
            Toast.makeText(context, "Error consulta estaciones " + ex.getMessage(), Toast.LENGTH_LONG).show();
            return null;
        }
    }


}
