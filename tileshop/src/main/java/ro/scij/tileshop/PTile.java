package ro.scij.tileshop;

/**
 * Tile for which the price is calculated by piece.
 * 
 * @author alex
 *
 */
public class PTile extends AbstractTile {

	private double length;
	private double width;
	private double price;

	/**
	 * Tile constructor receiving tile characteristics.
	 * 
	 * @param length
	 * @param width
	 * @param price
	 */
	public PTile(double length, double width, double price) {
		this.length = length;
		this.width = width;
		this.price = price;
	}

	/**
	 * Calculates the price of the surface to cover taking in consideration the
	 * price by piece and the pieces needed to cover the entire surface..
	 */
	@Override
	public double calculatePriceBySurfaceToCover(double surface) {
		return (surface / this.calculateTileSurface()) * this.getTilePrice();
	}

	/**
	 * Getter for the length.
	 */
	public double getLength() {
		return length;
	}

	/**
	 * Getter for the width.
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * Getter for the price.
	 */
	@Override
	public double getTilePrice() {
		return price;
	}

}
