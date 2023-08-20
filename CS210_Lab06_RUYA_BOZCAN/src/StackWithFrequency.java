// RUYA BOZCAN
// 200201044
// CS210
// LAB 06
// SOLUTIONS
// QUESTION 03


import java.util.*;

public class StackWithFrequency
{
    private final Map<Integer, Integer> freqMap;
    private final Map<Integer, Stack<Integer>> groupMap;
    private int maxFreq;

    public StackWithFrequency()
    {
        freqMap = new HashMap<>();
        groupMap = new HashMap<>();
        maxFreq = 0;
    }

    public void push(int val)
    {
        int freq = freqMap.getOrDefault(val, 0) + 1;
        freqMap.put(val, freq);
        maxFreq = Math.max(maxFreq, freq);
        groupMap.computeIfAbsent(freq, k -> new Stack<>()).push(val);
    }

    public int pop()
    {
        Stack<Integer> group = groupMap.get(maxFreq);
        int val = group.pop();
        freqMap.put(val, maxFreq - 1);
        if (group.isEmpty())
        {
            groupMap.remove(maxFreq);
            maxFreq--;
        }
        return val;
    }
}
// RUYA BOZCAN
// 200201044
// CS210
// LAB 06
// SOLUTIONS
// QUESTION 03

