package com.webhuyk3.entitys;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name =  "categoryName")
    private String categoryName;
    @Column(name = "categoryStatus")
    private Boolean categoryStatus;
    @Column(name = "categoryAmount")
    private int categoryAmount;

    public Category() {
        // TODO Auto-generated constructor stub
    }

    public Category(Integer id, String categoryName, Boolean categoryStatus, int categoryAmount) {
        super();
        this.id = id;
        this.categoryName = categoryName;
        this.categoryStatus = categoryStatus;
        this.categoryAmount = categoryAmount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Boolean getCategoryStatus() {
        return categoryStatus;
    }

    public void setCategoryStatus(Boolean categoryStatus) {
        this.categoryStatus = categoryStatus;
    }

    public int getCategoryAmount() {
        return categoryAmount;
    }
     public void setCategoryAmount(int categoryAmount) {
        this.categoryAmount = categoryAmount;
     }


}