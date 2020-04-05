package cz.mozny.dominik.domain;

import org.springframework.data.annotation.Id;

public class Activity {
    @Id
    private long id;
    String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
