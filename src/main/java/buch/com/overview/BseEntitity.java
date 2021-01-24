package buch.com.overview;

public class BseEntitity {
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BseEntitity{" +
                "id=" + id +
                '}';
    }

    public Long getId() {
        return id;
    }

    boolean isNew() {
        return this.id == null;
    }
}
