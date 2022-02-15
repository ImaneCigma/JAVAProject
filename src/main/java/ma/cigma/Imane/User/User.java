
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ma.cigma.Imane.User;

        import javax.persistence.Entity;
        import javax.persistence.Id;

@Entity
public class User{
    @Id
    private int id;
    private String fullname;
    private String email;

    public User() {
    }

    public User(int id, String Username, String email) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return this.fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}