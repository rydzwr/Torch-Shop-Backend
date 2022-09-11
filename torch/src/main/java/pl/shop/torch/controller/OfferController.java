package pl.shop.torch.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.shop.torch.dto.OfferDto;
import pl.shop.torch.service.OfferService;

@RestController
@RequestMapping("/offer")
public class OfferController {
    private final OfferService offerService;

    public OfferController(OfferService offerService) {
        this.offerService = offerService;
    }

    @PostMapping(value = "/addOffer")
    public ResponseEntity<Boolean> addNewOffer(@RequestBody OfferDto offerDto) {
        return ResponseEntity.ok(offerService.addNewOffer(offerDto));
    }
}
