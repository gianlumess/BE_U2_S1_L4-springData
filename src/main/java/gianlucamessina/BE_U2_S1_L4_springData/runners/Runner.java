package gianlucamessina.BE_U2_S1_L4_springData.runners;

import gianlucamessina.BE_U2_S1_L4_springData.BeU2S1L4SpringDataApplication;
import gianlucamessina.BE_U2_S1_L4_springData.entities.Bevanda;
import gianlucamessina.BE_U2_S1_L4_springData.entities.Topping;
import gianlucamessina.BE_U2_S1_L4_springData.services.BevandaService;
import gianlucamessina.BE_U2_S1_L4_springData.services.ToppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    private BevandaService bevandaService;
    @Autowired
    private ToppingService toppingService;


    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeU2S1L4SpringDataApplication.class);

        Bevanda cocaCola = context.getBean("cocaColaBevanda", Bevanda.class);
        Bevanda acquaNaturale = context.getBean("acquaNaturaleBevanda", Bevanda.class);
        //bevandaService.saveDrink(cocaCola);
        //bevandaService.saveDrink(acquaNaturale);

        Topping crudo = context.getBean("crudoTopping", Topping.class);
        toppingService.saveTopping(crudo);
    }
}
