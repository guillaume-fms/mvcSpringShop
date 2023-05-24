package fr.fms;

import java.util.logging.Logger;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import fr.fms.dao.ArticleRepository;
import fr.fms.entities.Article;


@SpringBootApplication
public class MvcSpringStockApplication implements CommandLineRunner {
	@Autowired
	ArticleRepository articleRepository;


	public static void main(String[] args) {
		SpringApplication.run(MvcSpringStockApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello My CommandLineRunner !!");




		// generate Datas articles
		//articleRepository.save(new Article(null,"Samsung S8", 350));
		//articleRepository.save(new Article(null,"Samsung S10", 550));
		//articleRepository.save(new Article(null,"Apple iPhone 14", 1250));
		//articleRepository.save(new Article(null,"Google Pixel 7a", 550));
		//articleRepository.save(new Article(null,"Xiaomi Mi 11", 480));
		//articleRepository.save(new Article(null,"Nokia Xr 21",599));


		// display articles console
		articleRepository.findAll().forEach(a -> System.out.println(a));




	}

}	

