package CMV.StoreProject.entities.concretes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "brands")
@AllArgsConstructor
@NoArgsConstructor
public class Brand {
	
    public Brand(String brandName) {
        this.brandName = brandName;
    }

    public Brand(int id) {
        this.id = id;
    }

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "brand_name")
	private String brandName;

	@OneToMany(mappedBy = "brand", cascade = CascadeType.ALL)
	private List<Product> products;

}
