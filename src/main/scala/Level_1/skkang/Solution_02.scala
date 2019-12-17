package Level_1.skkang

import scala.collection.mutable.MutableList

//K번째수
object Solution_02 {

  //sample input:   [1, 5, 2, 6, 3, 7, 4]
  //sample commads: [[2, 5, 3], [4, 4, 1], [1, 7, 3]]
  //sample output:  [5, 6, 3]
  def main(args: Array[String]): Unit = {
    val inputArrayRaw = scala.io.StdIn.readLine()
    val inputArray = inputArrayRaw.substring(1, inputArrayRaw.length() - 1)
    val array = inputArray.split(",")

    val inputCommadsRaw = scala.io.StdIn.readLine()
    val inputCommads = inputCommadsRaw.substring(2, inputCommadsRaw.length() - 2)
    val commands = inputCommads.split("\\],\\[")

    val inputMutableArray = new Array[Int](array.length)
    var i = 0
    array.foreach{ x =>
      inputMutableArray(i) = x.toInt
      i = i+1
    }

    val inputMutableCommands = new Array[Vector[Int]](commands.length)
    var j = 0
    commands.foreach{ y =>

      val temp = y.split(",")
      val inputCommand = new Array[Int](3)

      var k = 0

      temp.foreach{ z =>
        inputCommand(k) = z.toInt
        k += 1
      }

      inputMutableCommands(j) = inputCommand.toVector
      j = j+1
    }

    solution(inputMutableArray.toVector, inputMutableCommands.toVector)
  }

  def solution(array: Vector[Int], commands: Vector[Vector[Int]]): Vector[Int] = {

    val tempArrays = new Array[Array[Int]](commands.length)
    val pickArray = new Array[Int](commands.length)

    for ( x <-0 until commands.length) {
      val temp = commands(x).toArray
      val i = temp(0)
      val j = temp(1)
      val k = temp(2)

      pickArray(x) = k
      val tempArray = new Array[Int](j-i+1)
      var arrayString = ""
      array.foreach{ s =>
        arrayString += s.toString
      }

      var y = 0
      val arrayStringSplit = arrayString.substring(i-1,j)
      arrayStringSplit.foreach{ r =>
        tempArray(y) = r.getNumericValue
        y = y+1
      }
      tempArrays(x) = tempArray
    }

    val sortArrays = new Array[Array[Int]](commands.length)
    var z = 0
    tempArrays.foreach{ d =>
      var sortArray = new Array[Int](d.length)
      sortArray = d.sorted
      sortArrays(z) = sortArray
      z += 1
    }

    val resultList = new Array[Int](sortArrays.length)
    var m = 0
    sortArrays.foreach{ v =>
      resultList(m) = v(pickArray(m)-1)
      m += 1
    }

    return resultList.toVector
  }
}
