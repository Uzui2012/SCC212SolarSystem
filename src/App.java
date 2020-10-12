public class App
{
    public static void main(String[] args) {
        SolarSystem ss = new SolarSystem(1920, 1080);
        int angle = 0;
        int distance = 150;
        while(true)
        {            
            ss.drawSolarObject(0, 0, 100, "YELLOW");
            ss.drawSolarObject(distance, angle++, 10, "BLUE");
            ss.drawSolarObjectAbout(25 , angle*5, 10, "GREY", distance, angle++);
            ss.finishedDrawing();
        }
    }
}