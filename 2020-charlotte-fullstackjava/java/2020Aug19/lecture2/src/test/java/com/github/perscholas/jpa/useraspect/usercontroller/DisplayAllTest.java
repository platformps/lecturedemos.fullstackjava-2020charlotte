package com.github.perscholas.jpa.useraspect.usercontroller;

import com.github.perscholas.DatabaseConnection;
import com.github.perscholas.config.JpaConfigurator;
import com.github.perscholas.controllers.UserController;
import com.github.perscholas.dao.UserJpaRepository;
import com.github.perscholas.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 8/19/2020.
 */
public class DisplayAllTest {

    @Before
    public void setup() {
        // given
        DatabaseConnection.TESTING_DATABASE.drop(); // TODO - configure in `persistence.xml`
        DatabaseConnection.TESTING_DATABASE.create(); // TODO - configure in `persistence.xml`
        JpaConfigurator configurator = new JpaConfigurator("production");
        configurator.appendSqlScript("user_create-table.sql");
        configurator.appendSqlScript("user_populate-table.sql");
        configurator.initialize();
    }

    @Test
    public void test() {
        // given
        UserController controller = new UserController(new UserService(new UserJpaRepository("production")));

        // when
        controller.displayAll();
    }
}
