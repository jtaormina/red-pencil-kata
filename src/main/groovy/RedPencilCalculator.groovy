class RedPencilCalculator {
	
	def initialPrice
	def currentPrice
	
	public RedPencilCalculator(initialPrice) {
		this.initialPrice = initialPrice
	}
	
	public updatePrice(newPrice) {
		currentPrice = newPrice	
	}
	
	public isOnPromotion() {
		(1-(currentPrice/initialPrice)) >= 0.05 && (1-(currentPrice/initialPrice)) <= 0.3
	}
	
}