package logicaDiccionario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class DiccionarioEI {

    public static void main(String[] args) {
        // Con map iniciamos el diccionario Español-Inglés con 20 palabras
        Map<String, String> diccionarioEspanolIngles = new HashMap<>();


        // .put  nos permite almacenar o realacionar palabras pares(clave Español - valor Ingles) como computadora es = computer
        diccionarioEspanolIngles.put("perro", "dog");
        diccionarioEspanolIngles.put("gato", "cat");
        diccionarioEspanolIngles.put("casa", "house");
        diccionarioEspanolIngles.put("coche", "car");
        diccionarioEspanolIngles.put("libro", "book");
        diccionarioEspanolIngles.put("computadora", "computer");
        diccionarioEspanolIngles.put("manzana", "apple");
        diccionarioEspanolIngles.put("agua", "water");
        diccionarioEspanolIngles.put("sol", "sun");
        diccionarioEspanolIngles.put("luna", "moon");
        diccionarioEspanolIngles.put("árbol", "tree");
        diccionarioEspanolIngles.put("flor", "flower");
        diccionarioEspanolIngles.put("puerta", "door");
        diccionarioEspanolIngles.put("ventana", "window");
        diccionarioEspanolIngles.put("silla", "chair");
        diccionarioEspanolIngles.put("mesa", "table");
        diccionarioEspanolIngles.put("escuela", "school");
        diccionarioEspanolIngles.put("amigo", "friend");
        diccionarioEspanolIngles.put("tiempo", "time");
        diccionarioEspanolIngles.put("ciudad", "city");

        // Toma las llaves ( espacio de las palabras en español) y mezcla aleatoria
        List<String> palabrasEspanol = new ArrayList<>(diccionarioEspanolIngles.keySet()); // keySet pertenece a las estructuras de tipo Map en Java aqui use HasMap
                                                          // Extrae todas las claves (palabras en español) del diccionario y luego se convierte en una lista.

        Collections.shuffle(palabrasEspanol); // Collections es una clase de utilidad de Java que proporciona métodos estáticos para operar con colecciones (como listas, conjuntos, etc.).
                                        // El metodo .shuffle() barajea o desordena de forma aleatoria los elementos de la lista que le pases como parametro.


        // Selecciona las primeras 5 palabras de la lista mezclada
        List<String> palabrasSeleccionadas = palabrasEspanol.subList(0, 5);// subList hagarra las primeras 5 opciones de la lista para mostrarlas


        // Inicia scanner para que podamos visualizar el programa
        Scanner scanner = new Scanner(System.in);
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;

        System.out.println("==================================================");
        System.out.println("     Mini Juego: Diccionario ESPAÑOL -> INGLÉS    ");
        System.out.println("==================================================");
        System.out.println("Se te presentarán 5 palabras al azar. Ingresa su traducción al inglés.\n");

        // for de las 5 palabras seleccionadas para evaluar al usuario
        for (int i = 0; i < palabrasSeleccionadas.size(); i++) {
            String palabraActualEsp = palabrasSeleccionadas.get(i);
            String traduccionEsperada = diccionarioEspanolIngles.get(palabraActualEsp);

            System.out.print("[" + (i + 1) + "/5] ¿Cuál es la traducción al inglés de \"" + palabraActualEsp + "\"? R = ");
            String respuestaUsuario = scanner.nextLine().trim().toLowerCase();//nextLine() espera el evento de enter ideal para cuando el usuario necesita primero leer la linea

            // Validación de respuesta (normalizando minúsculas y espacios)
            if (respuestaUsuario.equals(traduccionEsperada.toLowerCase())) {
                System.out.println(" > ¡Correcto!\n");
                respuestasCorrectas++;
            } else {
                System.out.println(" > Incorrecto. La respuesta correcta era: \"" + traduccionEsperada + "\"\n");
                respuestasIncorrectas++;

            }//else

        }// for

        // Cierre
        scanner.close();


        System.out.println("==================================================");
        System.out.println("                     RESULTADO                    ");
        System.out.println("==================================================");
        System.out.println(" Total de preguntas:       5");
        System.out.println(" Respuestas correctas:     " + respuestasCorrectas);
        System.out.println(" Respuestas incorrectas:   " + respuestasIncorrectas);
        System.out.println(" Puntuación final:         " + (respuestasCorrectas * 20) + " / 100");
        System.out.println("==================================================");

        if (respuestasCorrectas == 5) {
            System.out.println("> ¡Excelente trabajo! Dominio perfecto del vocabulario.");
        } else if (respuestasCorrectas >= 3) {
            System.out.println("> ¡Buen trabajo! Has aprobado satisfactoriamente.");
        } else {
            System.out.println("> Sigue practicando para mejorar tu vocabulario en inglés.");
        }//else

    }//main

}// class DiccionarioEI
