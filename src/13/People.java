public class People {
    public int height;
    public int age;

    public void comprasionheightage(int height, int age) throws MyExc {
        if (height < 30 || height>210 || age<0 || age>140) {
            throw new MyExc();
        }
        this.height+= height;
        this.age+= age;
    }

    @Override
    public String toString() {
        return "People{" +
                "height=" + height +
                ", age=" + age +
                '}';
    }
}
