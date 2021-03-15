package by.franc;

import java.util.Arrays;
import java.util.Scanner;

// содержит архив слов, проверяет слово на правильность, заполняет массив словами, выдает случайное слово из массива.
public class Worder {
   private String [] wordsArray;
   private String [] resultArray;

   //заполняем массив словами
   public  void ArrFiller( int numberOfPlayers){
       wordsArray =new String[numberOfPlayers];
       Scanner word = new Scanner(System.in);
       for (int i = 0; i < wordsArray.length ; i++) {wordsArray[i]=word.nextLine();

       }
   }

   //выводим на экран массив
   public void ShowWordsArray(){
       for (String s : resultArray) System.out.print(s + " ");

   }
   //проверяем есть ли введенное слово в массиве и копируем значения в новый массив
   public void CheckWord(String word){
       //for (int i = 0,j= wordsArray.length-1; i < wordsArray.length ; i++,--j) { if (word.equals(wordsArray[i])){ wordsArray[i]=wordsArray[j];  }
       int i =0;
       resultArray= new String[wordsArray.length];
       for (String arrWord:wordsArray) {
           if (!word.equals(arrWord)) { resultArray[i]=arrWord;i++; }
           }
   }



       }








