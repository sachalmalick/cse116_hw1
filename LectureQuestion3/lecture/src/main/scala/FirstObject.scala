package lecture

object FirstObject {
	
	def computeShippingCost(input: Double) : Double = {
		if(input <= 30) {
			return 5.0
		}
		else {
			return (5.0 + (input - 30)*0.25)
		}
	}

	def main(args: Array[String]) = {
		var x : Double = computeShippingCost(31.0)
		println("result : " + x)
	}

}
