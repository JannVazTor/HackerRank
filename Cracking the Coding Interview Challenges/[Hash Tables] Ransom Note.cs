using System;
using System.Collections.Generic;
using System.Linq;

/* Source: https://www.hackerrank.com/challenges/ctci-ransom-note */

namespace Hash_Tables_Ransom_Note
{
    class Solution
    {
        public Dictionary<string, int> magazine;
        public Dictionary<string, int> ransom;

        public Solution(string[] magazine, string[] ransom) {
            this.magazine = new Dictionary<string, int>();
            this.ransom = new Dictionary<string, int>();

            for (int i = 0; i < magazine.Length; i++) {
                if (!this.magazine.ContainsKey(magazine[i])) this.magazine.Add(magazine[i], 1);
                else this.magazine[magazine[i]] += 1;
            }

            for (int i = 0; i < ransom.Length; i++)
            {
                if (!this.ransom.ContainsKey(ransom[i])) this.ransom.Add(ransom[i], 1);
                else this.ransom[ransom[i]] += 1;
            }
        }

        public bool Solve()
        {
            foreach (string r_key in ransom.Keys.ToList())
            {
                while (ransom[r_key] != 0)
                {
                    if (!magazine.ContainsKey(r_key)) return false;
                    if (magazine[r_key] == 0 && ransom[r_key] > 0) return false;
                    magazine[r_key] -= 1;
                    ransom[r_key] -= 1;
                }
            }
            return true;
        }

        static void Main(String[] args)
        {
            string[] tokens_m = Console.ReadLine().Split(' ');
            int m = Convert.ToInt32(tokens_m[0]);
            int n = Convert.ToInt32(tokens_m[1]);
            string[] magazine = Console.ReadLine().Split(' ');
            string[] ransom = Console.ReadLine().Split(' ');
            Solution s = new Solution(magazine, ransom);
            Console.Write(s.Solve() ? "Yes" : "No");
            Console.ReadKey();
        }
    }
}
