package edu.cetys.financeatfreddysserver.dao.Entidad;

import java.io.Serializable;

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
@Table(name = "budgets", schema = "public")
public class BudgetsEntity implements Serializable {

    @Id
    @GeneratedValue(generator = "transaction_id", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "transaction_id", sequenceName = "transaction_id_seq", initialValue = 1, allocationSize = 1)
    @Column(name = "transaction_id", columnDefinition = "serial")
    private Integer budgetId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private UserEntity user;

    @Column(name = "general_budget")
    private double generalBudget;

    @Column(name = "self_imposed_budget")
    private double selfImposedBudget;

    public Integer getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(Integer budgetId) {
        this.budgetId = budgetId;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public double getGeneralBudget() {
        return generalBudget;
    }

    public void setGeneralBudget(double generalBudget) {
        this.generalBudget = generalBudget;
    }

    public double getSelfImposedBudget() {
        return selfImposedBudget;
    }

    public void setSelfImposedBudget(double selfImposedBudget) {
        this.selfImposedBudget = selfImposedBudget;
    }

    @Override
    public String toString() {
        return "BudgetsEntity [budgetId=" + budgetId + ", user=" + user + ", generalBudget=" + generalBudget
                + ", selfImposedBudget=" + selfImposedBudget + "]";
    }

}
