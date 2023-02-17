package ssm.api.demo.enums;

public enum OsStatus {
    BUDGET("Orçamento"),
    OPEN("Aberto"),
    IN_PROGRESS("Em andamento"),
    INVOICED("Faturado"),
    SETTLED("Quitado"),
    FINISHED("Finalizado"),
    CANCELED("Cancelado"),
    AWAITING_PARTS("Aguardando peça");

    String value;

    OsStatus(String value) {
        this.value = value;
    }
}
