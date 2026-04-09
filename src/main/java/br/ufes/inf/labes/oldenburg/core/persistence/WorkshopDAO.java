package br.ufes.inf.labes.oldenburg.core.persistence;

import br.ufes.inf.labes.jbutler.ejb.persistence.BaseDAO;
import br.ufes.inf.labes.oldenburg.core.domain.Workshop;
import jakarta.ejb.Local;

@Local
public interface WorkshopDAO extends BaseDAO<Workshop> {
}
