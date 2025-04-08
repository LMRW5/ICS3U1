package Assignments.Dictionary;

import java.util.*;
import java.io.*;

public class Dictionary {
    public static void main(String[] args) throws IOException {
        final String dictionary = "main\\src\\Assignments\\Dictionary\\dictionary.txt";
        Scanner input = new Scanner(System.in);
        BufferedReader inputStream = null;
        String line = null;
        HashSet<String> words = new HashSet<String>();
        try {
            inputStream = new BufferedReader(
                    new FileReader(dictionary));
            while ((line = inputStream.readLine()) != null) {
                words.add(line);
            }
        } catch (Exception err) {
            System.out.println(err);
        } finally {
            inputStream.close();
        }
        System.out.println("\nWhat is your sentence");
        String sentence = input.nextLine();
        input.close();
        StringTokenizer tokens = new StringTokenizer(sentence, " ");
        int ctr = 1;
        while (tokens.hasMoreTokens()) {
            String token = tokens.nextToken().toLowerCase();
            System.out.printf("%d. %s %s\n", ctr, token, (words.contains(token) ? " <valid>" : " <invalid>"));
            ctr++;
        }

    }
}
