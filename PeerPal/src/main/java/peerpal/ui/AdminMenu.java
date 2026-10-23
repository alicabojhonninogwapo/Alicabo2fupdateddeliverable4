package peerpal.ui;

import peerpal.dao.UserDao;
import peerpal.model.User;

import java.util.Scanner;

/**
 * Dashboard shown to users with the ADMIN role after successful login.
 */
public class AdminMenu extends RoleMenu {

    public AdminMenu(User user, Scanner scanner, UserDao userDao) {
        super(user, scanner, userDao);
    }

    @Override
    protected String title() {
        return "Admin";
    }
}
