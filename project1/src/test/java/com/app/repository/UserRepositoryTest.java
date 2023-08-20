package com.app.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.app.entities.User;

@DataJpaTest // Spring boot supplied annotation for testing ONLY
//DAO layer
@AutoConfigureTestDatabase(replace = Replace.NONE) // To tell
//Spring boot not to replace the original DB , configured in app propeties
@Rollback(false)
class UserRepositoryTest {
	@Autowired
	private UserRepository userRepo;

	@Test
	void testSaveAllEmps() {
		// String firstName, String lastName, String email, String password,
		// LocalDate joinDate, double salary,
		// String location, String department
		List<User> list = List.of(
				new User("Aniket", "ani@gmail.com", "1234", "Sector 29,Ravet,Pune"),
				new User("Bhagyesh", "bhagyesh@gmail.com", "12345", "Nagar,Nigdi,Pune"),
				new User("Sahil", "sahil@gmail.com", "123", "Digori,Nagpur"),
				new User("Abhishek", "abhi@gmail.com", "123456", "Bharat Nagar, Nagpur"));
		List<User> list2 = userRepo.saveAll(list);
		assertEquals(4, list2.size());

	}

}
