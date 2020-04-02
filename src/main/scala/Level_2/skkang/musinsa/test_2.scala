package Level_2.skkang.musinsa

import java.util

/**
  * Created by skkang on 2020. 3. 24..
  */
object test_2 {

  def main(args: Array[String]): Unit = {
    val fire = Vector(0,0)
    val humans = Vector(Vector(-100,200), Vector(50,50), Vector(-400,-300), Vector(450,-100), Vector(500,500), Vector(-300,600), Vector(0,-550))
    val k = 500
//    val fire = Vector(50,0)
//    val humans = Vector(Vector(100,0), Vector(-40,-30), Vector(10,80), Vector(0,-100))
//    val k = 100

    solution(fire, humans, k)

  }

  def solution(fire: Vector[Int], humans: Vector[Vector[Int]], k: Int): Int = {

    import scala.math.sqrt
    import scala.math.pow

    var count = 0

    humans.foreach{ human =>

      val a = (human(0) - fire(0)).abs
      val b = (human(1) - fire(1)).abs

      if(a < k && b < k) {
        val distance = sqrt(pow(a, 2) + pow(b, 2))
        if (distance <= k) count = count + 1
      }

    }

    println(count)
    return count
  }


}
