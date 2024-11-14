package quest;

public class Requirement {

    private int id;
    private String name;
    private Requi type;
    private Object obj;

    public Requirement(int id, String name, Requi type, Object obj) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.obj = obj;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Requi getType() {
        return type;
    }

    public void setType(Requi type) {
        this.type = type;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
