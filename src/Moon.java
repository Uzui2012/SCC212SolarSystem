public class Moon extends Planet
{
    private Planet parentPlanet;
    public Moon(double distance, double angle, double diameter, double incrementSpeed, String colour, Planet parentPlanet) {
        super(distance, angle, diameter, incrementSpeed, colour);
        this.parentPlanet = parentPlanet;
    }

    @Override
    public void Draw(SolarSystem solSys) {
        solSys.drawSolarObjectAbout(this.getDistance(), this.getAngle(), this.getDiameter(),
                                    this.getColour(), this.parentPlanet.getDistance(),
                                    this.parentPlanet.getAngle());
    }
}