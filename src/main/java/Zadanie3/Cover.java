package Zadanie3;
public enum Cover {
    SOFT("miękka"),
    HARD("twarda");


    private String polski;

    Cover(String polski) {
        this.polski = polski;
    }
    public String getPolski(){
        return polski;
    }

}
