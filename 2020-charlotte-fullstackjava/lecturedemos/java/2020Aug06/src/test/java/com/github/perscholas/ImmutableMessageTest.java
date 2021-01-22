package com.github.perscholas;

import com.github.perscholas.mutability.AllegedImmutableMessage;
import com.github.perscholas.mutability.CovingtonImmutableMessage;
import com.github.perscholas.mutability.ImmutableMessageInterface;
import com.github.perscholas.mutability.PrototypicalImmutableMessage;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by leon on 8/6/2020.
 */
public class ImmutableMessageTest {
    private void test(ImmutableMessageInterface mutableMessage) {
        // given
        String representationOfKeysBeforePut = Arrays.asList(mutableMessage.getHeader().keySet()).toString();
        mutableMessage.getHeader().put("New Key", "New value");

        // when
        String representationOfKeysAfterPut = Arrays.asList(mutableMessage.getHeader().keySet()).toString();

        // then
        Assert.assertEquals(representationOfKeysBeforePut, representationOfKeysAfterPut);
    }

    @Test
    public void testPrototypicalImmutableMessage() {
        test(new PrototypicalImmutableMessage("Subject Title", "Message Body", new HashMap<>()));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCovingtonImmutableMessage() {
        test(new CovingtonImmutableMessage("Subject Title", "Message Body", new HashMap<>()));
    }

    @Test
    public void testAllegedImmutableMessage() {
        test(new AllegedImmutableMessage("Subject Title", "Message Body", new HashMap<>()));
    }

}
