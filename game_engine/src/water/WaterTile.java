package water;

public class WaterTile {
	
	//public static final float TILE_SIZE = 100;
	
	private float height, size;
	private float x,z;
	
	public WaterTile(float centerX, float centerZ, float height, float size){
		this.x = centerX;
		this.z = centerZ;
		this.size = size;
		this.height = height;
	}

	public float getHeight() {
		return height;
	}

	public float getX() {
		return x;
	}

	public float getZ() {
		return z;
	}

	public float getSize() {
		return size;
	}

}
