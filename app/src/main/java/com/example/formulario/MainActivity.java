package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.formulario.controladores.ControladorEstacion;
import com.example.formulario.modelos.Estacion;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button agregar, verMapa;
    EditText nombre, empresa, departamento, municipio, longitud, latitud;
    ControladorEstacion controladorEstacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controladorEstacion = new ControladorEstacion(this);

        nombre = findViewById(R.id.nombreEstacionForm);
        empresa = findViewById(R.id.nombreEmpresa);
        departamento = findViewById(R.id.departamento);
        municipio = findViewById(R.id.municipio);
        longitud = findViewById(R.id.longitud);
        latitud = findViewById(R.id.latitud);


        verMapa = findViewById(R.id.ver_mapa);
        agregar = findViewById(R.id.btn_agregar);
        verMapa.setOnClickListener(this);
        agregar.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ver_mapa:
                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_agregar:
                AgregarEstacion();
                break;
        }
    }

    public boolean VerificarCampos(){
        if(nombre.getText().toString().isEmpty() || empresa.getText().toString().isEmpty() || departamento.getText().toString().isEmpty() || municipio.getText().toString().isEmpty() || longitud.getText().toString().isEmpty() || latitud.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(), "Los campos no pueden ser vacíos", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    public void LimpiarCampos(){
        nombre.setText("");
        empresa.setText("");
        departamento.setText("");
        municipio.setText("");
        longitud.setText("");
        latitud.setText("");
    }

    public void AgregarEstacion(){
        Estacion estacion = new Estacion();
        estacion.setNombre(nombre.getText().toString());
        estacion.setEmpresa(empresa.getText().toString());
        estacion.setMunicipio(empresa.getText().toString());
        estacion.setLongitud(longitud.getText().toString());
        estacion.setLatitud(latitud.getText().toString());

        if(!VerificarCampos())
            return;

        if(controladorEstacion.AgregarEstacion(estacion)){
            Toast.makeText(getApplicationContext(),"Estación agregada correctamente", Toast.LENGTH_SHORT).show();
            LimpiarCampos();
            return;
        }
    }
}