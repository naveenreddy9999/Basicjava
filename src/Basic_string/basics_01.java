package Basic_string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class basics_01 {


    //length
    public static void main(String[] args) {

        String naveen = "gfh   dd   d  ddd   ddj   dj       sdv   hmb n,ds   kj  j v";

        int length = naveen.length();

        System.out.println(length);


        //**************concat


//        String oneConcat = "know your policies";
//
//
//        String twoConcat = " and abd";
//
//
//        System.out.println(oneConcat.concat(twoConcat));


        //***********compare

       // System.out.println(oneConcat.equals(twoConcat));


       ArrayList<String> cg = new ArrayList<>();

       String aa[] ={"naveen","naveen1","naveen2","naveen3","naveen4","naveen5"};

       for (int i=0;i< aa.length;i++){

           cg.add(aa[i]);


       }

       System.out.println(cg);

       System.out.println(cg.size());

        Scanner scanner = new Scanner(System.in);
        System.out.println("naveen enter ");

        String nm = scanner.next();

       for(int k=0;k<cg.size();k++){

           if((cg.get(k)).equals(nm)){
               System.out.println("my position is : " + k);
               System.out.println("naveen \"ok\" ");
               break;

           }

           System.out.println("increase " + k);
       }
    }

}
