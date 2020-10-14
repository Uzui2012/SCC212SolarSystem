public class App {
    public static void main(String[] args) {
        SolarSystem ss = new SolarSystem(1920, 1080);
        Sun sun = new Sun(100, "YELLOW");
        Planet earth = new Planet(300, 0, 10, 1, "BLUE");
        Moon luna = new Moon(20, 0, 2, 30, "GREY", earth);
        while (true) {
            sun.Draw(ss);
            // forloop over planet objects
            for (int i = 0; i < 1; i++) {
                earth.Draw(ss);                
                luna.Draw(ss);
                earth.incrementAngle();
                luna.incrementAngle();
            }
            // forloop over moon objects

            ss.finishedDrawing();

            
        }
    }
}