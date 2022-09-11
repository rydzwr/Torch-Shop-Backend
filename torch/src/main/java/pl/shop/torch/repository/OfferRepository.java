package pl.shop.torch.repository;

import pl.shop.torch.model.Offer;

public interface OfferRepository {
    Offer save(Offer offer);
    boolean existsBySerialNumber(int serialNumber);
}
