/*
Complete the function which returns the weekday according to the input number:
1 returns "Sunday"
2 returns "Monday"
3 returns "Tuesday"
4 returns "Wednesday"
5 returns "Thursday"
6 returns "Friday"
7 returns "Saturday"
Otherwise returns "Wrong, please enter a number between 1 and 7"
*/

def whatDay(num: Int): String = 
  num match {
    case 1 => "Sunday"
    case 2 => "Monday"
    case 3 => "Tuesday"
    case 4 => "Wednesday"
    case 5 => "Thursday"
    case 6 => "Friday"
    case 7 => "Saturday"
    case _ => "Wrong, please enter a number between 1 and 7"
  }
