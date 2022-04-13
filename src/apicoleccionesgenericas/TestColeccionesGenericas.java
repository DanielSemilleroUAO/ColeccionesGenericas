/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apicoleccionesgenericas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author adseglocdom
 */
public class TestColeccionesGenericas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sábado");
        miLista.add("Domingo");

        String elemento = miLista.get(0);
        System.out.println(elemento);
        imprimir(miLista);

        Set<String> miSet = new HashSet<>();

        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sábado");
        miSet.add("Domingo");

        imprimir(miSet);

        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("valor1", "Daniel");
        miMapa.put("valor2", "Alicia");
        miMapa.put("valor3", "Jennifer");

        String ElementoMapa = miMapa.get("valor1");
        System.out.println(ElementoMapa);

        imprimir(miMapa.keySet());
        imprimir(miMapa.values());

    }

    public static void imprimir(Collection<String> collection) {
        collection.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }

}
