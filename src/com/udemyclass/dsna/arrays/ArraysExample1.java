package com.udemyclass.dsna.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysExample1 {

    public static void main(String[] args) {

        /*
        Dynamic arrays in Java are implemented using ArrayList
         */

        List characters = new ArrayList(
                Arrays.asList('a','b','c','d')
        );
        //4*4 = 16 bytes of storage

        System.out.println(characters.get(2));

        //Push to array - Add something at the end of the array
        characters.add('e'); // O(1)

        System.out.println(characters);

        //Size() - O(1)
        //remove()
        characters.remove(characters.size()-1);

        System.out.println(characters);

        characters.remove(characters.size()-1);

        System.out.println(characters);

        characters.add(2,Arrays.asList("zys","sd"));

        System.out.println(characters);

        //Will throw Index out of Bounds exception
        //System.out.println(characters.get(122));

        //Checking if we can
        int i =1;
        Object c = i;

        System.out.println(c);





    }



}
