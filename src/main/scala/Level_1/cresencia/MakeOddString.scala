package Level_1.cresencia

import scala.collection.mutable

/**
  * 문제 설명
  * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
  **
  *제한 사항
  *문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
  *첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
  *입출력 예
  *s	return
  *try hello world	TrY HeLlO WoRlD
  *입출력 예 설명
  *try hello world는 세 단어 try, hello, world로 구성되어 있습니다. 각 단어의 짝수번째 문자를 대문자로, 홀수번째 문자를 소문자로 바꾸면 TrY, HeLlO, WoRlD입니다. 따라서 TrY HeLlO WoRlD 를 리턴합니다.
  */
object MakeOddString {
  def main(args: Array[String]): Unit = {

    val s = "try hello   world"

    println(solution(s))
  }

  def solution(s: String): String = {
    val wordArray = mutable.ArrayBuffer[String]()
    var cnt = 0

    s.split("").foreach(char => {
      if(char == " ") {
        wordArray += " "
        cnt = 0
      }
      else if (cnt % 2 == 0) {
        wordArray += char.toUpperCase
        cnt += 1
      }
      else {
        wordArray += char.toLowerCase
        cnt += 1
      }

      println(s"cnt: $cnt / char: $char")
    })

    return wordArray.mkString("")
  }
}
