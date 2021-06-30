package com.meli.exercicio.codigomorse.exerciciocodigomorse.Classes;

public class CodigoMorse {

    private static class Letra {

        public char portugues;
        public String morse;

        Letra(char portugues, String morse) {
            this.portugues = portugues;
            this.morse = morse;
        }
    }

    private static Letra[] letras = new Letra[] {
            new Letra('A', ".-"),
            new Letra('B', "-..."),
            new Letra('C', "-.-."),
            new Letra('D', "-.."),
            new Letra('E', "."),
            new Letra('F', "..-."),
            new Letra('G', "--."),
            new Letra('H', "...."),
            new Letra('I', ".."),
            new Letra('J', ".---"),
            new Letra('K', "-.-"),
            new Letra('L', ".-.."),
            new Letra('M', "--"),
            new Letra('N', "-."),
            new Letra('O', "---"),
            new Letra('P', ".--."),
            new Letra('Q', "--.-"),
            new Letra('R', ".-."),
            new Letra('S', "..."),
            new Letra('T', "-"),
            new Letra('U', "..-"),
            new Letra('V', "...-"),
            new Letra('W', ".--"),
            new Letra('X', "-..-"),
            new Letra('Y', "-.--"),
            new Letra('Z', "--.."),

            new Letra(' ', "   ")
    };



    public static String portugues(String morse) {
        StringBuilder textPortugues = new StringBuilder();
        String[] palavrasMorse = morse.split("\\Q   \\E");
        for (String palavraMorse : palavrasMorse) {
            if (textPortugues.length() > 0) {
                textPortugues.append(" ");
            }
            String[] letrasMorse = palavraMorse.trim().split(" ");
            for (String letraMorse : letrasMorse) {
                textPortugues.append(letraNormal(letraMorse));
            }
        }
        return textPortugues.toString();
    }


    private static char letraNormal(String morse) {

        for (Letra letra : letras) {
            if (letra.morse.equals(morse)) {
                return letra.portugues;
            }
        }
        throw new IllegalArgumentException("Símbolo inválido: \"" + morse + "\" Não foi possível efetuar sua tradução, verifique se foi digitado corretamente.");
    }

}
