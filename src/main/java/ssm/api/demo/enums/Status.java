package ssm.api.demo.enums;

public enum Status {
    ACTIVE(0),
    INACTIVE(1);

    Integer value;

    Status(Integer value) {
        this.value = value;
    }
}
