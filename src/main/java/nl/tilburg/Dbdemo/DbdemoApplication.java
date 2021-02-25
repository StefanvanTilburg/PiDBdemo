package nl.tilburg.Dbdemo;

import nl.tilburg.Dbdemo.model.Name;
import nl.tilburg.Dbdemo.repository.NameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbdemoApplication implements CommandLineRunner {

	private NameRepository nameRepository;

	@Autowired
	public DbdemoApplication(NameRepository nameRepository) {
		this.nameRepository = nameRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(DbdemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		nameRepository.save(new Name("Pietje"));
		nameRepository.save(new Name("Annabel"));
	}
}
