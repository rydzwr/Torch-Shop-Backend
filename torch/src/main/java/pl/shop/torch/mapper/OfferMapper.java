package pl.shop.torch.mapper;

import org.springframework.stereotype.Service;
import pl.shop.torch.dto.OfferDto;
import pl.shop.torch.model.Offer;

@Service
public class OfferMapper {
    public Offer mapToOffer(OfferDto offerDto) {
        return new Offer(
                offerDto.getOfferDescription(),
                offerDto.getOfferPrice(),
                offerDto.getOfferTitle(),
                offerDto.getOfferContactPhone(),
                offerDto.getOfferImportantScale(),
                offerDto.getOfferAdvertiserName(),
                offerDto.getOfferCategory()
        );
    }

    public OfferDto mapToOfferDto(Offer offer) {
        return new OfferDto(
                offer.getOfferDescription(),
                offer.getOfferPrice(),
                offer.getOfferTitle(),
                offer.getOfferContactPhone(),
                offer.getOfferImportantScale(),
                offer.getOfferAdvertiserName(),
                offer.getOfferCategory()
        );
    }
}
