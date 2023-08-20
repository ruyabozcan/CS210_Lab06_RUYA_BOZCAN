// RUYA BOZCAN
// 200201044
// CS210
// LAB 06
// SOLUTIONS
// QUESTION 04

public class Stars
{
    public static String removeStars(String s)
    {
        int n = s.length();
        int lastNonStar = -1;
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < n; i++)
        {
            if (s.charAt(i) == '*')
            {
                if (lastNonStar != -1)
                {
                    res.delete(lastNonStar + 1, res.length());
                }
            }

            else
            {
                lastNonStar = i;
                res.append(s.charAt(i));
            }
        }

        return res.toString();
    }

    public static void main(String[] args)
    {
        String s = "leet**cod*e";
        String res = removeStars(s);
        System.out.println(res);
    }
}

// RUYA BOZCAN
// 200201044
// CS210
// LAB 06
// SOLUTIONS
// QUESTION 04


