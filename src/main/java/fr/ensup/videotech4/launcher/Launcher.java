package fr.ensup.videotech4.launcher;
import fr.ensup.videotech4.container.DemoBeansConfig;
import fr.ensup.videotech4.domaine.Video;
import fr.ensup.videotech4.service.VideoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher {
    public static void main(String[] args) {

        // 1. Chargement du conteneur  en 4.0.0 Spring
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoBeansConfig.class);

        // 2. Recuperation d'un bean du conteneur
        VideoService videoService = (VideoService) applicationContext.getBean("videoService");

        // 3. Manipulation du bean avec injection de dependances
        Video v1 = new Video(1, "Ville nouvelle", "Documentaire", "3", "20/30/2020");
        videoService.creerCompte(v1);

        Video v2 = videoService.recuperationCompte(2);
        if (v2 != null) {
            System.out.println("LAUNCHER: R�cuperation de la video r�ussie " + v2.toString());
        } else {
            System.out.println("LAUNCHER: R�cuperation dela video �chou�e");
        }
       // applicationContext.close();

    }
}
