package com.aws.dev.business;

import java.util.List;

import com.aws.dev.dao.GetAwsUsersDao;
import com.aws.dev.domain.User;

public class UserBusiness {

	public List<User> getAwsUsers() {
		GetAwsUsersDao getAwsUsers = new GetAwsUsersDao();

		return getAwsUsers.getAwsUsers();
	}

	public User getAwsUser(String fname) {
		GetAwsUsersDao getAwsUser = new GetAwsUsersDao();

		return getAwsUser.getAwsUser(fname);
	}
}
