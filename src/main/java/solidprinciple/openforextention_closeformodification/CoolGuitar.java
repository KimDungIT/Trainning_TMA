package solidprinciple.openforextention_closeformodification;

public class CoolGuitar extends Guitar {
    private String flameColor;

    public CoolGuitar(String flameColor) {
        this.flameColor = flameColor;
    }

    public String getFlameColor() {
        return flameColor;
    }

    public void setFlameColor(String flameColor) {
        this.flameColor = flameColor;
    }
}
