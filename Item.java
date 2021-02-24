abstract class Item implements IItem {
    private String name;
    private boolean exists;

    Item(String name) {
        this.name = name;
        this.exists = true;
    }

    public String getName() {
        return this.name;
    }

    public void changeExists() {
        if(this.exists) {
            this.exists = false;
        } else {
            this.exists = true;
        }
    }
}