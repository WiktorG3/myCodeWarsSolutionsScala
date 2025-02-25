/*
Your Job
Find the sum of all multiples of n below m
Keep in Mind
n and m are natural numbers (positive integers)
m is excluded from the multiples
Examples
sumMul(2, 9)   // => 2 + 4 + 6 + 8 = Some(20)
sumMul(3, 13)  // => 3 + 6 + 9 + 12 = Some(30)
sumMul(4, 123) // => 4 + 8 + 12 + ... = Some(1860)
sumMul(4, -7)  // => None (m must be greater than 0)
sumMul(-4, 7)  // => None (n must be greater than 0)
sumMul(0, 2)   // => None
sumMul(2, 0)   // => None
*/

def sumMul(n: Int, m: Int): Option[Int] = {
  var current = n
  var sum = 0;
  
  if(n <= 0 || m <= 0) None;
  else {
    while (current < m) {
      sum += current
      current += n
    }
    Some(sum)
  }
}
