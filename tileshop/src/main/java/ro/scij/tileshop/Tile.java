package ro.scij.tileshop;

/**
 * Interface for tile types.
 * 
 * @author alex
 *
 */
public interface Tile {

	/**
	 * Calculate the price by surface to be covered.
	 * 
	 * @param surface
	 * @return
	 */
	double calculatePriceBySurfaceToCover(double surface);

	/**
	 * Calculate the tile surface.
	 * 
	 * @return the calculated surface.
	 */
	double calculateTileSurface();

	/**
	 * Get the tile length.
	 * 
	 * @return the length.
	 */
	double getLength();

	/**
	 * Get the tile width.
	 * 
	 * @return the width.
	 */
	double getWidth();

	/**
	 * Get the tile price.
	 * 
	 * @return the tile price.
	 */
	double getTilePrice();
}
