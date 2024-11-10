package springapp.topic;

import lombok.Getter;

@Getter
public class Topic {
    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    private String id;
    private String name;
    private String description;

}
