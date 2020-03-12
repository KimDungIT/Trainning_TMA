package design_pattern.observer_pattern;

public interface Observer {
    //method to update observer , used by subject
    void update();

    //attach with subject to observer
    void setSubject(Subject sub);
}
