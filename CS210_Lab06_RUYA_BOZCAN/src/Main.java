// RUYA BOZCAN
// 200201044
// CS210
// LAB 06
// SOLUTIONS
// QUESTION 03

public class Main
{
    public static void main(String[] args)
    {
        StackWithFrequency stack = new StackWithFrequency();
        stack.push(5);
        stack.push(7);
        stack.push(5);
        stack.push(7);
        stack.push(4);
        stack.push(5);

        int val1 = stack.pop();
        int val2 = stack.pop();
        int val3 = stack.pop();
        int val4 = stack.pop();

        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
    }
}

// RUYA BOZCAN
// 200201044
// CS210
// LAB 06
// SOLUTIONS
// QUESTION 03
