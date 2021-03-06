public class Item {
    private int id;
    private String data;
    private boolean isGood;
    private String description;

    public Item(int id, String data, boolean isGood, String description) {
        this.id = id;
        this.data = data;
        this.isGood = isGood;
        this.description = description;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setGood(boolean good) {
        isGood = good;
    }

    public boolean isGood() {
        return isGood;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "\n{"
                + "\"id\": " + id + ", "
                + "\"data\": \"" + data + "\", "
                + "\"isGood\" : " + isGood
                + "}";
    }
}
