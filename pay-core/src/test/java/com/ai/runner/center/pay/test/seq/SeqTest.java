package com.ai.runner.center.pay.test.seq;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.opt.sdk.components.sequence.util.SeqUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class SeqTest {
    
    private static final Log LOG = LogFactory.getLog(SeqTest.class);

    @Test
    public void testdbsseq() {
        LOG.info("start seq test...");
        LOG.info("seq1:" + SeqUtil.getNewId("PAY_CENTER_LOG$PAY_ID$SEQ"));
        LOG.info("seq2:" + SeqUtil.getNewId("PAY_CENTER_LOG$PAY_ID$SEQ"));
        LOG.info("seq3:" + SeqUtil.getNewId("PAY_CENTER_LOG$PAY_ID$SEQ", 10));
        LOG.info("end seq test...");
    }
    
}
