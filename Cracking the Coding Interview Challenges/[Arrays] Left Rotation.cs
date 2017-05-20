using System;
using System.Collections.Generic;

/* Source: https://www.hackerrank.com/challenges/ctci-array-left-rotation */

namespace Arrays_Left_Rotation
{
    class Program
    {
        static void Main(String[] args)
        {
            string[] tokens_n = Console.ReadLine().Split(' ');
            int n = Convert.ToInt32(tokens_n[0]);
            int k = Convert.ToInt32(tokens_n[1]);
            string[] a_temp = Console.ReadLine().Split(' ');
            int[] a = Array.ConvertAll(a_temp, Int32.Parse);
            var stack = new Queue<int>(a);
            for (int i = 0; i < k; i++)
            {
                var temp = stack.Dequeue();
                stack.Enqueue(temp);
            }
            var result = stack.ToArray();
            for (int i = 0; i < result.Length; i++)
            {
                Console.Write(result[i] + " ");
            }
            Console.ReadKey();
        }
    }
}
