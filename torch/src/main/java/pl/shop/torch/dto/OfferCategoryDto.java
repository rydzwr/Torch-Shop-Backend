package pl.shop.torch.dto;

import pl.shop.torch.model.Offer;

import java.util.List;

public class OfferCategoryDto {
    private int offerCategoryId;
    private String offerCategoryName;
    private List<Offer> offerList;

    public OfferCategoryDto() {
    }

    public OfferCategoryDto(String offerCategoryName, List<Offer> offerList) {
        this.offerCategoryName = offerCategoryName;
        this.offerList = offerList;
    }

    public OfferCategoryDto(int offerCategoryId, String offerCategoryName, List<Offer> offerList) {
        this.offerCategoryId = offerCategoryId;
        this.offerCategoryName = offerCategoryName;
        this.offerList = offerList;
    }

    public int getOfferCategoryId() {
        return offerCategoryId;
    }

    public void setOfferCategoryId(int offerCategoryId) {
        this.offerCategoryId = offerCategoryId;
    }

    public String getOfferCategoryName() {
        return offerCategoryName;
    }

    public void setOfferCategoryName(String offerCategoryName) {
        this.offerCategoryName = offerCategoryName;
    }

    public List<Offer> getOfferList() {
        return offerList;
    }

    public void setOfferList(List<Offer> offerList) {
        this.offerList = offerList;
    }
}
