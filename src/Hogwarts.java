public abstract class Hogwarts {
    private final String name;
    private final int magicPower;
    private final int transgress;

    public Hogwarts(String name, int magicPower, int transgress) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgress = transgress;
    }

    public void compareCommon(Hogwarts other) {
        int sum = getSum();
        int otherSum = other.getSum();

        Hogwarts winner = sum > otherSum ? this : other;
        Hogwarts loser = sum > otherSum ? other : this;

        System.out.println(winner.name + " обладает бОльшей мощностью магии, чем " + loser.name);
    }

    private int getSum() {
        return magicPower + transgress;
    }

    void print() {
        System.out.println(this);
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgress() {
        return transgress;
    }
}