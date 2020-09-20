package The_second.N2

public class DogGroup {

    public static void main(String[] args) {
        DogGroup group = new DogGroup();
        for (int i = 0; i < 100; i++) {
            group.add(new Dog("Dog" + i, i));
        }
        System.out.println(group.get(0));
    }

    private Dog[] group;
    private int size;

    public DogGroup() {
        this.group = new Dog[16];
        this.size = 0;
    }

    public void add(Dog... dogs) {
        for (Dog dog : dogs) {
            group[size % 16] = dog;
            size += 1;
        }
    }

    public Dog get(int i) {
        return group[i];
    }

}
