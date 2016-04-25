/**
 * 
 */
package ro.scij.tileshop;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for TileShopCalculator considering various type of tiles.
 * 
 * @author alex
 *
 */
public class TileShopCalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link ro.scij.tileshop.TileShopCalculator#calculatePrice(ro.scij.tileshop.PTile, double)}
	 * .
	 */
	@Test
	public void testCalculatePricePTile() {
		TileShopCalculator<PTile> pTileShopCalculator = new TileShopCalculator<PTile>();
		PTile pTile = new PTile(1, 1, 2);
		double pTilePrice = pTileShopCalculator.calculatePrice(pTile, 6);
		
		System.out.println(pTilePrice);
		assertEquals(12, pTilePrice, 0);

	}
	
	/**
	 * Test method for
	 * {@link ro.scij.tileshop.TileShopCalculator#calculatePrice(ro.scij.tileshop.STile, double)}
	 * .
	 */
	@Test
	public void testCalculatePriceSTile() {
		TileShopCalculator<STile> tileShopCalculator = new TileShopCalculator<STile>();
		STile sTile = new STile(1, 1, 2);

		double sTilePrice = tileShopCalculator.calculatePrice(sTile, 4);

		assertEquals(8, sTilePrice, 0);
	}

}
