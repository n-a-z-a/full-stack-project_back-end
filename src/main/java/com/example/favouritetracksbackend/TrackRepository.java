package com.example.favouritetracksbackend;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackRepository extends JpaRepository <Track, Integer> {
    int deleteTrackByTrackId(int trackId);
}
