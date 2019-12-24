package Level_1.cresencia

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
  * 수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한 조건
시험은 최대 10,000 문제로 구성되어있습니다.
문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
입출력 예
answers	return
[1,2,3,4,5]	[1]
[1,3,2,4,2]	[1,2,3]
입출력 예 설명
입출력 예 #1

수포자 1은 모든 문제를 맞혔습니다.
수포자 2는 모든 문제를 틀렸습니다.
수포자 3은 모든 문제를 틀렸습니다.
따라서 가장 문제를 많이 맞힌 사람은 수포자 1입니다.

입출력 예 #2

모든 사람이 2문제씩을 맞췄습니다.

  */
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

    // max랑 비교

    // 동점일 경우 오름차순으로
    return personArray.toVector
  }

}
