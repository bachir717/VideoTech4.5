package fr.ensup.videotech4.dao;

import fr.ensup.videotech4.domaine.Video;

import java.util.List;

public interface IDao {
    Video getVideoById(int id);

    void createVideo(Video video);

    Video updateVideo(Video video);

    void deleteVideo(Video video);

    List<Video> getAllVideo();
}
