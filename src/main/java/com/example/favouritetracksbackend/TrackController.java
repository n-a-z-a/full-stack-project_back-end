package com.example.favouritetracksbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class TrackController {




    @Autowired
    TrackRepository trackRepository;

    @CrossOrigin(origins  = {"http://localhost:3000"} )
    @GetMapping("/track")
    public String getTrack () {
        return "getting track";
    }

    @CrossOrigin(origins  = {"http://localhost:3000"} )
    @GetMapping("/tracks")
    public List<Track> getTracks () {
        return trackRepository.findAll();
    }

    @CrossOrigin(origins  = {"http://localhost:3000"} )
    @PostMapping("/tracks")
    public String addTrack (@RequestBody Track text) {
        this.trackRepository.save(text);
        System.out.println("Added " + text);
        return "Track saved okay";
    }

    @CrossOrigin(origins  = {"http://localhost:3000"} )
    @DeleteMapping("/tracks/{trackId}")
    @Transactional
    public String deleteTrack(@PathVariable int trackId) {
        System.out.println("track = " + trackId);
        int deleted = this.trackRepository.deleteTrackByTrackId(trackId);
        if (deleted > 0) {
            return "Track removed okay";
        }
        return "Track Id doesn't exist";
    }

}
