using System;
using System.Collections.Generic;
using System.Text;

/* Source: https://www.hackerrank.com/challenges/ctci-balanced-brackets */

namespace Stack_Balanced_Brackets
{
    class Program
    {
        public static void Main(String[] args)
        {
            Program p = new Program();
            int t = Convert.ToInt32(Console.ReadLine());
            var result = new StringBuilder();
            for (int a0 = 0; a0 < t; a0++)
            {
                String expression = Console.ReadLine();
                result.Append(((p.isBalanced(expression)) ? "YES" : "NO") + '\n');
            }
            Console.Write(result.ToString());
            Console.ReadKey();
        }

        public bool isBalanced(string expression)
        {
            var expressionArray = expression.ToCharArray();
            var stack = new Stack<char>();

            for (int i = 0; i < expressionArray.Length; i++)
            {
                if (isClosedBracket(expressionArray[i])) 
                {
                    if (stack.Count == 0 || !GetClosingBrackets(stack.Peek()).Equals(expressionArray[i])) return false;
                    stack.Pop();
                    continue;
                }
                stack.Push(expressionArray[i]);
            }
            return stack.Count == 0;
        }

        public bool isClosedBracket(char bracket)
        {
            return bracket.Equals(')') || bracket.Equals(']') || bracket.Equals('}');
        }

        public char GetClosingBrackets(char bracket)
        {
            switch (bracket)
            {
                case '(': return ')';
                case '[': return ']';
                case '{': return '}';
                default: return ' ';
            }
        }
    }
}
