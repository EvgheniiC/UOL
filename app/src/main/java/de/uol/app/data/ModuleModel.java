package de.uol.app.data;

import java.io.Serializable;
import java.util.List;

public class ModuleModel implements Serializable {

    public final String id;
    public final String name;
    public final int mark;
    public final List<String> keys;
    public final Season season;
    public final Type type;

    private Status status;

    public ModuleModel(Builder builder) {
        id = builder.id;
        name = builder.name;
        mark = builder.mark;
        keys = builder.keys;
        season = builder.season;
        type = builder.type;

        status = Status.undefined;
    }

    public enum Type {
        mandatory, optional
    }

    public enum Season {
        winter, summer, demi, unregular
    }

    public enum Status {
        pass, fail, undefined
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void nextStatus() {
        switch (status) {
            case pass:
                status = Status.fail;
                break;
            case fail:
                status = Status.undefined;
                break;
            case undefined:
                status = Status.pass;
                break;
        }
    }

    public static class Builder {
        private String id;
        private String name;
        private int mark;
        private List<String> keys;
        private Season season;
        private Type type;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setMark(int mark) {
            this.mark = mark;
            return this;
        }

        public Builder setKeys(List<String> keys) {
            this.keys = keys;
            return this;
        }

        public Builder setSeason(Season season) {
            this.season = season;
            return this;
        }

        public Builder setType(Type type) {
            this.type = type;
            return this;
        }

        public ModuleModel build() {
            return new ModuleModel(this);
        }
    }
}
