package pl.shop.torch.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.shop.torch.model.Offer;
import pl.shop.torch.repository.OfferRepository;

public interface SqlOfferRepository extends OfferRepository, JpaRepository<Offer, Integer> {
}
