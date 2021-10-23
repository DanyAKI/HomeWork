public class Wall implements obstacle {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return " successfully  " + height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void overcome(participants p) {
        p.jump();
    }
}
