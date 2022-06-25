package Hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> freq = new HashMap<>();// <Number,Frequency> pair
        int n = sc.nextInt();
        int temp;
        for (int i = 0; i < n; i++) {
            temp = sc.nextInt();
            if (!freq.containsKey(temp)) {
                freq.put(temp, 1);
            } else {
                freq.replace(temp, 1 + freq.get(temp));
            }
        }

        // freq.forEach((k, v) -> System.out.println("k = " + k + " v = " + v));

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            temp = sc.nextInt();
            if (freq.containsKey(temp) && freq.get(temp) > 0) {
                freq.replace(temp, freq.get(temp) - 1); // Decrement frequency to ensure it is not repeated
                ans.add(temp);
            }
        }

        Collections.sort(ans);

        System.out.print("[");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i));
            if (i < ans.size() - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
}