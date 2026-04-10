package br.ufes.inf.labes.oldenburg.core.controller;

import br.ufes.inf.labes.jbutler.ejb.application.CrudService;
import br.ufes.inf.labes.jbutler.ejb.controller.CrudController;
import br.ufes.inf.labes.oldenburg.core.application.ManageWorkshopsService;
import br.ufes.inf.labes.oldenburg.core.domain.Workshop;
import jakarta.ejb.EJB;
import jakarta.inject.Named;
import org.omnifaces.cdi.ViewScoped;

@Named
@ViewScoped
public class ManageWorkshopsController extends CrudController<Workshop> {
    @EJB
    private ManageWorkshopsService manageWorkshopsService;

    @Override
    protected CrudService<Workshop> getCrudService() {
        return manageWorkshopsService;
    }
}
