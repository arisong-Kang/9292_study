package Level_1.cresencia

import scala.collection.mutable
/**
문제 설명
문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 예를 들어 strings가 [sun, bed, car]이고 n이 1이면 각 단어의 인덱스 1의 문자 u, e, a로 strings를 정렬합니다.

제한 조건
strings는 길이 1 이상, 50이하인 배열입니다.
strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
모든 strings의 원소의 길이는 n보다 큽니다.
인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
입출력 예
strings	n	return
[sun, bed, car]	1	[car, bed, sun]
[abce, abcd, cdx]	2	[abcd, abce, cdx]
입출력 예 설명
입출력 예 1
sun, bed, car의 1번째 인덱스 값은 각각 u, e, a 입니다. 이를 기준으로 strings를 정렬하면 [car, bed, sun] 입니다.

입출력 예 2
abce와 abcd, cdx의 2번째 인덱스 값은 c, c, x입니다. 따라서 정렬 후에는 cdx가 가장 뒤에 위치합니다. abce와 abcd는 사전순으로 정렬하면 abcd가 우선하므로, 답은 [abcd, abce, cdx] 입니다.
  */
object SortStringWithCondition_8 {

  def main(args: Array[String]): Unit = {

    val strings:Vector[String] = Vector("abce","abcd","cdx")
    val n:Int = 1

    println(solution(strings, 1))
  }

  def solution(strings: Vector[String], n: Int): Vector[String] = {
    var kth_string = mutable.ListBuffer[(Int, String)]()
    val result = mutable.ArrayBuffer[String]()

    strings.foreach(word => {
      kth_string += ((word.charAt(n).toInt, word))
    })

    kth_string = kth_string.sortWith(_._1 < _._1)

    for(idx <- 0 until kth_string.length) {
      if( (kth_string.length > idx + 1) && (kth_string(idx)._1 == kth_string(idx+1)._1) ) {
        var wordIdx = 0

        kth_string(idx)._2.toString.foreach(char => {
          if ((char.toInt < kth_string(idx+1)._2.charAt(wordIdx) && result.length != idx+1 )) {
            result += kth_string(idx)._2
            result += kth_string(idx+1)._2
            println("yeah")
          } else if ((char.toInt > kth_string(idx+1)._2.charAt(wordIdx) && result.length != idx+1 )) {
            result += kth_string(idx+1)._2
            result += kth_string(idx)._2
          }
            wordIdx += 1
        })
      } else if(result.length < idx+1) result += kth_string(idx)._2

    }

    return result.toVector
  }

}
