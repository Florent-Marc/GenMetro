public class Main {

    public static void main(String[] args) {
        Draw.clearList();
        Gen.genRoad(true, 100, 50, 0,2);
        Gen.genRoad(false, 100, 0, 50,100);
        Gen.genRoad(false, 100, 0, 60,25);
        Draw.cleanCroisement();
        Draw.drawWithList(Draw.getTypes());
        //TODO ameliore les type pour pouvoir definir un zone de transit et un zone de station

    }
}