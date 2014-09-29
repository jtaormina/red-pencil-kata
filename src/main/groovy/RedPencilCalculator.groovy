class RedPencilCalculator {
	
	def initialPrice
	def price
	
	public RedPencilCalculator(initialPrice) {
		this.initialPrice = initialPrice
		this.price = initialPrice
	}
	
	public updatePrice(newPrice) { 
		if (isThisOnPromotion(this.initialPrice, newPrice)) {
			this.initialPrice = this.price
		}
		this.price = newPrice	
	}
	
	private isThisOnPromotion(initialPrice, newPrice) {
		(1-(newPrice/initialPrice)) >= 0.05 && (1-(newPrice/initialPrice)) <= 0.3
	}
	
	public isOnPromotion() {
		this.isThisOnPromotion(this.initialPrice, this.price)
	} 
	
}