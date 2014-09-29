import static org.junit.Assert.*;

import org.junit.Test;


class RedPencilTests extends GroovyTestCase {

	@Test
	public void testPromotionBeginsAtFivePercent() {
		RedPencilCalculator calc = new RedPencilCalculator(100)
		calc.updatePrice(95)
		assertTrue(calc.isOnPromotion())
	}
	
	@Test
	public void testPromotionDoesntBeginAtFourPercent() {
		RedPencilCalculator calc = new RedPencilCalculator(100)
		calc.updatePrice(96)
		assertFalse(calc.isOnPromotion())
	}

	@Test
	public void testPromotionDoesntOccurAtThirtyOnePercent() {
		RedPencilCalculator calc = new RedPencilCalculator(100)
		calc.updatePrice(69)
		assertFalse(calc.isOnPromotion())
	}

}
