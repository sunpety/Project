/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.elevation.entity.session;

import com.aptech.elevation.entity.News;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author NeedMoney
 */
@Local
public interface NewsFacadeLocal {

    void create(News news);

    void edit(News news);

    void remove(News news);

    News find(Object id);

    List<News> findAll();

    List<News> findRange(int[] range);

    int count();

    List<News> DisplayProject_ByType();

    List<News> FindAll_ByType(int type);

    List<News> FindNew_ById(int new_id);
    
}
