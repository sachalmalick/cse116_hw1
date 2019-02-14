package oop

object Referee {
	
	def playGame(a: Team, b: Team) : Unit = {
		var newScoreA = a.strength_offense - a.strength_defense
		if(newScoreA < 0) {
			newScoreA = 0
		}
		a.score = newScoreA
		
		var newScoreB = b.strength_offense - b.strength_defense
		if(newScoreB < 0) {
			newScoreB = 0
		}
		b.score = newScoreB	
	}
	
	
	def declareWinner(a: Team, b: Team) : Team = {
		if(a.score > b.score) {
			return a
		}
		else if(a.score < b.score) {
			return b
		}
		else {
			return new Team(0,0)
		}
	}
	
	
	
	

}