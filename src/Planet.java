public class Planet extends Sun
{
    private int angle;
    private int distance;
    private int speed;

    public Planet(int distance, int angle, int diameter, int speed, String colour) {
        super(diameter, colour);
        this.angle = angle;
        this.distance = distance;
        this.speed = speed;
    }

    /**
     * Increments angle by the preset speed of the object
     */
    public void incrementAngle() {
        this.angle = this.angle + this.speed;
    }

    
    /** 
     * @param solSys
     */
    public void Draw(SolarSystem solSys) {
        solSys.drawSolarObject(distance, angle, this.getDiameter(), this.getColour());
    }
    
    /** 
     * @return int
     */
    public int getAngle() {
        return angle;
    }

    
    /** 
     * @param angle
     */
    public void setAngle(int angle) {
        this.angle = angle;
    }

    
    /** 
     * @return int
     */
    public int getDistance() {
        return distance;
    }

    
    /** 
     * @param distance
     */
    public void setDistance(int distance) {
        this.distance = distance;
    }
}
