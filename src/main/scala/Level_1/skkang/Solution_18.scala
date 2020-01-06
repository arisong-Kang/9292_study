package Level_1.skkang

import scala.collection.mutable.ArrayBuffer

//자연수 뒤집어 배열로 만들기
/**
  * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
  * 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
  *
  * [제한 조건]
  * n은 10,000,000,000이하인 자연수입니다.
  *
  * [입출력 예]
  *   n     	return
  * 12345	 [5,4,3,2,1]
  */
object Solution_18 {
  def main(args: Array[String]): Unit = {
    val input = scala.io.StdIn.readLine()

    solution(input.toLong)

  }
  def solution(n: Long): Vector[Int] = {
    var result = new ArrayBuffer[Int]()

    n.toString.foreach( x => result += x.getNumericValue)

    println(result.reverse.toVector)
    return result.reverse.toVector
  }
  def solution2(n: Long): Vector[Int] = {

    return n.toString.split("").map(_.toInt).reverse.toVector
  }
}
