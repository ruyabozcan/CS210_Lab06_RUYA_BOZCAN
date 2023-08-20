// RUYA BOZCAN
// 200201044
// CS210
// LAB 06
// SOLUTIONS
// QUESTION 02

import java.util.*;

public class NonRecursive
{

    public static List<List<Integer>> getPermutations(int n)
    {
        List<List<Integer>> permutations = new ArrayList<>();
        Stack<List<Integer>> stack = new Stack<>();
        stack.push(new ArrayList<>());

        while (!stack.isEmpty())
        {
            List<Integer> permutation = stack.pop();
            
            if (permutation.size() == n)
            {
                permutations.add(permutation);
            }

            else
            {
                for (int i = 1; i <= n; i++)
                {
                    if (!permutation.contains(i))
                    {
                        List<Integer> newPermutation = new ArrayList<>(permutation);
                        newPermutation.add(i);
                        stack.push(newPermutation);
                    }
                }
            }
        }

        return permutations;
    }

    public static void main(String[] args)
    {
        List<List<Integer>> permutations = getPermutations(3);
        for (List<Integer> permutation : permutations)
        {
            System.out.println(permutation);
        }
    }
}
// RUYA BOZCAN
// 200201044
// CS210
// LAB 06
// SOLUTIONS
// QUESTION 02
