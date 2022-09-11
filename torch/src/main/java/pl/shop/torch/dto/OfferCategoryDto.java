package pl.shop.torch.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.shop.torch.model.Offer;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OfferCategoryDto {
    private int offerCategoryId;
    private String offerCategoryName;
    private List<Offer> offerList;
}
