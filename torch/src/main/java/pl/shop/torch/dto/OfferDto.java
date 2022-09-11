package pl.shop.torch.dto;

import lombok.*;
import pl.shop.torch.model.OfferCategory;
import pl.shop.torch.model.User;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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
    private int serialNumber;

    public OfferDto(
            String offerDescription,
            double offerPrice,
            String offerTitle,
            String offerContactPhone,
            int offerImportantScale,
            String offerAdvertiserName,
            OfferCategory offerCategory
    ) {
        this.offerDescription = offerDescription;
        this.offerPrice = offerPrice;
        this.offerTitle = offerTitle;
        this.offerContactPhone = offerContactPhone;
        this.offerImportantScale = offerImportantScale;
        this.offerAdvertiserName = offerAdvertiserName;
        this.offerCategory = offerCategory;
    }
}
