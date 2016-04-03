package ro.scij.tileshop;

/**
 * Tile for which the price is calculated by surface.
 * 
 * @author alex
 *
 */
public class STile extends AbstractTile {

	private double length;
	private double width;
	private double price;

	/**
	 * Tile constructor receiving tile characteristics.
	 * @param length
	 * @param width
	 * @param price
	 */
	public STile(double length, double width, double price) {
		this.length = length;
		this.width = width;
		this.price = price;
	}

	/**
	 * Calculates the price of the surface to cover taking in consideration the price by surface.
	 */
	@Override
	public double calculatePriceBySurfaceToCover(double surface) {
		return surface * this.getTilePrice();
	}

	/**
	 * Getter for tile length.
	 */
	public double getLength() {
		return this.length;
	}

	/**
	 * Getter for tile width.
	 */
	public double getWidth() {
		return this.width;
	}

	/**
	 * Price by square meter.
	 */
	@Override
	public double getTilePrice() {
		return this.price;
	}

}
