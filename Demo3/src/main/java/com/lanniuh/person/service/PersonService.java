package com.lanniuh.person.service;

import com.github.pagehelper.Page;
import com.lanniuh.person.entity.Person;

/**
 * Created by linjian
 * 16/8/11.
 */
public interface PersonService {
    Page<Person> getPersonPaged();
}
