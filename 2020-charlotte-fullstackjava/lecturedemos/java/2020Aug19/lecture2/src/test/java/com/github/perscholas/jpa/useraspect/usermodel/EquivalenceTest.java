package com.github.perscholas.jpa.useraspect.usermodel;

import com.github.perscholas.model.User;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 8/19/2020.
 */
public class EquivalenceTest {
    @Test
    public void test() {
        // given
        String email = "leon@gmail.com";
        String name = "leon";
        String password = "chris";
        String address = "555 Milo Road";
        String state = "Delaware";
        String zip = "19901";
        User user1 = new User();
        User user2 = new User();
        
        // when
        user1.setId(email);
        user1.setName(name);
        user1.setPassword(password);
        user1.setAddress(address);
        user1.setState(state);
        user1.setZip(zip);

        user2.setId(email);
        user2.setName(name);
        user2.setPassword(password);
        user2.setAddress(address);
        user2.setState(state);
        user2.setZip(zip);

        // then
        Assert.assertEquals(user1, user2);
    }
}
