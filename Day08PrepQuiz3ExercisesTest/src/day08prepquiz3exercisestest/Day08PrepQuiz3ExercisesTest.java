/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day08prepquiz3exercisestest;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 15144
 */
public class Day08PrepQuiz3ExercisesTest {

    public static void main(String[] args) {
        //6.2

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while (true) {
            System.out.println("Enter a number, 0 to stop: ");
            int value = input.nextInt();
            if (value == 0) {
                break;
            }
            numbers.add(value);
        }
        
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));    
        }

    }

}
