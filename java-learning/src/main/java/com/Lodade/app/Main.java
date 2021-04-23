package com.Lodade.app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.function.Consumer;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    static int doubleMe(int input){
        return input * 2;
    }
    static double doubleMe(double input){
        return input * 2;
    }
    static int addUp(int num){
        if(num == 0){
            return num;
        }
        int hold = num + addUp(num -  1);
        return hold; 
    }
    public static void main(String[] args){
        //Wooh I'm a comment
        System.out.println("Hello World!");
        /*
        I exist
        in multiple lines
        of existence
        :O
        */

        //Data Types
        String s = "fack I'm a string";
        boolean b = false;
        int i = 69;
        float f = 420.69f;
        char c = 'f';
        System.out.println(s + b + c + f + i);
        byte by = 59;
        short sh = 6;
        long l = 6969696969696969L;
        double d = 42069.96024d;
        System.out.println( by + l + sh + d);
        char uni = 37;
        System.out.println(uni);
        System.out.println();


        //Type Casting
        int test1 = 9999;
        double test2 = test1;
        System.out.println(test2);
        int test3 = (int) test2;
        System.out.println(test3);
        System.out.println();


        //Operators
        double start = 0d;
        start = start + 37;
        start = start - 20;
        start = start * 3;
        start =  start / 2;
        start++;
        start--;
        System.out.println(start);
        System.out.println();


        //Strings 
        String here = "This shit sucks ;(";
        System.out.println(here.length());
        System.out.println(here.toLowerCase());
        System.out.println(here.toUpperCase());
        System.out.println(here.indexOf("shit"));
        System.out.println(here + " just kidding xD");
        System.out.println(here + " for legal reasons, that was a \"joke\"");
        System.out.println();


        //Math
        double resultNum = 25;
        double secondNum = 37;
        System.out.println(Math.min(resultNum, secondNum));
        System.out.println(Math.max(resultNum, secondNum));
        System.out.println(Math.sqrt(resultNum));
        System.out.println((int) (Math.random() * 101));
        System.out.println();


        //Booleans
        boolean testing = true;
        boolean testing2 = false;
        System.out.println(testing == testing2);
        System.out.println(resultNum < secondNum);

        //If Else
        if(Math.sqrt(25) == 5){
            System.out.println("I am root :P");
        }
        String output = (testing != testing2) ? "I am right" : "Rip";
        System.out.println(output);
        System.out.println();


        //Switch Case
        int casing = 3;
        switch(casing){
            case 1:

                break;
            case 2:

                break;
            case 3:
                System.out.println("I am the only survivor :O");
                break;
        }
        System.out.println();


        //While Loops
        int counter = 0;
        while(counter < 10){
            System.out.println("I died " + counter + " times :)");
            counter++;
        }
        System.out.println();


        //For Loops
        for(int q = 0;q < 4;q++){
            System.out.println("I have been stuck here for " + q + " years");
        }
        String[] strings =  {"Fee","Fie","Foe","Fum"};
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println();


        //Break Continue
        for(int p = 0;p < 6;p++){
            if(p == 2){
                continue;
            }else if(p == 5){
                break;
            }
            System.out.println(p);
        }
        System.out.println();


        //Arrays
        int[] numbers = new int[6];
        for (int j : numbers) {
            System.out.print(j + " ");
        }
        numbers[2] = 99;
        for (int j : numbers) {
            System.out.print(j + " ");
        }
        System.out.println();

        //Methods
        System.out.println(doubleMe(88));
        System.out.println(doubleMe(66.6));
        System.out.println(addUp(10));
        System.out.println();


        //Classes
        Second second = new Second(30);
        Second secondTheSecond = new Second(27);
        second.changeTestMe(69);
        System.out.println(second.showTestMe());
        System.out.println(secondTheSecond.showTestMe());
        System.out.println(second.doubleTest());
        System.out.println();

        //Packages
        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a name!");
        String input = scan.nextLine();
        System.out.println("You can now call me " + input);
        scan.close();
        */

        //Inheritance
        Third third = new Third(11, 22);
        System.out.println(third.grabUseMe());
        third.changeTestMe(69);
        System.out.println(third.showTestMe());
        System.out.println();
    
        //Polymorphism
        ThirdPoly thirdPoly = new ThirdPoly(25);
        System.out.println(thirdPoly.showTestMe());
        System.out.println("Hmm that isn't right");
        System.out.println();

        //Inner Classes
        Second newSecond = new Second(89);
        newSecond.changeTestMe(70);
        System.out.println(newSecond.showTestMe());
        System.out.println();

        //Enum
        Second anotherSecond = new Second(70);
        anotherSecond.checkMe();
        anotherSecond.showMyStates();
        System.out.println();

        //Date
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String formattedTime = time.format(format);
        System.out.println(formattedTime);

        //Arraylist
        ArrayList<Integer>  listOfNum = new ArrayList<Integer>();
        listOfNum.add(47);
        listOfNum.add(39);
        listOfNum.add(20);
        listOfNum.add(99);
        System.out.println(listOfNum.get(3));
        listOfNum.set(2, 609);
        for(int j = 0;j < listOfNum.size();j++){
            System.out.println(listOfNum.get(j));
        }
        Collections.sort(listOfNum);
        for(int j = 0;j < listOfNum.size();j++){
            System.out.println(listOfNum.get(j));
        }
        System.out.println();

        //LinkedList
        LinkedList<Integer> secondListOfNum = new LinkedList<Integer>();
        secondListOfNum.addFirst(28);
        secondListOfNum.addLast(10);
        secondListOfNum.addFirst(36);
        for (Integer integer : secondListOfNum) {
            System.out.println(integer);
        }
        System.out.println();

        //HashMap
        HashMap<Integer, String> aHash = new HashMap<Integer, String>();
        aHash.put(1, "Canada");
        aHash.put(27, "US");
        aHash.put(2, "Germany");
        System.out.println(aHash.get(2));
        for (int piece : aHash.keySet()) {
           System.out.println(aHash.get(piece)); 
        }
        System.out.println();

        //HashSet
        HashSet<Integer> aSet = new HashSet<Integer>();
        aSet.add(420);
        aSet.add(420);
        aSet.add(365);
        for (Integer integer : aSet) {
            System.out.println(integer);
        }
        System.out.println();

        //Iterator
        Iterator<Integer> it = listOfNum.iterator();
        while(it.hasNext()){
            int i2 = it.next();
            if(i2 < 40){
                it.remove();
            }
        }       
        for (Integer integer : listOfNum) {
            System.out.println(integer);
        }
        System.out.println();
    
        //Wrapper Classes
        Integer i3 = 34590;
        System.out.println(i3.toString());
        System.out.println();

        //Exceptions
        int[] tester = new int[6];
        try {
            System.out.println(tester[6]);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("We're done here");
        }
        System.out.println();

        //Regex
        Pattern pattern = Pattern.compile("boi",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("You can't catch me boi");
        System.out.println(matcher.find());
        System.out.println();

        //Threads
        Second anotherOne = new Second(30);
        Thread hereWeGo = new Thread(anotherOne);
        hereWeGo.start();
        while(hereWeGo.isAlive()){
            
        }
        System.out.println("Main");
        System.out.println();

        //Lambdas
        listOfNum.forEach((n) -> {System.out.println(n);});
        Consumer<Integer> doIt = (n) -> {System.out.println(n);};
        listOfNum.forEach(doIt);
        System.out.println();

        //Files 
        try {
            File file = new File("I am a Test.txt");
            if(file.createNewFile()){
                System.out.println("File Successfully created");
            }else {
                System.out.println("File already exists");
            }
            FileWriter writer = new FileWriter("I am a Test.txt");
            writer.write("Damn this is nice <3");
            writer.close();
            Scanner fileReader = new Scanner(file);
            while(fileReader.hasNextLine()){
                System.out.println(fileReader.nextLine());
            }
            fileReader.close();
            if(file.exists()){
                System.out.println("Length: " + file.length());
                System.out.println("Path: " + file.getAbsolutePath());
            }else{
                System.out.println("Damn I don't exist :(");
            }
            if(file.delete()){
                System.out.println("Oh no the test was erased ;(");
            }else{
                System.out.println("file was not erased");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}