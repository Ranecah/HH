import java.awt.*;

public class MyActions {
    public void Harem() {
        Click (0,0);
    }
    public static void Click(int a, int b){
        try {
            // Créer une instance de Robot
            Robot robot = new Robot();

            // Déplacer la souris à la position (x, y)
            robot.mouseMove(a, b);  // Remplace par les coordonnées souhaitées

            // Simuler un clic gauche
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);  // Clic gauche
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

