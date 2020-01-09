package Level_1.skkang

import scala.collection.mutable.ArrayBuffer

//정수 내림차순으로 배치하기
/**
  * 함수 solution은 정수 n을 매개변수로 입력받습니다.
  * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
  * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
  *
  * [제한 조건]
  * n은 1이상 8000000000 이하인 자연수입니다.
  *
  * [입출력 예]
  *    n  	return
  * 118372	873211
  */
object Solution_19 {
  def main(args: Array[String]): Unit = {
    val input = scala.io.StdIn.readLine()

    solution(input.toLong)

  }
  def solution(n: Long): Long = {

    var result = ""
    n.toString.toList.sortWith( (s, t) => s > t ).foreach(x => result += x.getNumericValue)

    return result.toLong
  }
  def solution2(n: Long): Long = {

    return n.toString.split("").sortWith(_ > _).mkString("").toLong
  }
}
