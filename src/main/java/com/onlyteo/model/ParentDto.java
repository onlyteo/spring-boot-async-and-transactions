package com.onlyteo.model;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class ParentDto {

    private Long id;
    private String name;
    private List<ChildDto> children = new ArrayList<>();
    private ZonedDateTime created;
    private ZonedDateTime modified;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<ChildDto> getChildren() {
        return children;
    }

    public ZonedDateTime getCreated() {
        return created;
    }

    public ZonedDateTime getModified() {
        return modified;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {

        private Long id;
        private String name;
        private List<ChildDto> children = new ArrayList<>();
        private ZonedDateTime created;

        private ZonedDateTime modified;

        private Builder() {
        }

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder children(List<ChildDto> children) {
            this.children = children;
            return this;
        }

        public Builder created(ZonedDateTime created) {
            this.created = created;
            return this;
        }

        public Builder modified(ZonedDateTime modified) {
            this.modified = modified;
            return this;
        }

        public ParentDto build() {
            ParentDto parentDto = new ParentDto();
            parentDto.name = this.name;
            parentDto.created = this.created;
            parentDto.children = this.children;
            parentDto.id = this.id;
            parentDto.modified = this.modified;
            return parentDto;
        }
    }
}
