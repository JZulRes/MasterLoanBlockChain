package io.github.jhipster.masterloanblockchain.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * BlockchainResource controller
 */
@RestController
@RequestMapping("/api/blockchain")
public class BlockchainResource {

    private final Logger log = LoggerFactory.getLogger(BlockchainResource.class);

    /**
    * GET obtainMessageBLock
    */
    @GetMapping("/obtain-message-b-lock")
    public String obtainMessageBLock() {
        return "obtainMessageBLock";
    }

}
