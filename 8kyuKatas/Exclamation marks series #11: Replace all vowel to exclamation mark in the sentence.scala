/*
Description:
Replace all vowel to exclamation mark in the sentence. aeiouAEIOU is vowel.
Examples
"Hi!" --> "H!!"
"!Hi! Hi!" --> "!H!! H!!"
"aeiou" --> "!!!!!"
"ABCDE" --> "!BCD!"
*/

def replace(s: String): String =
  s.replaceAll("[aeiouAEIOU]", "!")
