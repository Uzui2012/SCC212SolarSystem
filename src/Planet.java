public class Planet extends Sun
{
    private int angle;
    private int distance;
    private int incrementSpeed;

    public Planet(int distance, int angle, int diameter, int incrementSpeed, String colour) {
        super(diameter, colour);
        this.angle = angle;
        this.distance = distance;
        this.incrementSpeed = incrementSpeed;
    }

    public void incrementAngle() {
        this.angle = this.angle + this.incrementSpeed;
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
