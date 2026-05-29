package lab3;

public class Country {
    private String id;
    private String name;

    // Constructor đầy đủ tham số theo đề bài
    public Country(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Bộ Getters và Setters bắt buộc để JSP có thể đọc thuộc tính
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}