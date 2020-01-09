package Level_1.skkang

//평균 구하기
/**
  * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
  *
  * [제한사항]
  * arr은 길이 1 이상, 100 이하인 배열입니다.
  * arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
  *
  * [입출력 예]
  *    arr	     return
  * [1,2,3,4]    	2.5
  *   [5,5]       	5
  */
object Solution_25 {
  def main(args: Array[String]): Unit = {
    val inputAnswers = scala.io.StdIn.readLine()
    val input = inputAnswers.substring(1, inputAnswers.length()-1)
    val inputArray = input.split(",")

    //가변길이 입력값때문에 arrayBuffer 선택
    //var inputArrayBuffer = scala.collection.mutable.ArrayBuffer(inputArray: _*)
    val inputMutableArray = new Array[Int](inputArray.length)
    var i = 0

    inputArray.foreach{ x =>
      inputMutableArray(i) = x.toInt
      i = i+1
    }
    //1. 입력 값 input 을 Vector 로 변경
    solution(inputMutableArray.toVector)

  }
  def solution(arr: Vector[Int]): Double = {
    return arr.reduce(_+_).toDouble/arr.size.toDouble
  }
}
