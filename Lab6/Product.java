package Lab6;

class Product {

    private String priority;
    private String expireDay;
    private String status;

    public Product(String priority, String expireDay, String status) {
        this.priority = priority;
        this.expireDay = expireDay;
        this.status = status;
    }

    @Override
    public String toString() {
        return "";
    }
}
