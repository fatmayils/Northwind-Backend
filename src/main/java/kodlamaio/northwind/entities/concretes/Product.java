package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private int id;

	// @Column(name="category_id")
	// private int categoryId;
	// join column kullandığımız için yukarda 2 satırı kullanmamıza gerek kalmadı

	@Column(name = "product_name")
	private String productName;

	@Column(name = "units_in_stock")
	private double unitsInStock;

	@Column(name = "quentity_per_unit")
	private String quantityPerUnit;

	@ManyToOne()
	@JoinColumn(name = "category_id")
	private Category category;
}
