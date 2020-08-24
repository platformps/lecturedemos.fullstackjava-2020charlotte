package com.github.perscholas.jpa.useraspect.userrepository;

import com.github.perscholas.DatabaseConnection;
import com.github.perscholas.config.JpaConfigurator;
import com.github.perscholas.dao.PersonJpaRepository;
import com.github.perscholas.dao.RepositoryInterface;
import com.github.perscholas.dao.UserJpaRepository;
import com.github.perscholas.model.Person;
import com.github.perscholas.model.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by leon on 8/19/2020.
 */
public class FindAllTest {

    @Before
    public void setup() {
        // given
        DatabaseConnection.PRODUCTION_DATABASE.drop(); // TODO - configure in `persistence.xml`
        DatabaseConnection.PRODUCTION_DATABASE.create(); // TODO - configure in `persistence.xml`
        JpaConfigurator configurator = new JpaConfigurator("production");
        configurator.appendSqlScript("user_create-table.sql");
        configurator.appendSqlScript("user_populate-table.sql");
        configurator.initialize();
    }

    @Test
    public void test() {
        // given
        RepositoryInterface<String, User> repository = new UserJpaRepository("production");

        // when
        List<User> userList = repository.findAll();

        // then
        Assert.assertFalse(userList.isEmpty());
    }
}
