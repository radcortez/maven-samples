package com.radcortez.maven.jarinbuld;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.openjpa.persistence.EntityManagerImpl;

import javax.persistence.EntityManager;

/**
 * @author Roberto Cortez
 */
public class UseDependency {
    public static void startOpenJPA() {
        final EntityManager entityManager = new EntityManagerImpl();

        StringUtils.upperCase("x");
    }

    public static void reflection() throws Exception {
        Class.forName("org.apache.openjpa.persistence.EntityManagerImpl");
    }
}
