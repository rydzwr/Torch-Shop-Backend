package pl.shop.torch.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.shop.torch.dto.OfferDto;
import pl.shop.torch.mapper.OfferMapper;
import pl.shop.torch.model.Offer;
import pl.shop.torch.repository.OfferRepository;

@Service
@Transactional
public class OfferService {
    private final OfferRepository offerRepository;
    private final OfferMapper offerMapper;

    public OfferService(OfferRepository offerRepository, OfferMapper offerMapper) {
        this.offerRepository = offerRepository;
        this.offerMapper = offerMapper;
    }

    public boolean addNewOffer(OfferDto offerDto) {
        Offer newOffer = offerMapper.mapToOffer(offerDto);
        newOffer.setSerialNumber(SerialNumberGenerator.generate(newOffer));
        offerRepository.save(newOffer);

        return offerRepository.existsBySerialNumber(newOffer.getSerialNumber());
    }
}
