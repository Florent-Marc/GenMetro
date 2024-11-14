package quest;

import quest.obj.Has;
import quest.obj.Position;

import java.util.Collections;

public class t {

    public static void main(String[] args) {
        Tache t = new Tache(1, "Keep 10 apple", "Research a tree with apple and keep apple", null, null, 0L, null, null, Collections.singletonList(new Has("rat", 10)));
        Tache t2 = new Tache(2, "Go to shop", "Find a shop for rent a apple", null, null, 0L, t, null, Collections.singletonList(new Position(10, 10, 10)));
        Quest q = new Quest(1, "Rat Slayer", "Kill all rats", Collections.singletonList(t), 0L, t, null);
    }
}
