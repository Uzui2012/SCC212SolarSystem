public class Planet extends Sun
{
    private double angle;
    private double distance;
    private double speed;

    public Planet(double distance, double angle, double diameter, double speed, String colour) {
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
     * @return double
     */
    public double getAngle() {
        return angle;
    }

    
    /** 
     * @param angle
     */
    public void setAngle(double angle) {
        this.angle = angle;
    }

    
    /** 
     * @return double
     */
    public double getDistance() {
        return distance;
    }

    
    /** 
     * @param distance
     */
    public void setDistance(double distance) {
        this.distance = distance;
    }
}
