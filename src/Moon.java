public class Moon extends Planet
{
    Planet parentPlanet;
    public Moon(int distance, int angle, int diameter, int incrementSpeed, String colour, Planet parentPlanet) {
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
