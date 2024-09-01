package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
public class StubSpeakerRepositoryImpl implements SpeakerRepository {

    private Calendar cal;

    @Autowired
    public void setCal(Calendar cal) {
        this.cal = cal;
    }

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Big");
        speaker.setLastName("Bird");

        System.out.println("cal: " + cal.getTime());

        speakers.add(speaker);

        return speakers;
    }
}
