package tests

import org.scalatest._
import lecture.DataStructures

class TestDataStructures extends FunSuite{
	
	test("Tesing data structures") {
		
		var l2: List[Int] = List(8,3,2,7,5,1)
		var l3: List[Int] = List()
		var l4: List[Int] = List(3)
		var l5: List[Int] = List(9,4,-1,3,6)
		var l6: List[Int] = List(8,8,3,2)
		
		var testmap: Map[List[Int], Int] = Map(l2 -> 56, l3 -> -1, l4 -> 9, l5 -> 54, l6 -> 64)
		
		
		
		for((key, value) <- testmap) {
			assert(DataStructures.maxMultiply(key) == value, key)
		}
	}
	
}