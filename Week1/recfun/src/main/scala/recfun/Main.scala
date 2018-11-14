package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }

   print(countChange(4, List(1,2)))
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if(c == 0 || r == c) 1 else pascal(c-1, r-1) + pascal(c, r-1)
    }

  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def loop(count: Int, filteredChars: => List[Char] ): Int = {
        if(filteredChars.nonEmpty && count >= 0) loop(count+checkChar(filteredChars.head), filteredChars.tail) else count
      }

      def checkChar(char: Char): Int = {
        if(char == '(') 1 else -1
      }

      loop(0, chars.filter(char => char == '(' || char == ')')) == 0

    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      if(money == 0) 1
      else if (money > 0 && coins.nonEmpty)
        countChange(money - coins.head, coins) + countChange(money, coins.tail)
      else 0
    }
  }
