package com.company;

public class Main {
//TASK 1 MAIN
    public static void main(String[] args) {
	// write your code here
        try{
            TestException exceptiontest = new TestException();
            exceptiontest.genExceptionEmma();

        }
        catch(NullPointerException ex){
            ex.printStackTrace();
            System.out.println( ex);
            ex.getMessage();
        }
    }
}
//TASK 1 AND TASK 2
class TestException {
    public void genExceptionEmma() {
        String donkorEmma = null;
        System.out.println( "print exceptionnull");
    }
    public double arithmeticException(int a, int b){
        return a + b;
    }
    public void indexOutArray(){
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i <= nums.length; i++){
            System.out.println( "The arrays are " + nums[i]);
        }
    }
}


class TaskTwoMain {
    public static void main(String[] args){

        try {
            TestException ts = new TestException();
            System.out.println(ts.arithmeticException(34, 34));
            ts.indexOutArray();
        }
        catch(ArithmeticException e){
            System.out.println( "This is an arithmetic exception");
            System.out.println( e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index is bound of array");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println( "Successfully done");
        }
    }
}