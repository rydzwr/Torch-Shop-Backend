package pl.shop.torch.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.shop.torch.model.OfferCategory;
import pl.shop.torch.repository.OfferCategoryRepository;

public interface SqlOfferCategoryRepository extends OfferCategoryRepository, JpaRepository<OfferCategory, Integer> {
}
