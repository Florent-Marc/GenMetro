package quest;

import quest.obj.Has;

import java.util.Collections;
import java.util.List;

public class Tache {

    private int id;
    private String name;
    private String description;
    private Requirement requirement;
    private Object obj;
    private Long time;
    private Tache previous;
    private Tache next;
    private List<?extends Objectif> objectif;

    public Tache(int id, String name, String description, Requirement requirement, Object obj, Long time, Tache previous, Tache next, List<?extends Objectif> objectif) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.requirement = requirement;
        this.obj = obj;
        this.time = time;
        this.previous = previous;
        this.next = next;
        this.objectif = objectif;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Requirement getRequirement() {
        return requirement;
    }

    public void setRequirement(Requirement requirement) {
        this.requirement = requirement;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Tache getPrevious() {
        return previous;
    }

    public void setPrevious(Tache previous) {
        this.previous = previous;
    }

    public Tache getNext() {
        return next;
    }

    public void setNext(Tache next) {
        this.next = next;
    }

    public List<? extends Objectif> getObjectif() {
        return objectif;
    }

    public void setObjectif(List<? extends Objectif> objectif) {
        this.objectif = objectif;
    }
}
