package org.pavlov.matrixserver.repository.jpa;

import org.pavlov.matrixserver.domain.tech.TechObject;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Василий on 25.04.2015.
 */
@Repository
@Transactional(propagation = Propagation.REQUIRED)
public class JpaTechObjectRepository implements TechObjectRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void addTechObject(TechObject techObject) {
        em.persist(techObject);
    }
}
