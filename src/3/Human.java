package 3;

public class Human {
    private Head Head;
    private Leg Leg;
    private Hand Hand;

    public Human(int legLength, int handLength, double headsize) {
        this.Head = new Head(headsize);
        this.Leg = new Leg(legLength);
        this.Hand = new Hand(handLength);
    }

    public void setHandLength(int handLength) {
        this.Hand.setLength(handLength);
    }

    public void setLegLength(int legLength) {
        this.Leg.setLength(legLength);
    }

    @Override
    public String toString() {
        return "Human: Head= " + Head + " Leg= " + Leg + " Hand= " + Hand;
    }

    public static void main(String[] args) {
        Human Bob = new Human(76, 48, 22);
        System.out.println(Bob);
        Bob.Head.setSize(28);
        Bob.setHandLength(62);
        Bob.setLegLength(85);
        System.out.println(Bob);
    }

}
