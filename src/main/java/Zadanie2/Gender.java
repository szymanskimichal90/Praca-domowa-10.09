package Zadanie2;


public enum Gender {
    MALE("chłopczyk"),
    FEMALE("dziewczynka");

    private String plec;

    Gender(String plec) {
        this.plec = plec;
    }

    public String getPlec() {
        return plec;
    }
}

