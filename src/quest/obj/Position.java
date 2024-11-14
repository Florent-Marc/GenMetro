package quest.obj;

import quest.Objectif;

public class Position implements Objectif {

    double x;
    double y;
    double z;

    public Position(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void validate() {

    }


    @Override
    public void fail() {

    }

    @Override
    public void reset() {

    }
}
