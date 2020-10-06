package es.deloitte.git.v1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class WeeklyAlgorithm {

    public static void main(String[] args) {
        System.out.println("=== WEEKLY ALGORITHM I ===");
        getOrderedListBySurnameWA();
        System.out.println("==========================");
    }

    private static void getOrderedListBySurnameWA() {
        System.out.println("For this String:");
        String unorderedNamesList = "Martin Fowler;Ken Schwaber;Arie VanBennekum;Alistair Cockburn;Ward Cunningham;Kent Beck;Andrew Hunt;Brian Marick;Dave Thomas;Mike Beedle;Ron Jeffries;Jon Kern;James Grenning;Robert Martin;Steve Mellor;Jeff Schwaber;Jim Highsmith";
        System.out.println(unorderedNamesList);
        System.out.println("Order it by surname.");
        System.out.println("RESPONSE: ");
        String orderedNamesList = Arrays.stream(unorderedNamesList.split(";"))
                .sorted(Comparator.comparing(a -> a.toString().split(" ")[1])
                        .thenComparing(a -> a.toString().split(" ")[0]))
                .collect(Collectors.joining(";"));
        System.out.println(orderedNamesList);
    }
}