package com.onlyteo.model;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Table(name = "PARENTS")
@Entity
public class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @OneToMany(mappedBy = "parentId", cascade = CascadeType.ALL)
    private List<Child> children = new ArrayList<>();
    @Column(nullable = false, updatable = false)
    private ZonedDateTime created;
    private ZonedDateTime modified;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Child> getChildren() {
        return children;
    }

    public ZonedDateTime getCreated() {
        return created;
    }

    public ZonedDateTime getModified() {
        return modified;
    }

    @PrePersist
    private void prePersist() {
        created = ZonedDateTime.now();
    }

    @PreUpdate
    private void preUpdate() {
        modified = ZonedDateTime.now();
    }
}
