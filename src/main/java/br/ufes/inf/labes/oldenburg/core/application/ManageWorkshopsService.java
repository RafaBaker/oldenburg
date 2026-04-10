package br.ufes.inf.labes.oldenburg.core.application;

import br.ufes.inf.labes.jbutler.ejb.application.CrudService;
import br.ufes.inf.labes.oldenburg.core.domain.Workshop;
import jakarta.ejb.Local;

@Local
public interface ManageWorkshopsService extends CrudService<Workshop> {
}
