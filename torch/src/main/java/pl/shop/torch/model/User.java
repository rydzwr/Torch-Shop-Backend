package pl.shop.torch.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    @NotNull
    @NotBlank
    private String userName;

    @NotNull
    @NotBlank
    private String userPassword;

    @NotNull
    @NotBlank
    private String userEmail;

    @OneToMany(mappedBy = "user")
    private List<Offer> offerList;

    public User() {
    }

    public User(String userName, String userPassword, String userEmail, List<Offer> offerList) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.offerList = offerList;
    }

    public User(int userId, String userName, String userPassword, String userEmail, List<Offer> offerList) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.offerList = offerList;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public List<Offer> getOfferList() {
        return offerList;
    }

    public void setOfferList(List<Offer> offerList) {
        this.offerList = offerList;
    }
}
