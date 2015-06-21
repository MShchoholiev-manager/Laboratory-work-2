/**
 * Created by Максим on 07.06.2015.
 */
import java.awt.*;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.util.Scanner;

public class Book {

    public String nameBook;
    private Genre gerne;
    private Epoch epoch;
    private Author author;


    public void search() {
    }

    public void letterSorting() {
    }

    public void selectBooks() {
    }

        public static void main (String[]args){
        String s1, s2;
        int r = 0;
        int k = 0;
        int p = 0;
            do {
                r = 0;
        try {

            String[][] data = {
                    {"1", "Around the World in Eighty Days", "Jules Verne", "France", "Adventures", "XIX century", "", ""},
                    {"2", "Robinson Crusoe", "Daniel Defoe", "England", "Adventures", "XVIII century", "", ""},
                    {"3", "The Hunchback of Notre-Dame", "Victor Hugo", "France", "Hisoric", "XIX century", "", ""},
            };


                Scanner scnr = new Scanner(System.in);

                System.out.println("Enter the name of the book.");
                s1 = scnr.nextLine();

                for (int i = 0; i <= 2; i++) {


                    if (data[i][1].equals(s1)) {

                        for (int j = 0; j <= 5; j++) {
                            System.out.println(data[i][j]);
                        r = 1; }
                    }
                }
                int length = s1.length();
                if (length>31)
                    throw new IndexOutOfBoundsException();
                if (length == 0)
                    throw new NullPointerException();

        } catch (IndexOutOfBoundsException e) {
            System.out.println("The word is too long.");
        } catch (NullPointerException e) {
            System.out.println("You have not entered any symbol."); }
        if (r == 0) {
            System.out.println("There is no such book in the list.");
        }
                Scanner sc = new Scanner(System.in);
                System.out.println();
                System.out.println("Do you want to repeat entering?");
                do {
        p = 0;
        System.out.println("Press 1 if you want to repeat entering. Press 2 if you don't want");
        s2 = sc.nextLine();
        if (!"1".equals(s2) & !"2".equals(s2)) {
            System.out.println("You have entered the wrong number. Please try again");
            p = 1; }
        if (s2.length() == 0) {
            System.out.println("You have entered nothing. Please try again");
            p = 1; }}
        while (p == 1);
        if ("2".equals(s2)) k = 1;
            }
            while (k == 0);
    }
    }