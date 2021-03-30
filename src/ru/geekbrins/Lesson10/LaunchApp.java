package ru.geekbrins.Lesson10;


import java.util.*;

public class LaunchApp {

    public static void main(String[] args) {

        taskFirst();
    }
    public static void taskFirst(){

       System.out.println("______________________________");
       System.out.println("Создаю массив набора слов:");
       System.out.println("______________________________");

        Map<String,Integer> word = new HashMap(); // Создаю хаш-таблицу для хранения пар (слово-ключ)
        ArrayList<String> array = new ArrayList(); // Создаю динамический массив и заполняю его словами

        array.add("cat");
        array.add("dog");
        array.add("cat");
        array.add("apple");
        array.add("cat");
        array.add("dog");
        array.add("apple");
        array.add("cloud");
        array.add("cat");
        array.add("carpet");
        array.add("cat");
        array.add("apple");
       for(int i = 0; i < array.size(); i++){ // Прохожу по всем элементам массива ArrayList
           String tempWord = array.get(i); // Присваиваю по очереди каждому элемнту временную переменную
           if(!word.containsKey(tempWord)){ // Если  не содержит ключ
               word.put(tempWord,1); // помещаем его в Map word (
           }else {
               word.put(tempWord,word.get(tempWord) + 1); //если слово уже в map добавляем 1
           }
       }
       for (Map.Entry<String,Integer> entry: word.entrySet()) { //Вывожу массив уникальных значений
           System.out.println("Слово: (" + entry.getKey() + ") повторений = " + entry.getValue());
       }System.out.println("______________________________");
   }
}
