package Level_2.skkang.musinsa

/**
  * Created by skkang on 2020. 4. 2..
  */
object test_1 {

  def main(args: Array[String]): Unit = {

    val logs = "2019/05/01 00:59:19\n2019/06/01 01:35:20\n2019/08/01 02:01:22\n2019/08/01 02:01:23\n2019/08/02 03:02:35\n2019/10/03 04:05:40\n2019/10/04 06:23:10\n2019/10/10 08:23:20\n2019/10/12 08:42:24\n2019/10/23 08:43:26\n2019/11/14 08:43:29\n2019/11/01 10:19:02\n2019/12/01 11:23:10"
    solution(logs)
  }

  def solution(logs: String): Vector[Int] = {

    val inputArray = logs.split("\n")

    import scala.collection.mutable
    var tempList = mutable.ArrayBuffer[Int]()

    inputArray.foreach{ log =>
      tempList += (log.substring(11, 13).toInt + 9)%24
    }
    println(tempList)

    var result = mutable.ArrayBuffer[Int]()

    for(i<-0 until 24) {
      var temp = 0
      tempList.foreach{ x =>
        if (i == x) temp = temp + 1
      }
      result += temp
    }
    println(result)
    return result.toVector

    //Vector(0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 1, 1, 0, 1, 0, 4, 0, 1, 1, 0, 0, 0)
  }

}
