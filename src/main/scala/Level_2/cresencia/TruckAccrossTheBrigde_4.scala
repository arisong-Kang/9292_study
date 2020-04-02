package Level_2.cresencia

/**
  * 문제 설명
  * 트럭 여러 대가 강을 가로지르는 일 차선 다리를 정해진 순으로 건너려 합니다.
  * 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 알아내야 합니다.
  **
  *트럭은 1초에 1만큼 움직이며, 다리 길이는 bridge_length이고 다리는 무게 weight까지 견딥니다.
  *※ 트럭이 다리에 완전히 오르지 않은 경우, 이 트럭의 무게는 고려하지 않습니다.
  **
  *예를 들어, 길이가 2이고 10kg 무게를 견디는 다리가 있습니다.
  *무게가 [7, 4, 5, 6]kg인 트럭이 순서대로 최단 시간 안에 다리를 건너려면 다음과 같이 건너야 합니다.
  **
  *경과 시간	다리를 지난 트럭	다리를 건너는 트럭	대기 트럭
*0	[]	[]	[7,4,5,6]
*1~2	[]	[7]	[4,5,6]
*3	[7]	[4]	[5,6]
*4	[7]	[4,5]	[6]
*5	[7,4]	[5]	[6]
*6~7	[7,4,5]	[6]	[]
*8	[7,4,5,6]	[]	[]
*따라서, 모든 트럭이 다리를 지나려면 최소 8초가 걸립니다.
  **
 *solution 함수의 매개변수로 다리 길이 bridge_length, 다리가 견딜 수 있는 무게 weight, 트럭별 무게 truck_weights가 주어집니다. 이때 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 return 하도록 solution 함수를 완성하세요.
  **
 *제한 조건
*bridge_length는 1 이상 10,000 이하입니다.
*weight는 1 이상 10,000 이하입니다.
*truck_weights의 길이는 1 이상 10,000 이하입니다.
*모든 트럭의 무게는 1 이상 weight 이하입니다.
*입출력 예
*bridge_length	weight	truck_weights	return
*2	10	[7,4,5,6]	8
*100	100	[10]	101
*100	100	[10,10,10,10,10,10,10,10,10,10]	110
  *
  *
 */
object TruckAccrossTheBrigde_4 {
  def main(args: Array[String]): Unit = {
    val bridge_length = 2
    val weight = 10
    val truck_weights = Vector(7,4,5,6)

    println(solution2(bridge_length, weight, truck_weights))
  }

  def solution2(bridge_length: Int, weight: Int, truck_weights: Vector[Int]): Int = {
    var truckOnTheBridge = new scala.collection.mutable.Queue[(Int, Int)]()
    var crossedTheBridge = new scala.collection.mutable.Queue[Int]()

    var sec = 1
    var idx = 0

    while(crossedTheBridge.length != truck_weights.length) {
      var truckWeight = 0
      truckOnTheBridge.foreach( truck => truckWeight += truck._1)

      // 다리 전체 무게와 다리에 올라간 트럭 하중
      if ((idx != truck_weights.length) &&
            (truckWeight + truck_weights(idx)) <= weight) {
        truckOnTheBridge += ((truck_weights(idx), 0))
        idx += 1
      }

      // (트럭무게, 다리 위에 올라간 시간) 형태의 queue
      // 1초 지날때마다 시간 +1
      truckOnTheBridge = truckOnTheBridge.map{case(truck, second) => (truck, second+1) }

      // 맨 앞 트럭의 시간이 다리 길이와 동일한 경우
      // 꺼내주기
      if (truckOnTheBridge.front._2 == bridge_length) {
        crossedTheBridge += truckOnTheBridge.dequeue()._1
      }

      sec += 1
    }

    return sec
  }
}
