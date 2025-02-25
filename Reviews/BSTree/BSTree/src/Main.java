// ======= DO NOT EDIT THIS FILE ============

import java.io.*;
import java.util.*;

class Main {

    public static void main(String args[]) throws Exception {
        MyTree t = new MyTree();
        t.load();
        int choice;
        Scanner sca = new Scanner(System.in);
        System.out.println();
        System.out.println(" 1. Test f1 - compute height");
        System.out.println(" 2. Test f2 - count nodes");
        System.out.println(" 3. Test f3 - count leaf nodes");
        System.out.println(" 4. Test f4 - compute sum of nodes ");
        System.out.println(" 5. Test f5 - Pre-Order ");
        System.out.println(" 6. Test f6 - In-Order ");
        System.out.println(" 7. Test f7 - Post-Order ");
        System.out.println(" 8. Test f8 - Search ");
        System.out.print("    Your selection (1 -> 10): ");
        choice = sca.nextInt();
        sca.nextLine();
        int r;
        switch (choice) {
            case 1:
                System.out.println("Height:");
                r = t.f1();
                System.out.println(r);
                break;
            case 2:
                System.out.println("Count nodes:");
                r = t.f2();
                System.out.println(r);
                break;
            case 3:
                System.out.println("Count leaf nodes:");
                r = t.f3();
                System.out.println(r);
                break;
            case 4:
                System.out.println("Sum of nodes:");
                r = t.f4();
                System.out.println(r);
                break;
            case 5:
                System.out.println("PreOrder:");
                t.f5();
                break;
            case 6:
                System.out.println("InOrder:");
                t.f6();
                break;
            case 7:
                System.out.println("PostOrder:");
                t.f7();
                break;
            case 8:
                System.out.println("Sum of nodes:");
                r = t.f8(10);
                if (r == 1) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
                break;
            default:
                System.out.println("Wrong selection");
        }
        System.out.println();
    }
}
