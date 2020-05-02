package common.models;

public enum Day {
    MONDAY(1, "PAZARTESI"),
    TUESDAY(2, "SALI"),
    WEDNESDAY(3, "CARSAMBA"),
    THURSDAY(4, "PERSEMBE"),
    FRIDAY(5, "CUMA"),
    SATURDAY(6, "CUMARTESI"),
    SUNDAY(7, "PAZAR");

    String value;
    int number;

    Day(int number, String value){
        this.number = number;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public int getNumber() {
        return number;
    }
}
