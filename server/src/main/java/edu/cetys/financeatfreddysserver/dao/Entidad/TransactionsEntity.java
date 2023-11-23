package edu.cetys.financeatfreddysserver.dao.Entidad;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "transactions", schema = "public")
public class TransactionsEntity implements Serializable {

    @Id
    @GeneratedValue(generator = "transaction_id", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "transaction_id", sequenceName = "transaction_id_seq", initialValue = 1, allocationSize = 1)
    @Column(name = "transaction_id", columnDefinition = "serial")
    private Integer transactionId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private CategoriesEntity category;

    @Column(name = "amount")
    private double amount;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "description")
    private String description;

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public CategoriesEntity getCategory() {
        return category;
    }

    public void setCategory(CategoriesEntity category) {
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String toString() {
        return "TransactionsEntity [transactionId=" + transactionId + ", user=" + user + ", category=" + category
                + ", amount=" + amount + ", date=" + date + ", description=" + description + "]";
    }
    
}


