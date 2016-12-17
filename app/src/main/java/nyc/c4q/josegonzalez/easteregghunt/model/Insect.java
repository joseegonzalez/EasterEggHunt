package nyc.c4q.josegonzalez.easteregghunt.model;

import java.util.Calendar;

import nl.qbusict.cupboard.annotation.Column;

/**
 * Created by hakeemsackes-bramble on 12/17/16.
 */

public class Insect {

    private Long _id;

    private String name;

    @Column("insect_url")
    private Long timeAdded;


    public Insect() {
        this.name = "Unknown";
        this.timeAdded = Calendar.getInstance().getTimeInMillis();
    }

    public Insect(String name, Long timeAdded) {
        this.name = name;
        this.timeAdded = timeAdded;
    }

    public Long getId() {
        return _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTimeAdded() {
        return timeAdded;
    }
}

