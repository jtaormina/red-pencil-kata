import static org.junit.Assert.*;

import org.junit.Test;


class RedPencilTests extends GroovyTestCase {
	
	def calc
	public void setUp() {
		calc = new RedPencilCalculator(100)
	}
	
	@Test
	public void testPromotionBeginsAtFivePercent() {
		calc.updatePrice(95)
		assertTrue(calc.isOnPromotion())
	}
	
	@Test
	public void testPromotionDoesntBeginAtFourPercent() {
		calc.updatePrice(96)
		assertFalse(calc.isOnPromotion())
	}

	@Test
	public void testPromotionDoesntOccurAtThirtyOnePercent() {
		calc.updatePrice(69)
		assertFalse(calc.isOnPromotion())
	}
	
	@Test
	public void testPromotionEndsWhenPriceIsIncreased() {
		calc.updatePrice(75)
		assertTrue(calc.isOnPromotion())
		calc.updatePrice(90)
		assertFalse(calc.isOnPromotion())
	}
	
	@Test
	public void testPromotionEndsIfReducedBelowThirtyPercentOfOriginalPrice() {
		calc.updatePrice(95)
		assertTrue(calc.isOnPromotion())
		calc.updatePrice(69)
		assertFalse(calc.isOnPromotion())
	}
}
