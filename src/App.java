public class App
{
    public static void main(String[] args) {
        SolarSystem ss = new SolarSystem(1920, 1080);
        int angle = 0;
        int distance = 300;
        Sun sun = new Sun(100, "YELLOW");
        Planet Earth = new Planet(distance, angle, 10, 1, "BLUE");
        while(true)
        {          
            ss.drawSolarObject(0, 0, sun.getDiameter(), sun.getColour());
            //forloop over planet objects
            for(int i = 0; i < 1; i++)
            {
                ss.drawSolarObject(Earth.getDistance(), Earth.getAngle(), Earth.getDiameter(), Earth.getColour());
                Earth.incrementAngle();
            }
            //forloop over moon objects
            

            ss.finishedDrawing();
        }
    }
}