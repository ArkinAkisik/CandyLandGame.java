import GameSave.GameSaveFile;
import Level.Hard;
import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.io.*;
import java.util.Scanner;

public class Main {
    private Object SaveFile;
       
    /*public static Integer[] MakeArray(int b) {
       
        Integer[] aa = new Integer[100];
       
        for (int i = 0; i < 100; i++) {
            aa[i]=b+i;
        }
       
        return aa;
    }
   
        public static void PrintArray(Integer[] b) {
       
        for (int i = 0; i < 100; i++) {
            System.out.print(b[i] + ", ");
        }
            System.out.println("");
    }
   
        public static void EvaluateArray(Integer[] b) {
       
            Scanner scan = new Scanner(System.in);
           
            System.out.println("The array index is: ");
            int indx = scan.nextInt();
            System.out.println("The array element at " + indx + " contains: "+b[indx]);
            if (b[indx] % 2 == 0) {
                System.out.println("It is even!");
            }
            else{
                System.out.println("It is odd!");
            }
           

    }
       
        public static String Switch(String a) {
       
            if ( a.length() != 1) {
               
           
            char first = a.charAt(0);
            char last = a.charAt(a.length()-1);
            String word = last + a.substring(1,a.length() - 1) + first;
            return word;
           
            }
           
            return a;
        }*/

    public static String[][] MakeArrayMedium() {

        String[][] aa =
                {{" P "," R "," G "," O "," B "," Y "," P "," R "," G "," O "," B "," Y "," P "," R "," G "," O "},
                        {" X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," S "," X "," X "," X "," B "},
                        {" G "," R "," P "," Y "," B "," O "," G "," R "," P "," Y "," B "," O "," G "," R "," P "," Y "},
                        {" O "," X "," X "," S "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "},
                        {" B "," Y "," P "," R "," GM"," O "," B "," Y "," P "," R "," G "," O "," BM"," Y "," P "," R "},
                        {" X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," G "},
                        {" P "," Y "," B "," O "," G "," R "," P "," Y "," B "," O "," G "," R "," P "," Y "," B "," O "},
                        {" R "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "},
                        {" G "," O "," B "," Y "," P "," R "," G "," O "," B "," Y "," P "," R "," G "," O "," B "," Y "},
                        {" X "," X "," X "," X "," X "," X "," X "," X "," S "," X "," X "," X "," X "," X "," X "," P "},
                        {" B "," O "," G "," R "," P "," Y "," B "," O "," GM"," R "," P "," Y "," B "," O "," G "," R "},
                        {" Y "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "},
                        {" P "," R "," G "," O "," B "," Y "," P "," R "," G "," O "," B "," Y "," P "," R "," G "," O "},
                        {" X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," S "," X "," B "},
                        {" KL"," R "," P "," Y "," B "," O "," G "," R "," P "," Y "," B "," O "," G "," R "," P "," Y "}};

        for (int i = 0; i < 15; i++) {

            for (int j = 0; j < 16; j++) {

                System.out.print(aa[i][j]);
            }

            System.out.println("");
        }

        System.out.println("\nR: Red , P: Purple , Y: Yellow , B: Blue , O: Orange, G: Green \nS: Shortcut , M: Mud , X: Invalid");
        System.out.println("quit (type q)");
        return aa;
    }

    public void GameSaver(GameSaveFile Game) throws IOException {
        //Create file output stream
        FileOutputStream fileOutStr = new FileOutputStream("Game Save");
        //Create object output stream and write object
        ObjectOutputStream objOutStr = new ObjectOutputStream(fileOutStr);
        objOutStr.writeObject(SaveFile);

        objOutStr.close();
        fileOutStr.close();
        System.out.println("Data is saved in a file  - Game Save");
    }

    //Method to deserialize GameSaveFile from file
    public GameSaveFile CandylandLoad (String filename) throws IOException,
            ClassNotFoundException{
        FileInputStream fileInStr = new FileInputStream(filename);
        ObjectInputStream objInStr = new ObjectInputStream(fileInStr);
        GameSaveFile Candyland = (GameSaveFile) objInStr.readObject();
        objInStr.close();
        fileInStr.close();

        return Candyland;

    }

    public static  String[][] MakeArrayEasy() {

        String[][] aa =
                {{" P "," R "," G "," O "," B "," Y "," P "," R "," G "," O "," B "," Y "," P "," R "," G "," O "},
                        {" X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," S "," X "," X "," X "," B "},
                        {" G "," R "," P "," Y "," B "," O "," G "," R "," P "," Y "," B "," O "," G "," R "," P "," Y "},
                        {" O "," X "," X "," S "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "},
                        {" B "," Y "," P "," R "," G "," O "," B "," Y "," P "," R "," G "," O "," B "," Y "," P "," R "},
                        {" X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," G "},
                        {" P "," Y "," B "," O "," G "," R "," P "," Y "," B "," O "," G "," R "," P "," Y "," B "," O "},
                        {" R "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," S "," X "," X "},
                        {" G "," O "," B "," Y "," P "," R "," G "," O "," B "," Y "," P "," R "," G "," O "," B "," Y "},
                        {" X "," X "," X "," X "," X "," X "," X "," X "," S "," X "," X "," X "," X "," X "," X "," P "},
                        {" B "," O "," G "," R "," P "," Y "," B "," O "," G "," R "," P "," Y "," B "," O "," G "," R "},
                        {" Y "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "},
                        {" P "," R "," G "," O "," B "," Y "," P "," R "," G "," O "," B "," Y "," P "," R "," G "," O "},
                        {" X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," S "," X "," B "},
                        {" KL"," R "," P "," Y "," B "," O "," G "," R "," P "," Y "," B "," O "," G "," R "," P "," Y "}};

        for (int i = 0; i < 15; i++) {

            for (int j = 0; j < 16; j++) {

                System.out.print(aa[i][j]);
            }

            System.out.println("");
        }

        System.out.println("\nR: Red , P: Purple , Y: Yellow , B: Blue , O: Orange, G: Green \nS: Shortcut X: Invalid");
        System.out.println("quit (type q)");
        return aa;
    }

    public static  String[][] MakeArrayHard() {

        String[][] aa =
                {{" P "," R "," G "," O "," B "," Y "," P "," R "," G "," O "," B "," YM"," P "," R "," G "," O "},
                        {" X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," B "},
                        {" G "," R "," P "," Y "," B "," O "," G "," R "," P "," Y "," B "," O "," G "," R "," P "," Y "},
                        {" O "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "},
                        {" B "," Y "," P "," R "," G "," O "," B "," Y "," PM"," R "," G "," O "," B "," Y "," P "," R "},
                        {" X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," G "},
                        {" P "," Y "," B "," O "," G "," R "," P "," Y "," B "," O "," G "," R "," P "," Y "," B "," O "},
                        {" R "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "},
                        {" G "," O "," B "," Y "," PM"," R "," G "," O "," B "," Y "," P "," R "," G "," O "," B "," Y "},
                        {" X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," P "},
                        {" B "," O "," G "," R "," P "," Y "," B "," O "," GM"," R "," P "," Y "," B "," O "," G "," R "},
                        {" Y "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "},
                        {" P "," R "," G "," O "," B "," Y "," P "," R "," G "," O "," B "," Y "," P "," R "," G "," O "},
                        {" X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," X "," B "},
                        {" KL"," R "," P "," Y "," B "," O "," G "," R "," PM"," Y "," B "," O "," G "," R "," P "," Y "}};

        for (int i = 0; i < 15; i++) {

            for (int j = 0; j < 16; j++) {

                System.out.print(aa[i][j]);
            }

            System.out.println("");
        }

        System.out.println("\nR: Red , P: Purple , Y: Yellow , B: Blue , O: Orange, G: Green \nM: Mud , X: Invalid");
        System.out.println("Exit the game (type q)");
        return aa;
    }

    public static String getcard(){

        String val = "value";
        int card = (int)(Math.random()*5.99);
        if (card == 0) {val = " R ";}
        else if (card == 1) {val = " P ";}
        else if (card == 2) {val = " Y ";}
        else if (card == 3) {val = " B ";}
        else if (card == 4) {val = " O ";}
        else if (card == 5) {val = " G ";}

        return val;
    }

    public static Integer[][] getloc1(String [][] a){

        Integer [][] ar = new Integer[1][2];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] == " K " || a[i][j] == " KL") {
                    ar[0][0] = i;
                    ar[0][1] = j;
                    break;
                }
            }
        }
        return ar;
    }

    public static String [][] move1(String a, Integer[][] b , String[][] c){

        //String temp = "temp";
        int index1 = b[0][0];
        int index2 = b[0][1];
        if (c[index1][index2] == " KL") {

            c[index1][index2] = " L ";

        }
           
            /*else if (c[index1][index2] == " K ") {
               
                c[index1][index2] = temp;
               
            }*/

        for (int i = index1; i > 0 ; i--) {
            for (int j = index2; j < c.length; j++) {
                if (a == c[i][j]) {
                    //temp = c[i][j];
                    c[i][j] = " K ";
                    break;
                }
            }
        }
        return c;

    }

    public static void getarray(String [][] a) {

        for (int i = 0; i < 15; i++) {

            for (int j = 0; j < 16; j++) {

                System.out.print(a[i][j]);
            }

            System.out.println("");
        }


    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n\n          WELCOME TO CANDYLAND GAME          \n\n\n");
        System.out.println("\n   If You Want To Load last Game Go Back To The Main Screen \n");

     //   int qq = scan.nextInt();
       // System.out.println("");

     //   int Yes = qq;
      //  int No = qq;

     //   if (qq == Yes);

      //  int load = scan.nextInt();
      //  if (load ==1){

         //   char loads[][][] = load(aa);
         //   for (int i = 0; i < 15; i++) {

            //    for (int j = 0; j < 16; j++) {

           //         aa[i][j]=loads[1][i][j];

            //    }
            //    }


       // }



        System.out.println("To Start The Game Please Select Difficult" + "\n 1 - Easy \n 2 - Medium \n 3 - Hard \n");






        int kk = scan.nextInt();
        System.out.println("");


        int bb = 1;

        while (bb == 1) {

            if (kk == 1) {

                System.out.println("                Candy Land Map           \n");
                String [][] fullarrayeasy = MakeArrayEasy();

                System.out.println("\nPick a Card listed Above R,P,Y,B,O,G \n");
                String bbc = scan.next();

                if (bbc.equals("q")) {
                    bb = 2;
                    System.out.println("THANK YOU FOR THE GAME");

                }
                else if (getcard() == " R ") {
                    System.out.println("\nYou picked Red!");
                }
                else if (getcard() == " P ") {
                    System.out.println("\nYou picked Purple!");
                }

                else if (getcard() == " Y ") {
                    System.out.println("\nYou picked Yellow!");
                }

                else if (getcard() == " B ") {
                    System.out.println("\nYou picked Blue!");
                }

                else if (getcard() == " O ") {
                    System.out.println("\nYou picked Orange!");
                }

                else if (getcard() == " G ") {
                    System.out.println("\nYou picked Green!");
                }

                move1(getcard(), getloc1(fullarrayeasy), fullarrayeasy);
                getarray(fullarrayeasy);


            }

            else if(kk == 2) {

                System.out.println("                Candy Land Map           \n");
                String [][] fullarraymedium = MakeArrayMedium();

                System.out.println("\nPick a Card listed Above R,P,Y,B,O,G \n");
                String bbc = scan.next();

                if (bbc.equals("q")) {
                    bb = 2;
                    System.out.println("THANK YOU FOR THE GAME");

                }
                else if (getcard() == " R ") {
                    System.out.println("\nYou picked Red!");
                }
                else if (getcard() == " P ") {
                    System.out.println("\nYou picked Purple!");
                }

                else if (getcard() == " Y ") {
                    System.out.println("\nYou picked Yellow!");
                }

                else if (getcard() == " B ") {
                    System.out.println("\nYou picked Blue!");
                }

                else if (getcard() == " O ") {
                    System.out.println("\nYou picked Orange!");
                }

                else if (getcard() == " G ") {
                    System.out.println("\nYou picked Green!");
                }

                move1(getcard(), getloc1(fullarraymedium), fullarraymedium);
                getarray(fullarraymedium);



            }

            else if (kk == 3) {

                System.out.println("                Candy Land Map           \n");
                String [][] fullarrayhard = MakeArrayHard();

                System.out.println("\nPick a Card listed Above R,P,Y,B,O,G \n");
                String bbc = scan.next();

                if (bbc.equals("q")) {
                    bb = 2;
                    System.out.println("THANK YOU FOR THE GAME");

                }
                else if (getcard() == " R ") {
                    System.out.println("\nYou picked Red!");
                }
                else if (getcard() == " P ") {
                    System.out.println("\nYou picked Purple!");
                }

                else if (getcard() == " Y ") {
                    System.out.println("\nYou picked Yellow!");
                }

                else if (getcard() == " B ") {
                    System.out.println("\nYou picked Blue!");
                }

                else if (getcard() == " O ") {
                    System.out.println("\nYou picked Orange!");
                }

                else if (getcard() == " G ") {
                    System.out.println("\nYou picked Green!");
                }

                move1(getcard(), getloc1(fullarrayhard), fullarrayhard);
                getarray(fullarrayhard);



            }


        }
       
       
        /*System.out.println(getloc1(fullarray)[0][0]);
        System.out.println(getloc1(fullarray)[0][1]);
        move1(getcard(), getloc1(fullarray), fullarray);
        getarray(fullarray);
        System.out.println(" ");*/

       
        /*System.out.println("Enter Number");
        int x = scan.nextInt();
       
        Integer[] Array = MakeArray(x);
        PrintArray(Array);
        EvaluateArray(Array);*/
       
       /* System.out.println("Enter message: ");
        String a = scan.nextLine();
        String[] arry = a.split(" ");
        String all = "b";
        for (int i = 0; i < arry.length; i++) {
           
            all = all.concat(Switch(arry[i]) + "5");
           
        }        
        System.out.println(all.substring(1, all.length()-1));*/
    }

    private class SaveFile {
    }
}