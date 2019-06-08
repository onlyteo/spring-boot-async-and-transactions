package com.onlyteo.model;

import java.time.ZonedDateTime;

public class ChildDto {

    private Long id;
    private String name;
    private String parentId;
    private ZonedDateTime created;
    private ZonedDateTime modified;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getParentId() {
        return parentId;
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
        private String parentId;
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

        public Builder parentId(String parentId) {
            this.parentId = parentId;
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

        public ChildDto build() {
            ChildDto childDto = new ChildDto();
            childDto.parentId = this.parentId;
            childDto.modified = this.modified;
            childDto.created = this.created;
            childDto.name = this.name;
            childDto.id = this.id;
            return childDto;
        }
    }
}
