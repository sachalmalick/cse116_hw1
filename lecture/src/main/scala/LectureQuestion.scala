package lecture

object LectureQuestion {
	
	
	
	def fileProduct(filename: String) : Int = {

		val f = scala.io.Source.fromFile(filename)
		var working: Int = 1
		for (line <- f.getLines()) {
			var arr = line.split("&")
			for (x <- arr) {
				working = working * x.toInt
			}
		}
		f.close()
		return working;
	}


}
