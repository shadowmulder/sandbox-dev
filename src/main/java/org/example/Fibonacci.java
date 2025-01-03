package org.example;

public class Fibonacci {

    public static void main(String[] args) {
        Fibonacci main = new Fibonacci();
        System.out.println(main.run(0,1, 20));

        System.out.println(main.run2(6));
    }

    public int run(int i, int j, int counter) {
        System.out.println("counter: "+counter+" - i: "+i+" - j: "+j);

        if (i == 0 && j == 0){
            return 0;
        } else if (counter == 0) {
            return i;
        }

        return run(j, i+j, counter-1);
    }

    public int run2(int n)  {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return run2(n - 1) + run2(n - 2);
    }

}