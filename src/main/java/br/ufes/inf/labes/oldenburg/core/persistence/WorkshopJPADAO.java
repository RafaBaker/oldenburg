package br.ufes.inf.labes.oldenburg.core.persistence;

import br.ufes.inf.labes.jbutler.ejb.persistence.BaseJPADAO;
import br.ufes.inf.labes.oldenburg.core.domain.Workshop;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class WorkshopJPADAO extends BaseJPADAO<Workshop> implements WorkshopDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    protected EntityManager getEntityManager() {
        return this.entityManager;
    }
}
