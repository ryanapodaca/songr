package com.spacesongr.songr.Repository;

import com.spacesongr.songr.models.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
    public Song findByTitle(String title);

}
