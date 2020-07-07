/*

Write a function:

class Solution { public int solution(int A, int B, int K); }

that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:

{ i : A ≤ i ≤ B, i mod K = 0 }

For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.

Write an efficient algorithm for the following assumptions:

A and B are integers within the range [0..2,000,000,000];
K is an integer within the range [1..2,000,000,000];
A ≤ B.

*/

class Solution {
    public int solution(int A, int B, int K) {

        int addition = (A == 0 ? 1 : 0);
        
        int max = B / K;
        if (max < 0) {
            max = 0;
        }
        int min = A / K;
        if (A % K == 0) {
            min--;
        }
        if (min < 0) {
            min = 0;
        }
        return max - min + addition;
    }
}
