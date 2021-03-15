package by.franc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        Worder worder =new Worder();
        Team t1 =new Team();
        Team t2 =new Team();
        t1.setNumberOfPlayers(3);
        t2.setNumberOfPlayers(3);
        t1.setTeamName("Желторотики");
        t2.setTeamName("Ниочем");
        worder.ArrFiller(t1.getNumberOfPlayers()+ t2.getNumberOfPlayers());
        for (int i = 0; i <6 ; i++) {
            worder.CheckWord(scanner.nextLine());
            worder.ShowWordsArray();
        }


        //System.out.println(worder.CheckWord("qwe"));

    }
}
