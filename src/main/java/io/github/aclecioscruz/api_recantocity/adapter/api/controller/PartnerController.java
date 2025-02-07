package io.github.aclecioscruz.api_recantocity.adapter.api.controller;

import io.github.aclecioscruz.api_recantocity.domain.partners.PartnerDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/partners")
public class PartnerController {

    private final static Logger LOG = LoggerFactory.getLogger(PartnerController.class);

    @GetMapping
    ResponseEntity<List<PartnerDTO>> getAllPartners() {
        List<PartnerDTO> partnerDTOList = List.of(new PartnerDTO(
                1L, "Meu Hamburguer", "(00) 00000-0000"));
        LOG.info("partner list {}", partnerDTOList);
        return ResponseEntity.ok().body(partnerDTOList);
    }
}
