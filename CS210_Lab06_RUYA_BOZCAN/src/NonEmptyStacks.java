// RUYA BOZCAN
// 200201044
// CS210
// LAB 06
// SOLUTIONS
// QUESTION 01

import java.util.Stack;

public class NonEmptyStacks
{

    public static void main(String[] args)
    {

        Stack<Integer> R = new Stack<>();
        Stack<Integer> S = new Stack<>();
        Stack<Integer> T = new Stack<>();

        R.push(1);
        R.push(2);
        R.push(3);
        S.push(4);
        S.push(5);
        T.push(6);
        T.push(7);
        T.push(8);
        T.push(9);

        while (!S.isEmpty())
        {
            T.push(S.pop());
        }

        while (!R.isEmpty())
        {
            S.push(R.pop());
        }

        while (!T.isEmpty())
        {
            S.push(T.pop());
        }

        System.out.println("R: " + R);
        System.out.println("S: " + S);
    }
}
// RUYA BOZCAN
// 200201044
// CS210
// LAB 06
// SOLUTIONS
// QUESTION 01
