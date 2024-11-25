
import java.util.Random;
import java.util.Scanner;

public class Main {
    static int is;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        GetName(input, random);


    }

    static void GetName(Scanner input, Random random) {
        System.out.println("How many names do you want to guess between? ");
        int num = Integer.parseInt(input.nextLine());
        String[] names = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.println("enter name: ");
            String name = input.nextLine();
            names[i] = name;
        }
        System.out.println(" ");
        System.out.print("The names are: ");
        for (int i = 0; i < num; i++) {
            if (i == 0) {
                System.out.print(names[i]);
            } else {
                System.out.print(", " + names[i]);
            }
        }
        System.out.println(" ");
        while(true) {
            System.out.println("Is that correct? ");
            String answer = input.nextLine();
            switch (answer) {
                case "yes":
                    is = 1;
                     Random random1 = Random.from()
                    break;
                case "no":
                    GetName(input, random);
                    is = 1;
                    break;
                default:
                    System.out.println("Invaild input");
            }
            if (is == 1){
                break;
            }
        }
    }
}