package Level_1.cresencia

import scala.collection.mutable

/**
문제 설명
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

제한 조건
n은 10,000,000,000이하인 자연수입니다.
입출력 예
n	return
12345	[5,4,3,2,1]  */
object ReverseNumToArray_18 {
  def main(args: Array[String]): Unit = {

    val n = 123

    println(solution(n))
  }

  def solution(n: Long): Vector[Int] = {
    var result = mutable.ArrayBuffer[Int]()

    n.toString.foreach(num => {
      result += num.getNumericValue
    })

    return result.reverse.toVector
  }

  def solution2(n: Long): Vector[Int] ={
    n.toString.split("").map(_.toInt).reverse.toVector
  }
}
