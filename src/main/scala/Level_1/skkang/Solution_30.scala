package Level_1.skkang

import scala.collection.mutable.ArrayBuffer

//직사각형 별찍기
/**
  * 이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
  * 별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.
  *
  * [제한 조건]
  * n과 m은 각각 1000 이하인 자연수입니다.
  *
  * [예시]
  * 입력
  * 5 3
  *    출력
  *   *****
  *   *****
  *   *****
  */
object Solution_30 {
  import scala.io.StdIn.readLine

  def main(args: Array[String]) {
    val n = readLine().split(" ")
    val (a, b) = (n(0).toInt, n(1).toInt)
    solution2(a.toInt,b.toInt)
  }

  def solution(n: Int, m: Int) = {
    var column = new ArrayBuffer[String]()

    for (i<-0 until n) {
      column += "*"
    }
    for (j<-0 until m) {
      println(column.mkString(""))
    }
  }

  def solution2(n: Int, m: Int) = {
    (0 until m).foreach(i => println("*"*n))
  }
}
