package es.logixs;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectorFichero {

    private String fichero;

    public LectorFichero(String fichero) {
        this.fichero = fichero;
    }

    public String getFichero() {
        return fichero;
    }

    public void setFichero(String fichero) {
        this.fichero = fichero;
    }

    public List<String> leerLineas() {

        List<String> lines = new ArrayList<>();
        Path filePath = Paths.get(fichero);
        try {
            lines = Files.readAllLines(filePath, StandardCharsets.UTF_8);
        } catch (IOException ex) {
            throw new RuntimeException("el fichero no existe");
        }

        return lines;
    }

    /*
    public List<String> leerLineasAvanzadas() {

        List<String> lines = new ArrayList<>();
        Path filePath = Paths.get(fichero);
        try {
            lines = Files.readAllLines(filePath, StandardCharsets.UTF_8);
            for (int i = 0; i < lines.size(); i++) {

                lines.set(i, lines.get(i).replace("|", ","));
            }

        } catch (IOException ex) {
            throw new RuntimeException("el fichero no existe");
        }

        return lines;
    }*/

}
