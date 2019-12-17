package Level_1.cresencia

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

//모의고사
object mouigosa {

  def main(args: Array[String]): Unit = {

    val test:Vector[Int] = Vector(4,4,4)

    println(solution(test))
  }

  def solution(answers: Vector[Int]): Vector[Int] = {
    val supoga1_pattern = Array(1,2,3,4,5) // 5
    val supoga2_pattern = Array(2,1,2,3,2,4,2,5) // 8
    val supoga3_pattern = Array(3,3,1,1,2,2,4,4,5,5) // 10

    var supoga1 = 0
    var supoga2 = 0
    var supoga3 = 0

    for(idx <- 0 until answers.length) {
      val answer = answers(idx)

      if( answer == supoga1_pattern(idx % 5) ) { supoga1 = supoga1.+(1) }
      if( answer == supoga2_pattern(idx % 8) ) { supoga2 = supoga2.+(1) }
      if( answer == supoga3_pattern(idx % 10) ) { supoga3 = supoga3.+(1) }
    }

    val scoreList = if (supoga1 > 0 || supoga2 > 0 || supoga3 > 0) {
       mutable.MutableList((1, supoga1), (2, supoga2), (3, supoga3)).filter(_._2 > 0).sortWith(_._2 > _._2).sortBy(_._1)(Ordering[Int])
    } else {
       mutable.MutableList((1, supoga1), (2, supoga2), (3, supoga3)).sortWith(_._2 > _._2).sortBy(_._1)(Ordering[Int])
    }

    var personArray:ArrayBuffer[Int] = mutable.ArrayBuffer[Int]()

    for((person, score) <- scoreList) {
      personArray += person
    }

    // 동점일 경우 오름차순으로
    return personArray.toVector
  }

}
