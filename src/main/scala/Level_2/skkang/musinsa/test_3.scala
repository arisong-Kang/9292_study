package Level_2.skkang.musinsa

/**
  * Created by skkang on 2020. 4. 2..
  */
object test_3 {
  def main(args: Array[String]): Unit = {

//    val n = 12
//    val n = 10000001 // Vector(11, 909091)
//    val n = 909091 // Vector(-1, -1)
    val n = 1010101011 // ArrayBuffer(3, 113, 339, 2979649, 8938947, 336700337) -> Vector(-1, -1)

    solution(n)

  }

  def solution(n: Long): Vector[Long] = {

    import scala.collection.mutable

    //n의 약수 리스트
    var factorList = mutable.ArrayBuffer[Long]()
    for(i <- 2 until ((n/2)+1).toInt ) {
      if ( n%i == 0) {
        factorList += i
      }
    }

    if (factorList.length == 2) {
      return factorList.toVector
    } else {
      return Vector(-1,-1)
    }
  }
}
