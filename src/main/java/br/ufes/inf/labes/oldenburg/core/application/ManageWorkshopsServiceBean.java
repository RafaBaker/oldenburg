package br.ufes.inf.labes.oldenburg.core.application;

import br.ufes.inf.labes.jbutler.ejb.application.CrudServiceImpl;
import br.ufes.inf.labes.jbutler.ejb.persistence.BaseDAO;
import br.ufes.inf.labes.oldenburg.core.domain.Workshop;
import br.ufes.inf.labes.oldenburg.core.persistence.WorkshopDAO;
import jakarta.annotation.security.PermitAll;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;

@Stateless
@PermitAll
public class ManageWorkshopsServiceBean extends CrudServiceImpl<Workshop> implements ManageWorkshopsService {
    @EJB
    private WorkshopDAO workshopDAO;


    @Override
    public BaseDAO<Workshop> getDAO() {
        return this.workshopDAO;
    }
}
