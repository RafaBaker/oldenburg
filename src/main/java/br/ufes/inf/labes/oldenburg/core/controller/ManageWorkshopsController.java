package br.ufes.inf.labes.oldenburg.core.controller;

import br.ufes.inf.labes.jbutler.ejb.application.CrudService;
import br.ufes.inf.labes.jbutler.ejb.controller.CrudController;
import br.ufes.inf.labes.oldenburg.core.application.ManageWorkshopsService;
import br.ufes.inf.labes.oldenburg.core.domain.Workshop;
import jakarta.ejb.EJB;
import jakarta.faces.application.FacesMessage;
import jakarta.inject.Named;
import org.omnifaces.cdi.ViewScoped;

import java.time.LocalDate;
import java.util.Random;

@Named
@ViewScoped
public class ManageWorkshopsController extends CrudController<Workshop> {
    @EJB
    private ManageWorkshopsService manageWorkshopsService;

    @Override
    protected CrudService<Workshop> getCrudService() {
        return manageWorkshopsService;
    }

    public void createRandomObjects(Integer quantity)
    {
        if (quantity == null)
            return;

        Random random = new Random(System.currentTimeMillis());

        for (int i = 0; i < quantity; i++) {
            int num = random.nextInt(1000);
            Workshop obj = new Workshop();
//            obj.setMyBoolean(num % 2 == 0);
//            obj.setMyDate(LocalDate.now().plusDays(num));
//            obj.setMyNumber(num);
//            obj.setMyString("Random Object #" + num);
            obj.setAcronym("FLA");
            obj.setName("Testando #" + num);
            obj.setYear(2025);
            obj.setReviewDeadline(LocalDate.now().plusDays(num));
            obj.setSubmissionDeadline(LocalDate.now().plusDays(num+5));

            manageWorkshopsService.create(obj);

            // If using regular listing, add the new object to the list.
            if (entities != null)
                entities.add(obj);
        }

        if (entities == null)
            reloadLazyCount();

        addGlobalI18nMessage("msgsCore", FacesMessage.SEVERITY_INFO,
                "manageWorkshops.text.createRandomObjects.info.summary",
                "manageWorkshops.text.createRandomObjects.info.detail");
    }
}
