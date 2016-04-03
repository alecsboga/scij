package ro.scij.tileshop;

/**
 * Utility class that helps calculating the price of a surface to cover by a
 * certain type of tiles.
 * 
 * @author alex
 *
 * @param <T>
 *            represents any interface or class inheriting Tile.
 */
public class TileShopCalculator<T extends Tile> {

	/**
	 * Calculate the price for a given tile type and a given surface.
	 * 
	 * @param tile
	 *            - the instance of a specific tile.
	 * @param surface
	 *            - the surface to be covered.
	 * @return the necessary price to cover a surface by a certain type of tile.
	 */
	public double calculatePrice(T tile, double surface) {
		return tile.calculatePriceBySurfaceToCover(surface);
	}
}
