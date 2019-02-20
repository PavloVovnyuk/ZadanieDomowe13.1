import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista1 = createList ();
        System.out.println (lista1);
        reverseLista (lista1);
        addNum (lista1);
        maxNum (lista1);
        minNum (lista1);
    }

    private static List<Integer> createList() {
        List<Integer> lista = new ArrayList<> ();
        Scanner scanner = new Scanner (System.in);
        boolean positiveNum = true;
        while (positiveNum) {
            System.out.println ("Wprowadz liczbe dodatnią");
            int liczba = scanner.nextInt ();
            if (0 > liczba) {
                positiveNum = false;
                System.out.println ("Wprowadzona liczba jest ujemną");
            }
            if (liczba > 0) {
                lista.add (liczba);
                System.out.println (liczba);
            }
        }
        return lista;
    }

    private static void reverseLista(List<Integer> lista1) {
        for (int i = lista1.size () - 1; i >= 0; i--) {
            System.out.println (lista1.get (i));
        }
    }

    private static int addNum(List<Integer> lista1) {
        int sum = 0;
        Iterator<Integer> iterator = lista1.iterator ();
        while (iterator.hasNext ()) {
            Integer num = iterator.next ();
            System.out.print (num + " + ");
            sum = sum + num;
        }
        System.out.println (" = " + sum);
        return sum;
    }

    private static int maxNum(List<Integer> lista1) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < lista1.size (); i++) {
            if (lista1.get (i) > max)
                max = lista1.get (i);
        }
        System.out.println (" maksymalna liczba to " + max);
        return max;
    }

    private static int minNum(List<Integer> lista1) {

        int min = Integer.MAX_VALUE;
        Iterator<Integer> iterator = lista1.iterator ();
        while (iterator.hasNext ()) {
            Integer num = iterator.next ();
            if (num < min) {
                min = num;
            }
        }
        System.out.println (" minimalna liczba to " + min);
        return min;
    }
}
