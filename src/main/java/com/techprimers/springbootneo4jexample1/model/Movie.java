package com.techprimers.springbootneo4jexample1.model;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Movie {
    @Id
    private Long id;
    private String title;
    private String tagline;


    public Movie() {
    }

    public Long getId() {

        return id;
    }

    public String getTitle() {

        return title;
    }

    public String getDirector() {

        return tagline;
    }


}
