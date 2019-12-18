package Level_1.cresencia

/**
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

재한사항
s는 길이가 1 이상, 100이하인 스트링입니다.
  */
object middleOfWord {
  def main(args: Array[String]): Unit = {

    val word = "solution2"

    println(solution(word))
  }
  def solution(s: String): String = {
    var middleOfWord = ""

    // 짝수인 경우
    if (s.length%2 == 0) {
      // 6인 경우 3,4
      println(s.length/2-1)
      middleOfWord = s.substring(s.length/2-1, s.length/2+1)
    } // 홀수인 경우    var middleOfWord = ""

    // 짝수인 경우
    if (s.length%2 == 0) {
      // 6인 경우 3,4
      println(s.length/2-1)
      middleOfWord = s.substring(s.length/2-1, s.length/2+1)
    } // 홀수인 경우
    else {
      middleOfWord = s.substring(s.length/2,s.length/2+1)
    }

    return middleOfWord
    else {
      middleOfWord = s.substring(s.length/2,s.length/2+1)
    }

    return middleOfWord
  }
}
