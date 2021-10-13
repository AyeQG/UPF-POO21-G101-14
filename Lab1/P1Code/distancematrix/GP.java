package distancematrix;

public class GP {
    private float xCoor;
    private float yCoor;

	public GP( float initx, float inity ) {
        xCoor = initx;
        yCoor = inity;
    }
	public float getx() {
        return xCoor;
    }
    public float gety() {
        return yCoor;
    }
    public float distance( GP p2 ) {
        float x2 = p2.getx();
	    float y2 = p2.gety();
		return Math.sqrt(Math.pow(xCoor-x2) + Math.pow(yCoor-y2));
    }
    public printPoint() {
        system.out.println( str(xCoor) + str(yCoor) );
    }
    
}
