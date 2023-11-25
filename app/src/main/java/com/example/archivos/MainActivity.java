package com.example.archivos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //escribiryCrearArchivo("Hola mundo; como estas");
        lecturaArchivo();
    }

    public void escribiryCrearArchivo(String mensaje){
        File archivo = new File(getFilesDir(), "ArchivoGrupo3.txt");
        try {
            FileWriter escritor = new FileWriter(archivo, true);
            BufferedWriter bEscitor = new BufferedWriter(escritor);

            bEscitor.write(mensaje);
            bEscitor.newLine();
            bEscitor.close();
        } catch(IOException ex){
            ex.printStackTrace();
        }
    }
        public void lecturaArchivo() {
            try{
                File archivo = new File(getFilesDir(), "ArchivoGrupo3.txt");
                FileReader lector = new FileReader(archivo);
                BufferedReader blector = new BufferedReader(lector);
                StringBuilder contenido = new StringBuilder();
                String line;
                while ((line = blector.readLine()) != null){
                    contenido.append(line).append('\n');
                }
                blector.close();
                String archivoContenido = contenido.toString();
            }catch (IOException ex){
                
                ex.printStackTrace();
            }
        }
}