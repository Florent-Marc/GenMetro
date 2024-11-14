package quest.obj;

import quest.Objectif;

public class Has implements Objectif {

    Object obj;
    int count;

    public Has(Object obj, int count) {
        this.obj = obj;
        this.count = count;
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
