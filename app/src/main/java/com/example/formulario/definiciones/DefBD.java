package com.example.formulario.definiciones;

public class DefBD {
    //DB nombre
    public static String nameDb = "mapa";
    //Tablas
    public static final String tablaEstaciones = "estaciones";
    //variables
    public static final String estacion_nombre = "nombre";
    public static final String estacion_empresa = "empresa";
    public static final String estacion_departamento = "departamento";
    public static final String estacion_municipio = "municipio";
    public static final String estacion_longitud = "longitud";
    public static final String estacion_latitud = "latitud";


    //Querys

    public static final String query1 = "CREATE TABLE IF NOT EXISTS " + DefBD.tablaEstaciones + " ( "
            +"_ID" + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            +DefBD.estacion_nombre + " TEXT, "
            +DefBD.estacion_empresa + " TEXT, "
            +DefBD.estacion_departamento + " TEXT, "
            +DefBD.estacion_municipio + " TEXT, "
            +DefBD.estacion_longitud + " TEXT, "
            +DefBD.estacion_latitud+" TEXT );";


}
