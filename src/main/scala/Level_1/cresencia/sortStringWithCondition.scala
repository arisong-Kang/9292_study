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
object sortStringWithCondition {

  def main(args: Array[String]): Unit = {

    val strings:Vector[String] = Vector("abce","abcd","cdx")
    val n:Int = 1

    println(solution(strings, 1))
  }

  def solution(strings: Vector[String], n: Int): Vector[String] = {
    val dictionary:Map[String, Int] = Map(("a",1), ("b",2), ("c",3), ("d",4), ("e",5), ("f",6), ("g",7), ("h",8), ("i",9), ("j",10), ("k",11), ("l",12), ("m",13), ("n",14), ("o",15),
      ("p",16), ("q",17), ("r",18), ("s",19), ("t",20), ("u",21), ("v",22), ("w",23), ("x",24), ("y",25), ("z",26))
    var nth_string = mutable.ListBuffer[(Int, String)]()
    var result = mutable.ArrayBuffer[String]()

    strings.foreach(word => {
      nth_string += ((dictionary.get(word.charAt(n).toString).getOrElse().toString.toInt,word))
    })

    // (순서, 알파벳) 에서 순서 오름차순으로 정렬
    val sorted_string = nth_string.sortWith(_._1 < _._1)

    // 중복된 순서가 존재하는 경우, 사전 순으로 재정렬
    for(idx <- 0 until sorted_string.length-1) {

      // 중복된 순서인 경우
      if(sorted_string(idx)._1 == sorted_string(idx+1)._1) {

        // 문자열 char 수만큼 반복
        for(wordIdx <- 0 until sorted_string(idx)._2.length) {
          // 중복된 순서에 해당하는 문자열들의 알파벳 순서 뽑기
          val front_char = dictionary.get(sorted_string(idx)._2.charAt(wordIdx).toString).getOrElse().toString.toInt
          val second_char = dictionary.get(sorted_string(idx+1)._2.charAt(wordIdx).toString).getOrElse().toString.toInt

          // 알파벳 순서간 차이가 있는 경우 배열에 넣어주기
          if(front_char < second_char && result.length < idx+2) {
            result += sorted_string(idx)._2
            result += sorted_string(idx+1)._2
          }else if(front_char > second_char && result.length < idx+2) {
            result += sorted_string(idx+1)._2
            result += sorted_string(idx)._2
          }
        }
      }
      // 중복되지 않은 순서인 경우 그냥 추가
      else if( !result.contains(sorted_string(idx)._2)  ){
        result += sorted_string(idx)._2
      }
    }

    result += sorted_string(sorted_string.length-1)._2

    return result.toVector
  }

}
