package Basic_string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class basics_02 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("pls enter method");

        int oo= scanner.nextInt();


        if(oo==1) {
            split_one();
        }

       else if (oo==2) {
            split_two();
            System.out.println(split_two());
        }

         else if (oo==3){
             split_three();
         }

         else {
             System.out.println("method not found");
        }



    }

    public static void split_one() {

        String nm = "known your policies and processes better";

        System.out.println("first string name : " + nm);

        System.out.println("String length : " + nm.length());

        String sp[] = nm.split(" ");

        for (String str : sp) {
            System.out.print(str + " , ");

        }

    }

    public static String split_two() {

        String vowels = "a&b&c&d&e";

        String[] result = vowels.split("\\&");

       // System.out.println("result = " + Arrays.toString(result));

        return  Arrays.toString(result) ;

    }

    public static void split_three(){

        String vowels = "a:bc:de:fg:h";


        // limit is -2; array contains all substrings
        String[] result = vowels.split(":", -2);

        System.out.println("result when limit is -2 = " + Arrays.toString(result));

        // limit is 0; array contains all substrings
        result = vowels.split(":", 0);
        System.out.println("result when limit is 0 = " + Arrays.toString(result));

        // limit is 2; array contains a maximum of 2 substrings
        result = vowels.split(":", 2);
        System.out.println("result when limit is 2 = " + Arrays.toString(result));

        // limit is 4; array contains a maximum of 4 substrings
        result = vowels.split(":", 4);
        System.out.println("result when limit is 4 = " + Arrays.toString(result));

        // limit is 10; array contains a maximum of 10 substrings
        result = vowels.split(":", 10);
        System.out.println("result when limit is 10 = " + Arrays.toString(result));
    }

}

