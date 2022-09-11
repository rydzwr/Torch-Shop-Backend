package pl.shop.torch.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "offer")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Offer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int offerId;

    @NotNull
    @NotBlank
    private Date offerPublicationDate;

    @NotNull
    @NotBlank
    private String offerDescription;

    @NotNull
    @NotBlank
    private double offerPrice;

    @NotNull
    @NotBlank
    private String offerTitle;

    @NotNull
    @NotBlank
    private String offerContactPhone;

    @NotBlank
    private int offerImportantScale;

    @NotNull
    @NotBlank
    private String offerAdvertiserName;

    @ManyToOne
    @JoinColumn(name = "category")
    private OfferCategory offerCategory;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @NotNull
    @NotBlank
    private int serialNumber;

    public Offer(
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
