package com.wellztech;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        //csv Comma seperated values.

        String fileName1 = "places.csv";
        File file1 = new File(fileName1);
        String[] datas;

        try {

            Scanner inputStream = new Scanner(file1);
            while (inputStream.hasNext()){

                String data = inputStream.nextLine();
                System.out.println(data);


            }

            inputStream.close();

        } catch (FileNotFoundException e){

            e.printStackTrace();

        }




    }
}