import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private String mail;

    public User(String name, String mail) {
        id=UUID.randomUUID();
        this.name = name;
        this.mail = mail;
    }

    public UUID getId() {
        return id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
