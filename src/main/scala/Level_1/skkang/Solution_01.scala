package Level_1.skkang

import scala.collection.immutable.List
import scala.collection.mutable.MutableList

//모의고사
object Solution_01 {

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

  def solution(answers: Vector[Int]): Vector[Int] = {

    val student1 = List(1, 2, 3, 4, 5)
    val student2 = List(2, 1, 2, 3, 2, 4, 2, 5)
    val student3 = List(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

    val scoreList:MutableList[Int] = MutableList(0,0,0)


    for ( i <- 0 until answers.length) {
      if (answers(i) == student1(i%5) ) {
        scoreList(0) += 1
      }
      if (answers(i) == student2(i%8) ) {
        scoreList(1) += 1
      }
      if (answers(i) == student3(i%10) ) {
        scoreList(2) += 1
      }
    }

    val maxScore = scoreList.max
    var returnLength = 0
    scoreList.foreach( x => if (x == maxScore) {
      returnLength += 1
    })

    val sortStudentList = new Array[Int](returnLength)

    var j = 0
    for ( i <- 0 until scoreList.length) {
      if (scoreList(i) == maxScore) {
        sortStudentList(j) = i+1
        j += 1
      }
    }

    return sortStudentList.toVector

  }
}
