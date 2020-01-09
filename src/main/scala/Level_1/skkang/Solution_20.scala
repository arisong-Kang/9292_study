package Level_1.skkang

//정수 제곱근 판별
/**
  * 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
  * n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
  *
  * [제한 사항]
  * n은 1이상, 50000000000000 이하인 양의 정수입니다.
  *
  * [입출력 예]
  *  n	 return
  * 121	  144
  *  3	  -1
  *
  * [입출력 예 설명]
  * 입출력 예#1
  * 121은 양의 정수 11의 제곱이므로, (11+1)를 제곱한 144를 리턴합니다.
  * 입출력 예#2
  * 3은 양의 정수의 제곱이 아니므로, -1을 리턴합니다.
  */
object Solution_20 {
  def main(args: Array[String]): Unit = {
    val input = scala.io.StdIn.readLine()

    solution(input.toLong)

  }
  def solution(n: Long): Long = {
    import scala.math.sqrt

    val x: Double = sqrt(n)

    if (x.isValidInt) return (x+1).toLong*(x+1).toLong else return -1
  }
  def solution2(n: Long): Long = {
    import scala.math.sqrt
    import scala.math.pow

    val x: Double = sqrt(n)

    if (x.isValidInt) return pow((x+1), 2).toLong else return -1
  }
}
