package Level_1.skkang

import scala.collection.mutable.ArrayBuffer

//체육복
object Solution_03 {
  /*
    n	lost	    reserve	   return
    5	[2, 4]  	[1, 3, 5]	 5
    5	[2, 4]  	[3]	       4
    3	[3]	      [1]	       2
    8 [2,4,5,7] [1,3,6,8]  8
   */
  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readLine()

    val lostInputStringRaw = scala.io.StdIn.readLine()
    val lostInputString = lostInputStringRaw.substring(1, lostInputStringRaw.length() - 1)
    val lostInput = lostInputString.split(",")
    val lost = new Array[Int](lostInput.length)

    var i = 0
    lostInput.foreach{ x =>
      lost(i) = x.toInt
      i = i+1
    }

    val reserveInputStringRaw = scala.io.StdIn.readLine()
    val reserveInputString = reserveInputStringRaw.substring(1, reserveInputStringRaw.length() - 1)
    val reserveInput = reserveInputString.split(",")
    val reserve = new Array[Int](reserveInput.length)

    var j = 0
    reserveInput.foreach{ y =>
      reserve(j) = y.toInt
      j = j+1
    }

    solution(n.toInt, lost.toVector, reserve.toVector)
  }

  def solution(n: Int, lost: Vector[Int], reserve: Vector[Int]): Int = {

    val lostArray = new ArrayBuffer[Int]()
    val reserveArray = new ArrayBuffer[Int]()

    lost.sorted.foreach{ x => lostArray += x }
    reserve.sorted.foreach{ x => reserveArray += x }

    var overlapCount = 0
    //중복제거
    lost.foreach{ x =>
      reserve.foreach{ y =>
        if(x == y) {
          lostArray -= x
          reserveArray -= x
          overlapCount += 1
        }
      }
    }

    var lendCount = 0

    lostArray.foreach{ x => println("lostArray:",x) }
    reserveArray.foreach{ x => println("reserveArray:",x)}

    reserveArray.foreach{ x =>
      println(">>>>>>>>>>>>>>>>>> x :",x)
      var tempLostArray = lostArray
      if (x-1 > 0) {
        println("------------- [x-1] -------------", x-1)
        tempLostArray.foreach{ y =>
          println(">>>>>>> y : ", y)
          if ((x-1) == y) {
            println("Do (-) !!")
            tempLostArray -= x
            lendCount += 1
          }
        }
      }
      if (x+1 <= n) {
        println("------------- [x+1] -------------", x+1)
        tempLostArray.foreach{ y =>
          println(">>>>>>> y : ", y)
          if (x+1 == y) {
            println("Do (-) !!")
            tempLostArray -= x
            lendCount += 1
          }
        }
      }
    }

    val result = n - lost.length + lendCount/2

    println(n, lost.length, lendCount/2, overlapCount, result)

    return result
  }
}
