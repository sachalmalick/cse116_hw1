package tests
import org.scalatest._
import lecture.FirstObject

class UnitTesting extends FunSuite {
	test("testing") {
		val lessThanThirty: List[Double] = List(23.2, 0.0, -4.3, 18.1, 22.8, 17.7, 30);
		val greaterThanThirty: List[Double] = List(100.3, 35.8, 78.2, 93.1);
		
		for(lessThirty <- lessThanThirty) {
			assert(FirstObject.computeShippingCost(lessThirty) == 5, lessThirty);
		}
		for(greaterThirty <- greaterThanThirty) {
			assert(FirstObject.computeShippingCost(greaterThirty) == (5.0 + (greaterThirty - 30)*0.25), greaterThirty);
		}
	}
}