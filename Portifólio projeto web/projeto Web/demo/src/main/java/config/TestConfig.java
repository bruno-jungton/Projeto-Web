package config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import repositories.UserRepository;
import resource.User;

public class TestConfig implements CommandLineRunner{

	private final UserRepository userRepository;
	
	public TestConfig(UserRepository userRepository) {
		this.userRepository = userRepository;
    }
	
	public void run(String... args) throws Exception {
        // Criar e salvar usuários no banco de dados
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
        userRepository.saveAll(Arrays.asList(u1, u2));
    }
	
    public void run(String... args) throws Exception {
    	
    }
}
