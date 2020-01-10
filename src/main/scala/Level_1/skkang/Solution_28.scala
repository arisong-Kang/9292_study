package Level_1.skkang

import scala.collection.mutable.ArrayBuffer

//행렬의 덧샘
/**
  * 행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다.
  * 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
  *
  * [제한 조건]
  * 행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.
  *
  * [입출력 예]
  *     arr1	          arr2	          return
  * [[1,2],[2,3]]	  [[3,4],[5,6]]	   [[4,6],[7,9]]
  *   [[1],[2]]       [[3],[4]]       	[[4],[6]]
  */
object Solution_28 {
  def main(args: Array[String]): Unit = {
    val input1 = scala.io.StdIn.readLine()                    //  String: "[[1,2],[2,3]]"
    val input1Temp = input1.substring(2, input1.length()-2)   //  String: "1,2],[2,3"
    val inputArrString1 = input1Temp.split("\\],\\[")         //  List: ["1,2", "2,3"]

    val input2 = scala.io.StdIn.readLine()
    val input2Temp = input2.substring(2, input2.length()-2)
    val inputArrString2 = input2Temp.split("\\],\\[")

    var arr1 = new ArrayBuffer[Vector[Int]]()
    inputArrString1.foreach{ x =>
      var tempVector = new ArrayBuffer[Int]
      x.split(",").foreach( y => tempVector += y.toInt )
      arr1 += tempVector.toVector
    }
    var arr2 = new ArrayBuffer[Vector[Int]]()
    inputArrString2.foreach{ x =>
      var tempVector = new ArrayBuffer[Int]
      x.split(",").foreach( y => tempVector += y.toInt )
      arr2 += tempVector.toVector
    }

    solution(arr1.toVector, arr2.toVector)

  }
  def solution(arr1: Vector[Vector[Int]], arr2: Vector[Vector[Int]]): Vector[Vector[Int]] = {

    var result = new ArrayBuffer[Vector[Int]]()

    for(x <- 0 until arr1.length) {
      var tempVector = new ArrayBuffer[Int]()
      for (y <- 0 until arr1(x).length ) tempVector += arr1(x)(y) + arr2(x)(y)
      result+=tempVector.toVector
    }

    return result.toVector
  }
}
