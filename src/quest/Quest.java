package quest;

import java.util.List;

public class Quest {

    private int id;
    private String name;
    private String description;
    private List<Tache> taches;
    private Long time;
    private Tache current;
    private List<Requirement> requirements;

    public Quest(int id, String name, String description, List<Tache> taches, Long time, Tache current, List<Requirement> requirements) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.taches = taches;
        this.time = time;
        this.current = current;
        this.requirements = requirements;
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

    public List<Tache> getTaches() {
        return taches;
    }

    public void setTaches(List<Tache> taches) {
        this.taches = taches;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Tache getCurrent() {
        return current;
    }

    public void setCurrent(Tache current) {
        this.current = current;
    }

    public List<Requirement> getRequirements() {
        return requirements;
    }

    public void setRequirements(List<Requirement> requirements) {
        this.requirements = requirements;
    }

    public void validate() {

    }
}
