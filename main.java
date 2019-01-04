import java.util.Scanner;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("enter month");
        var month= Integer.parseInt(scanner.nextLine());

        String season;
        if (month==1 || month==2 || month==3)
            season="winter";
        else if(month==4||month==5||month==6)
            season="spring";
        else if(month==7||month==8||month==9)
            season="summer";
        else
            season="autumn";

        System.out.println(season);
    }
}
