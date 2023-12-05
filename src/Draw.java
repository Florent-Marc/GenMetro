import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

public class Draw {
    private static List<Type> types = new java.util.ArrayList<Type>();

    public static void drawWithList(List<Type> types) {
        File file = new File("src/Map.png");
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        for (Type type : types) {
            image.setRGB(type.getX(), type.getY(), type.getType().getType());
        }
        try {
            javax.imageio.ImageIO.write(image, "png", file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void addList(List<Type> types) {
        //verifier si deux coordonner sont identique si c'est le cas change le type en croisement
        for (Type type : types) {
            for (Type type2 : getTypes()) {
                if (type.getX() == type2.getX() && type.getY() == type2.getY() && type.getType() == type2.getType()) {
                    type.setType(Type.EnumType.Croisement);
                    type2.setType(Type.EnumType.Croisement);
                }
            }
            getTypes().add(type);
        }
    }

    //get all croisement
    public static List<Type> getCroisement() {
        List<Type> croisement = new java.util.ArrayList<Type>();
        for (Type type : getTypes()) {
            if (type.getType() == Type.EnumType.Croisement) {
                croisement.add(type);
            }
        }
        return croisement;
    }

    //cleanup list croisement
    public static void cleanCroisement() {
        List<Type> remove = new java.util.ArrayList<Type>();
        for (Type type : getCroisement()) {
            getCroisement().forEach(type1 -> {
                if (type1.equals(type)) {
                    if (!remove.contains(type1)){
                        remove.add(type1);
                    }
                }
            });
        }
        remove.forEach(type -> getTypes().remove(type));
        System.out.println("Cleaned " + remove.size() + " croisement");

    }


    public static void clearList() {
        Draw.types.clear();
    }

    public static List<Type> getTypes() {
        return types;
    }
}
