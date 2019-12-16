package Level_1.skkang

//모의고사
object Solution_01 {

//  def main(args: Array[String]): Unit = {
//    val inputAnswers = scala.io.StdIn.readLine()
//    val input = inputAnswers.substring(1, inputAnswers.length()-1)
//    val inputArray = input.split(",")
//
//    //가변길이 입력값때문에 arrayBuffer 선택
//    var inputArrayBuffer = scala.collection.mutable.ArrayBuffer(inputArray: _*)
//
//    for(temp <- inputArray){
//      inputArrayBuffer :+ temp.toInt
//    }
//    var a: String = inputArrayBuffer(0)
//    var b: Int = inputArrayBuffer(0).toInt
//    println(">> inputArrayBuffer: ",inputArrayBuffer)
//    println(">> inputArrayBuffer: ",inputArrayBuffer(0))
//    println(">> inputArrayBuffer: ",inputArrayBuffer(0).toInt)
//    //1. 입력 값 input 을 Vector 로 변경
//    //    solution(inputArrayBuffer.toVector)
//  }

  def main(args: Array[String]): Unit = {
    val answers = scala.io.StdIn.readLine()
  }
  def solution(answers: Vector[Int]): Vector[Int] = {


    println(">> answers: ",answers)

    return Vector[Int]()

  }

  def lengthCheck(answers: Vector[Int]): Int ={
    return answers.length
  }
}
