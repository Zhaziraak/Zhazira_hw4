import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> groupA = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String names = scanner.nextLine();
            groupA.add(names);
        }
        System.out.println(groupA);

        ArrayList<String> groupB = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String names = scanner.nextLine();
            groupB.add(names);
        }
        System.out.println(groupB);
        Collections.reverse(groupB);

        ArrayList<String> allNames = new ArrayList<>();
        allNames.add(0, groupA.get(0));
        allNames.add(1, groupB.get(0));
        allNames.add(2, groupA.get(1));
        allNames.add(3, groupB.get(1));
        allNames.add(4, groupA.get(2));
        allNames.add(5, groupB.get(2));
        allNames.add(6, groupA.get(3));
        allNames.add(7, groupB.get(3));
        allNames.add(8, groupA.get(4));
        allNames.add(9, groupB.get(4));

        System.out.println(allNames);

        allNames.sort(Comparator.comparing(String::length));
        System.out.println(allNames);

    }
}