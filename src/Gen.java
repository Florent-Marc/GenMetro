import java.util.ArrayList;
import java.util.List;

public class Gen {

    /**
     * uptodown: true = up to down, false = left to right
     * count: count of pixel
     * lastx: gauche a droite
     * lasty: haut a bas
     */
    public static void genRoad(Boolean uptodown, int count, int lastx, int lasty,int PourcentDeviation) {
        List<Type> types = new ArrayList<Type>();
        //======config=======
        int distancemin = 15;
        int distancemax = 45;
        int MinCountDeviation = 7;
        int station = 3;
        //======tampon=======
        int countStation = 0;
        int genstation = 0;
        int random = 0;
        int CountDeviation = 0;
        for (int i = 0; i < count; i++) {
            if (station > countStation) {
                if (random == 0) {
                    random = getRandom(i + distancemin, i + distancemax);
                }
            }
            if (random == i) {
                types.add(new Type(lastx, lasty, Type.EnumType.Station));
                genstation++;
                random = 0;
                countStation++;
                if (uptodown) {
                    lasty++;
                } else {
                    lastx++;
                }
            } else {
                if (i == 0) {
                    types.add(new Type(lastx, lasty, Type.EnumType.StartAndEnd));
                } else if (i == count - 1) {
                    types.add(new Type(lastx, lasty, Type.EnumType.StartAndEnd));
                } else{
                    types.add(new Type(lastx, lasty, Type.EnumType.Tunnel));
                }
                if (uptodown) {
                    if (getRandom(0, 100) <= PourcentDeviation && CountDeviation >= MinCountDeviation) {
                        CountDeviation = 0;
                        if (getRandom(0, 1) == 0) {
                            lastx--;
                            //left
                        } else {
                            //right
                            lastx++;
                        }
                    } else {
                        CountDeviation++;
                    }
                    lasty++;
                } else {
                    if (getRandom(0, 100) <= PourcentDeviation && CountDeviation >= MinCountDeviation) {
                        CountDeviation = 0;
                        if (getRandom(0, 1) == 0) {
                            //left
                            lasty--;

                        } else {
                            //right
                            lasty++;
                        }
                    } else {
                        CountDeviation++;
                    }
                    lastx++;
                }
            }
        }
        Draw.addList(types);
        System.out.println("Generated tunnel with long " + count + " and " + genstation + " station with success");
    }


    public static int getRandom(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
