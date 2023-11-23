package edu.cetys.financeatfreddysserver.dao.Entidad;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "categories", schema = "public")
public class CategoriesEntity implements Serializable {

    @Id
    @GeneratedValue(generator = "category_id", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "category_id", sequenceName = "category_id_seq", initialValue = 1, allocationSize = 1)

    @Column(name = "category_id", columnDefinition = "serial")
    private Integer categoryId;

    @Column(name = "category_name")
    private String categoryName;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "categoriesEntity [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
    }

}
