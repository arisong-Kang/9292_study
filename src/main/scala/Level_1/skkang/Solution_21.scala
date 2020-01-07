package Level_1.skkang

//제일 작은 수 제거하기
/**
  * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
  * 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
  * 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
  *
  * [제한 조건]
  * arr은 길이 1 이상인 배열입니다.
  * 인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
  *
  * [입출력 예]
  *    arr	    return
  * [4,3,2,1]	 [4,3,2]
  *   [10]	    [-1]
  */
object Solution_21 {
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
  def solution(arr: Vector[Int]): Vector[Int] = {

    var target = arr(0)

    arr.foreach{ x =>  if ( x <= target) { target = x  } }

    if (arr.length == 1) return Vector(-1) else  return arr.filter(_ != target)
  }
  def solution2(arr: Vector[Int]): Vector[Int] = {
    val ans = arr.diff(Seq(arr.min))

    if (ans.length == 0) return Vector(-1) else return ans
  }
}
