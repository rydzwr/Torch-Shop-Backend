package pl.shop.torch.dto;

import pl.shop.torch.model.OfferCategory;
import pl.shop.torch.model.User;

import java.util.Date;

public class OfferDto {
    private int offerId;
    private Date offerPublicationDate;
    private String offerDescription;
    private double offerPrice;
    private String offerTitle;
    private String offerContactPhone;
    private int offerImportantScale;
    private String offerAdvertiserName;
    private OfferCategory offerCategory;
    private User user;

    public OfferDto() {
    }

    public OfferDto(
            Date offerPublicationDate,
            String offerDescription,
            double offerPrice,
            String offerTitle,
            String offerContactPhone,
            int offerImportantScale,
            String offerAdvertiserName,
            OfferCategory offerCategory,
            User user
    ) {
        this.offerPublicationDate = offerPublicationDate;
        this.offerDescription = offerDescription;
        this.offerPrice = offerPrice;
        this.offerTitle = offerTitle;
        this.offerContactPhone = offerContactPhone;
        this.offerImportantScale = offerImportantScale;
        this.offerAdvertiserName = offerAdvertiserName;
        this.offerCategory = offerCategory;
        this.user = user;
    }

    public OfferDto(
            int offerId,
            Date offerPublicationDate,
            String offerDescription,
            double offerPrice,
            String offerTitle,
            String offerContactPhone,
            int offerImportantScale,
            String offerAdvertiserName,
            OfferCategory offerCategory,
            User user
    ) {
        this.offerId = offerId;
        this.offerPublicationDate = offerPublicationDate;
        this.offerDescription = offerDescription;
        this.offerPrice = offerPrice;
        this.offerTitle = offerTitle;
        this.offerContactPhone = offerContactPhone;
        this.offerImportantScale = offerImportantScale;
        this.offerAdvertiserName = offerAdvertiserName;
        this.offerCategory = offerCategory;
        this.user = user;
    }

    public int getOfferId() {
        return offerId;
    }

    public void setOfferId(int offerId) {
        this.offerId = offerId;
    }

    public Date getOfferPublicationDate() {
        return offerPublicationDate;
    }

    public void setOfferPublicationDate(Date offerPublicationDate) {
        this.offerPublicationDate = offerPublicationDate;
    }

    public String getOfferDescription() {
        return offerDescription;
    }

    public void setOfferDescription(String offerDescription) {
        this.offerDescription = offerDescription;
    }

    public double getOfferPrice() {
        return offerPrice;
    }

    public void setOfferPrice(double offerPrice) {
        this.offerPrice = offerPrice;
    }

    public String getOfferTitle() {
        return offerTitle;
    }

    public void setOfferTitle(String offerTitle) {
        this.offerTitle = offerTitle;
    }

    public String getOfferContactPhone() {
        return offerContactPhone;
    }

    public void setOfferContactPhone(String offerContactPhone) {
        this.offerContactPhone = offerContactPhone;
    }

    public int getOfferImportantScale() {
        return offerImportantScale;
    }

    public void setOfferImportantScale(int offerImportantScale) {
        this.offerImportantScale = offerImportantScale;
    }

    public String getOfferAdvertiserName() {
        return offerAdvertiserName;
    }

    public void setOfferAdvertiserName(String offerAdvertiserName) {
        this.offerAdvertiserName = offerAdvertiserName;
    }

    public OfferCategory getOfferCategory() {
        return offerCategory;
    }

    public void setOfferCategory(OfferCategory offerCategory) {
        this.offerCategory = offerCategory;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
