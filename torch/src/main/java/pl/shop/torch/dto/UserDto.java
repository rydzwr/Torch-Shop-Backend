package pl.shop.torch.dto;

import pl.shop.torch.model.Offer;

import java.util.List;

public class UserDto {
    private int userId;
    private String userName;
    private String userPassword;
    private String userEmail;
    private List<Offer> offerList;

    public UserDto() {
    }

    public UserDto(String userName, String userPassword, String userEmail, List<Offer> offerList) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.offerList = offerList;
    }

    public UserDto(int userId, String userName, String userPassword, String userEmail, List<Offer> offerList) {
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
