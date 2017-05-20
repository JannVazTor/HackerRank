using System;
using System.Collections.Generic;
using System.Text;

/* Source: https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks */

namespace Queues_A_Tale_of_Two_Stacks
{
    class Program
    {
        static void Main(string[] args)
        {
            var q = Convert.ToInt32(Console.ReadLine());

            var queue = new Queue<int>();
            var queryThree = new StringBuilder();

            for (int i = 0; i < q; i++)
            {
                var query = Console.ReadLine().Split(' ');
                switch (Convert.ToInt32(query[0]))
                {
                    case 1:
                        queue.Enqueue(Convert.ToInt32(query[1]));
                        break;
                    case 2:
                        queue.Dequeue();
                        break;
                    case 3:
                        queryThree.Append(queue.Peek().ToString() + '\n');
                        break;
                    default:
                        break;
                }
            }
            Console.WriteLine(queryThree.ToString());
            Console.ReadKey();
        }
    }
}
