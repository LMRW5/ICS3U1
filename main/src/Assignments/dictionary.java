package Assignments;

import java.util.*;
import java.io.*;

public class Dictionary {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        BufferedReader inputStream = null;
        String line = null;
        HashSet<String> words = new HashSet<String>();
        try {
            inputStream = new BufferedReader(new FileReader("C:\\Users\\342861630\\Desktop\\Main\\main\\src\\dictionary.txt"));
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
