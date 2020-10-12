public class Planet implements Body
{
    private int diameter;
    private int angle;
    private int distance;
    private int incrementSpeed;
    private String colour;

    public Planet(int distance, int angle, int diameter, int incrementSpeed, String colour) {
        this.diameter = diameter;
        this.angle = angle;
        this.distance = distance;
        this.incrementSpeed = incrementSpeed;
        this.colour = colour;
    }

    public void incrementAngle()
    {
        this.angle = this.angle + this.incrementSpeed;
    }

    public void Draw()
    {

    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
