package br.ufes.inf.labes.oldenburg.core.persistence;

import br.ufes.inf.labes.jbutler.ejb.persistence.BaseJPADAO;
import br.ufes.inf.labes.jbutler.ejb.persistence.exceptions.MultiplePersistentObjectsFoundException;
import br.ufes.inf.labes.jbutler.ejb.persistence.exceptions.PersistentObjectNotFoundException;
import br.ufes.inf.labes.oldenburg.core.domain.Workshop;
import br.ufes.inf.labes.oldenburg.core.domain.Workshop_;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

@Stateless
public class WorkshopJPADAO extends BaseJPADAO<Workshop> implements WorkshopDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    protected EntityManager getEntityManager() {
        return this.entityManager;
    }

    @Override
    public Workshop retrieveByAcronym(String acronym) throws PersistentObjectNotFoundException, MultiplePersistentObjectsFoundException {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Workshop> cq = cb.createQuery(Workshop.class);
        Root<Workshop> root = cq.from(Workshop.class);

        cq.where(cb.equal(root.get(Workshop_.acronym), acronym));
        Workshop result = executeSingleResultQuery(cq, acronym);
        return result;
    }
}
