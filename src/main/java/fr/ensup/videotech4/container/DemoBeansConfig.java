package fr.ensup.videotech4.container;
import fr.ensup.videotech4.dao.VideoDao;
import fr.ensup.videotech4.dao.VideoDaoJpa;
import fr.ensup.videotech4.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
public class DemoBeansConfig {
    @Autowired
    private VideoDao videoDao;

    @Bean(initMethod = "initialisation", destroyMethod = "destruction")
    public VideoService videoService() {
        return new VideoService(videoDao);
    }
    @Bean(initMethod = "initialisation", destroyMethod = "destruction")
    public VideoDao videoDao() {
       return new VideoDao();
    }
}