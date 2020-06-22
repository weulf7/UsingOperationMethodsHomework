package org.example;

public class Calculator {



    public void start(){

    }

    public int returnSum(int number1,int number2){

        int sumOfTheNumbers= number1 +number2;
        System.out.println("The sum of the numbers is = " +sumOfTheNumbers);
        return sumOfTheNumbers;

    }
    public int returnMultiple(int number1,int number2){
        int multipleNumber = number1 * number2;
        System.out.println("First number multiplied with second number is: " +multipleNumber);
        return  multipleNumber;
    }
    public double returnDivide(int number1,int number2){
        double dividedResult = number1 / number2;
        System.out.println("First number divided by second number is : " +dividedResult);
        return dividedResult;
    }
    public int moduloNumber(int number1,int number2){
        int numberModulo = number1 % number2;
        System.out.println("First number modulo second number is : " +numberModulo);
        return numberModulo;
    }
}
