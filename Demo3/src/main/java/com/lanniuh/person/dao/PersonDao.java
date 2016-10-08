package com.lanniuh.person.dao;

import com.github.pagehelper.Page;
import com.lanniuh.person.entity.Person;

/**
 * Created by linjian
 * 16/8/11.
 */
public interface PersonDao {
    Page<Person> getPersonPaged();
}
