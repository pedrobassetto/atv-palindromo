package com.pedrobassetto;

import javax.sound.sampled.SourceDataLine;

public class Palindromo {

    public boolean isPalindromo(String word) {

        String newWord = wordFormat(word);
        String invNewWord = "";
        
        for(int i = newWord.length() - 1; i >= 0; i--) {
            invNewWord += newWord.charAt(i);
        }

        return newWord.equals(invNewWord);
    }

    public String wordFormat(String word) {
        word = word.replaceAll("[^a-zA-Z0-9 ]", ""); //retira caracteres especiais 
        word = word.replaceAll("\\s+",""); //retira espacos
        return word.toUpperCase(); 
    }

}
