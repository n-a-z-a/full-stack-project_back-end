package com.example.favouritetracksbackend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackRepository extends JpaRepository <Track, Integer> {
    int deleteTrackByTrackId(int trackId);
}
