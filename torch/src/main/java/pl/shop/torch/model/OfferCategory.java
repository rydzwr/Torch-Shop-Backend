package pl.shop.torch.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "offer_category")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OfferCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int offerCategoryId;

    @NotNull
    @NotBlank
    private String offerCategoryName;

    @OneToMany(mappedBy = "offerCategory")
    private List<Offer> offerList;
}
