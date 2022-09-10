package pl.shop.torch.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "offer_category")
public class OfferCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int offerCategoryId;

    @NotNull
    @NotBlank
    private String offerCategoryName;

    @OneToMany(mappedBy = "offerCategory")
    private List<Offer> offerList;

    public OfferCategory() {
    }

    public OfferCategory(String offerCategoryName, List<Offer> offerList) {
        this.offerCategoryName = offerCategoryName;
        this.offerList = offerList;
    }

    public OfferCategory(int offerCategoryId, String offerCategoryName, List<Offer> offerList) {
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
