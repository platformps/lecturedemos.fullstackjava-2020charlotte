package com.github.perscholas;

import com.github.perscholas.mutability.ImmutableMessage;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by leon on 8/6/2020.
 */
public class ImmutableMessageTest {
    @Test
    public void test() {
        // given
        ImmutableMessage mutableMessage = new ImmutableMessage("Subject Title", "Message Body", new HashMap<>());
        String representationOfKeysBeforePut = Arrays.asList(mutableMessage.getHeader().keySet()).toString();
        mutableMessage.getHeader().put("New Key", "New value");

        // when
        String representationOfKeysAfterPut = Arrays.asList(mutableMessage.getHeader().keySet()).toString();

        // then
        Assert.assertEquals(representationOfKeysBeforePut, representationOfKeysAfterPut);
    }
}
