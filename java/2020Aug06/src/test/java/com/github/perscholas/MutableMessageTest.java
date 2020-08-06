package com.github.perscholas;

import com.github.perscholas.mutability.MutableMessage;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by leon on 8/6/2020.
 */
public class MutableMessageTest {
    @Test
    public void test() {
        // given
        MutableMessage mutableMessage = new MutableMessage("Subject Title", "Message Body", new HashMap<>());
        String representationOfKeysBeforePut = Arrays.asList(mutableMessage.getHeader().keySet()).toString();
        mutableMessage.getHeader().put("New Key", "New value");

        // when
        String representationOfKeysAfterPut = Arrays.asList(mutableMessage.getHeader().keySet()).toString();

        // then
        Assert.assertEquals(representationOfKeysBeforePut, representationOfKeysAfterPut);
    }
}
