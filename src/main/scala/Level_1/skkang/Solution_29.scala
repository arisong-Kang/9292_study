package Level_1.skkang

import scala.collection.mutable.ArrayBuffer

//x만큼 간격이 있는 n개의 숫자
/**
  * 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
  * 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
  *
  * [제한 조건]
  * x는 -10000000 이상, 10000000 이하인 정수입니다.
  * n은 1000 이하인 자연수입니다.
  *
  * [입출력 예]
  *  x	  n	   answer
  *  2	  5	   [2,4,6,8,10]
  *  4	  3	   [4,8,12]
  * -4	  2    [-4, -8]
  *
  * x= 10000000, n =1000
  */
object Solution_29 {
  def main(args: Array[String]): Unit = {
    val inputX = scala.io.StdIn.readLine()
    val inputN = scala.io.StdIn.readLine()

    solution(inputX.toInt, inputN.toInt)

  }
  def solution(x: Int, n: Int): Vector[Long] = {
    var result = new ArrayBuffer[Long]()
    for(i<-1 until n+1) result += (x.toLong * i.toLong).toLong
    return result.toVector
  }

  def solution2(x: Int, n: Int): Vector[Long] = {
    if (-10000000 <= x && x <= 10000000) {
      var result = new ArrayBuffer[Long]()
      for(i<-1 until n+1) result += (x.toLong * i.toLong).toLong
      return result.toVector
    } else {
      return Vector[Long]()
    }
  }
}
