package Level_1.skkang

//두 정수 사이의 합
object Solution_07 {
  def main(args: Array[String]): Unit = {

    val inputNumber1 = scala.io.StdIn.readLine()
    val a = inputNumber1.toInt

    val inputNumber2 = scala.io.StdIn.readLine()
    val b = inputNumber2.toInt

    solution(a, b)

  }
  def solution(a: Int, b: Int): Long = {
    var resultSum:Long = 0

    if (a < b) {
      for ( i <- a until b+1) {
        resultSum += i
      }
    } else if(a == b) {
      resultSum = a
    } else {
      for ( i <- b until a+1) {
        resultSum += i
      }
    }
    return resultSum
  }

  def solution2(a: Int, b: Int): Long = {
    return (a + b) * (Math.abs(a-b) + 1) / 2
  }

}
