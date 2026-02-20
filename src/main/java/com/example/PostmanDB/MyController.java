package com.example.PostmanDB;
import java.util.List;
import org.hibernate.annotations.TargetEmbeddable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/product")
public class MyController {
	@Autowired
	ProductRepo repo;
	@GetMapping
	public List<Product> fetchData()
	{
		List<Product> products =repo.findAll();
		System.out.println(products);
		return products;
	}
}
