package gianlucamessina.BE_U2_S1_L4_springData.runners;

import gianlucamessina.BE_U2_S1_L4_springData.BeU2S1L4SpringDataApplication;
import gianlucamessina.BE_U2_S1_L4_springData.entities.Bevanda;
import gianlucamessina.BE_U2_S1_L4_springData.entities.Pizza;
import gianlucamessina.BE_U2_S1_L4_springData.entities.Topping;
import gianlucamessina.BE_U2_S1_L4_springData.services.AlimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    AlimentoService alimentoService;

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeU2S1L4SpringDataApplication.class);

        Bevanda acquaFrizzante = context.getBean("acquaFrizzanteBevanda", Bevanda.class);
        Bevanda acquaNaturale = context.getBean("acquaNaturaleBevanda", Bevanda.class);
        Bevanda cocaCola = context.getBean("cocaColaBevanda", Bevanda.class);
        Bevanda cocaColaZero = context.getBean("cocaColaZeroBevanda", Bevanda.class);

        Topping pomodoro = context.getBean("pomodoroTopping", Topping.class);
        Topping mozzarella = context.getBean("mozzarellaTopping", Topping.class);
        Topping crudo = context.getBean("crudoTopping", Topping.class);
        Topping burrata = context.getBean("burrataTopping", Topping.class);
        Topping cipolla = context.getBean("cipollaTopping", Topping.class);
        Topping salamePiccante = context.getBean("salamePiccanteTopping", Topping.class);

        Pizza margherita = context.getBean("margherita", Pizza.class);
        Pizza diavola = context.getBean("diavola", Pizza.class);
        Pizza sanDaniele = context.getBean("sanDaniele", Pizza.class);

       /* try {
            //*********** SAVE BEVANDE ***************
            alimentoService.saveAlimento(cocaColaZero);
            alimentoService.saveAlimento(cocaCola);
            alimentoService.saveAlimento(acquaNaturale);
            alimentoService.saveAlimento(acquaFrizzante);
            //*********** SAVE TOPPINGS ***************
            alimentoService.saveAlimento(pomodoro);
            alimentoService.saveAlimento(mozzarella);
            alimentoService.saveAlimento(crudo);
            alimentoService.saveAlimento(burrata);
            alimentoService.saveAlimento(cipolla);
            alimentoService.saveAlimento(salamePiccante);
            //*********** SAVE PIZZE ***************
            alimentoService.saveAlimento(margherita);
            alimentoService.saveAlimento(diavola);
            alimentoService.saveAlimento(sanDaniele);
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }*/

        //********************** QUERIES **************************

        alimentoService.getBevande0Calories().forEach(System.out::println);
    }
}
