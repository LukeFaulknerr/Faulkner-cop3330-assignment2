package Useful.Java;

import java.util.Scanner;

public class Func {
    public static String scan(){
        Scanner s = new Scanner(System.in);
        String a;
        a = s.nextLine();
        return  a;
    }
    public static int roundUp(double d){
        int i = (int)d;
        double dec1 = d - i;
        dec1 *= 10;
        int i2 = (int)dec1;
        if (i2 < 5)
            return i;
        else
            return (i + 1);
    }

    public static Boolean numCheck(String s){
        try {
            int a = Integer.parseInt(s);
        }
        catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static Boolean inputCheck(String s){
        if (!numCheck(s)){
            return false;
        }
        return true;
    }
}
