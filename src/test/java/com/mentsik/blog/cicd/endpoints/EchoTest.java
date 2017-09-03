package com.mentsik.blog.cicd.endpoints;

import com.mentsik.blog.cicd.models.EchoReply;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EchoTest {

    @Test
    public void reply() throws Exception {
        EchoReply reply = new EchoReply("test");
        String expected = "test";
        assertEquals(expected,reply.getReply());
    }

}