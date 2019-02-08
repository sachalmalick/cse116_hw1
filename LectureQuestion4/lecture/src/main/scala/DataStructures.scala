package lecture

object DataStructures {
	def maxMultiply(input: List[Int]) : Int = {
		if(input.isEmpty) {
			return -1
		}
		else if(input.length == 1) {
			return input.head*input.head
		}
		else {
			var currentMax: Int = 0
			var currentViceMax: Int = 0
			for(elem <- input) {
				if(elem > currentMax) {
					currentMax = elem
				}
				else if(elem > currentViceMax) {
					currentViceMax = elem
				}
			}
			
			return currentMax*currentViceMax
			
		}
	}
	
	def main(args: Array[String]) = {
		var l1: List[Int] = List(8,3,2,7,5,1)
		println(maxMultiply(l1))
	}
}