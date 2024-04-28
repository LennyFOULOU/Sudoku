public class CaseModel {
    private int value;

    public Case() {
        this.value = 0; // Initialiser la case avec 0 (vide)
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEmpty() {
        return value == 0;
    }
}