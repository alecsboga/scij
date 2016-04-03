package ro.scij.tileshop;

/**
 * Abstraction over various types of tiles.
 * @author alex
 *
 */
public abstract class AbstractTile implements Tile {

	/**
	 * Calculate the tile surface considering the width and height of a rectangular tile shape.
	 */
	@Override
	public double calculateTileSurface() {
		return getLength() * getWidth();
	}
}
