package Level_1.cresencia

/**
문제 설명
길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.

제한 조건
n은 길이 10,000이하인 자연수입니다.
입출력 예
n	return
3	수박수
4	수박수박
  */
object Subak_12 {

  def main(args: Array[String]): Unit = {

    val s:Int = 10000

    println(solution(s))
    println(solution2(s))
  }

  def solution(n: Int): String = {
    val word = "수박"
    var result = ""

    for (idx <- 1 to n/2) {
      result = result.concat(word)
    }

    return if(n%2==0) result else result.concat("수")
  }

  def solution2(n:Int): String = {
    return if(n%2==0) "수박"*(n/2) else "수박"*(n/2)+"수"
  }
}
