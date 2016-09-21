
public class Balls {

    //Olgu massiivis juhuslikult läbisegi punased ja rohelised pallid.
    //Koostage võimalikult kiire meetod, mis järjestaks massiivi ümber nii, et kõik punased pallid oleksid
    //massiivi alguses ja kõik rohelised pallid lõpus. Arvestage ka piirjuhtumiga, et kõik pallid on üht värvi.


    enum Color {green, red}

    ;

    public static void main(String[] param) {
        // for debugging
        Color[] balls = {Color.red, Color.green, Color.green, Color.red, Color.green, Color.red};
        reorder(balls);
    }

    public static void reorder(Color[] balls) {
        // TODO!!! Your program here
        int redBallCount = 0;
        for (int i = 0; i < balls.length; i++) {
            if (balls[i].equals(Color.red)) {
                redBallCount += 1;
            }
        }

        if (redBallCount == 0) {
            System.out.println("Kõik pallid on rohelised.");
        } else if (redBallCount == balls.length) {
            System.out.println("Kõik pallid on punased.");
        } else {
            for (int i = 0; i < redBallCount; i++) {
                balls[i] = Color.red;
                System.out.println(balls[i]);
            }
            for (int i = redBallCount; i < balls.length; i++) {
                balls[i] = Color.green;
                System.out.println(balls[i]);
            }
            //System.out.println(balls);
        }
    }

}

