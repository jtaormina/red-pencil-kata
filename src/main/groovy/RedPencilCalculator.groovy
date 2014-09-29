class RedPencilCalculator {

	def initialPrice
	def price
	def onPromotion

	public RedPencilCalculator(initialPrice) {
		this.initialPrice = initialPrice
		this.price = initialPrice
		this.onPromotion = false
	}

	public updatePrice(newPrice) {
		if (endPromotion(newPrice)) {
			this.onPromotion = false
		}
		else {
			this.onPromotion = inPromotionRange(newPrice)
			if (this.onPromotion) {
				this.initialPrice = this.price
			}
		}
		this.price = newPrice
	}

	private endPromotion(newPrice) {
		this.onPromotion && ((newPrice > this.price) ||
				(1-(newPrice/initialPrice)) > 0.3)
	}

	private inPromotionRange(newPrice) {
		(1-(newPrice/initialPrice)) >= 0.05 && (1-(newPrice/initialPrice)) <= 0.3
	}

	public isOnPromotion() {
		this.onPromotion
	}
}