package io.pivotal.workshops.cnd.configserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner loadDatabase(FortuneRepository fortuneRepo) {
		return args -> {
			LOGGER.debug("Bootstrapping database...");
			fortuneRepo.save(new Fortune("Do what works."));
			fortuneRepo.save(new Fortune("Do the right thing."));
			fortuneRepo.save(new Fortune("Always be kind."));
			fortuneRepo.save(new Fortune("You learn from your mistakes... You will learn a lot today."));
			fortuneRepo.save(new Fortune("You can always find happiness at work on Friday."));
			fortuneRepo.save(new Fortune("You will be hungry again in one hour."));
			fortuneRepo.save(new Fortune("Today will be an awesome day!"));
			LOGGER.info("Fortune Repo record count: {}", fortuneRepo.count());
			fortuneRepo.findAll().forEach(x -> LOGGER.debug(x.toString()));
		};

	}
}
