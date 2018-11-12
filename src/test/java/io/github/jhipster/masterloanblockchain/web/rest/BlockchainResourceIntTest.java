package io.github.jhipster.masterloanblockchain.web.rest;

import io.github.jhipster.masterloanblockchain.MasterLoanBlockChainApp;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
/**
 * Test class for the BlockchainResource REST controller.
 *
 * @see BlockchainResource
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MasterLoanBlockChainApp.class)
public class BlockchainResourceIntTest {

    private MockMvc restMockMvc;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        BlockchainResource blockchainResource = new BlockchainResource();
        restMockMvc = MockMvcBuilders
            .standaloneSetup(blockchainResource)
            .build();
    }

    /**
    * Test obtainMessageBLock
    */
    @Test
    public void testObtainMessageBLock() throws Exception {
        restMockMvc.perform(get("/api/blockchain/obtain-message-b-lock"))
            .andExpect(status().isOk());
    }

}
