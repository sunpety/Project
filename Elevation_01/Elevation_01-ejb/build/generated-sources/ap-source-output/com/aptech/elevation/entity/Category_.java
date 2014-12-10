package com.aptech.elevation.entity;

import com.aptech.elevation.entity.Category;
import com.aptech.elevation.entity.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-10T10:39:56")
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile SingularAttribute<Category, String> categoryImage;
    public static volatile ListAttribute<Category, Category> categoryList;
    public static volatile SingularAttribute<Category, Category> categoryParent;
    public static volatile SingularAttribute<Category, String> categoryName;
    public static volatile SingularAttribute<Category, Integer> categoryId;
    public static volatile ListAttribute<Category, Product> productList;
    public static volatile SingularAttribute<Category, String> categoryDescription;

}