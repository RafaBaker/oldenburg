package br.ufes.inf.labes.oldenburg.core.persistence;

import br.ufes.inf.labes.jbutler.ejb.persistence.BaseDAO;
import br.ufes.inf.labes.jbutler.ejb.persistence.PersistentObjectSupport;
import br.ufes.inf.labes.jbutler.ejb.persistence.exceptions.MultiplePersistentObjectsFoundException;
import br.ufes.inf.labes.jbutler.ejb.persistence.exceptions.PersistentObjectNotFoundException;
import br.ufes.inf.labes.oldenburg.core.domain.Workshop;
import jakarta.ejb.Local;

@Local
public interface WorkshopDAO extends BaseDAO<Workshop> {
    Workshop retrieveByAcronym(String acronym) throws PersistentObjectNotFoundException, MultiplePersistentObjectsFoundException;
}
