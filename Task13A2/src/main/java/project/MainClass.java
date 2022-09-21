package project;

import project.connector.ConnectionCreator;
import project.dao.*;
import project.entity.Actor;
import project.entity.Movie;
import project.entity.Producer;
import project.entity.VideoLibrary;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args)  {
//        VideoLibraryDaoImpl videoLibraryDao = new VideoLibraryDaoImpl();
//        videoLibraryDao.create(new VideoLibrary("The Man from Toronto", "Kevin Hart", "Todd Black"));

//        MovieDaoImpl movieDao = new MovieDaoImpl();
//        movieDao.create(new Movie(7, "The Man from Toronto", "Kevin Hart, Woody Harrelson", "2022", "USA"));

//        ActorDaoImpl actorDao = new ActorDaoImpl();
//        actorDao.create(new Actor(5, "Kevin Hart", "06.07.1979"));

//        ProducerDaoImpl producerDao = new ProducerDaoImpl();
//        producerDao.create(new Producer(5, "Todd Black", "09.02.1960"));

//        VideoLibraryDaoImpl videoLibraryDaoImpl = new VideoLibraryDaoImpl();
//        List<VideoLibrary> videoLibraries = videoLibraryDaoImpl.findAll();
//        System.out.println(videoLibraries);

//        ProducerDaoImpl producerDaoImpl = new ProducerDaoImpl();
//        List<Producer> producerList = producerDaoImpl.findAll();
//        System.out.println(producerList);

//        MovieDaoImpl movieDaoImpl = new MovieDaoImpl();
//        List<Movie> movieList = movieDaoImpl.findAll();
//        System.out.println(movieList);

//        ActorDaoImpl actorDaoImpl = new ActorDaoImpl();
//        List<Actor> actorList = actorDaoImpl.findAll();
//        System.out.println(actorList);

//        VideoLibraryDaoImpl videoLibraryDaoImpl = new VideoLibraryDaoImpl();
//        VideoLibrary videoLibrary = (VideoLibrary) videoLibraryDaoImpl.findById(2);
//        System.out.println(videoLibrary);

//        ProducerDaoImpl producerDaoImpl = new ProducerDaoImpl();
//        Producer producer = (Producer) producerDaoImpl.findById(3);
//        System.out.println(producer);

//        MovieDaoImpl movieDaoImpl = new MovieDaoImpl();
//        Movie movie = (Movie) movieDaoImpl.findById(3);
//        System.out.println(movie);

//        ActorDaoImpl actorDaoImpl = new ActorDaoImpl();
//        Actor actor = (Actor) actorDaoImpl.findById(4);
//        System.out.println(actor);

//        VideoLibraryDaoImpl videoLibraryDao = new VideoLibraryDaoImpl();
//        VideoLibrary videoLibrary = new VideoLibrary(4, "Fury", "Brad Pitt", "Bill Block");
//        VideoLibrary videoLibrary1 = (VideoLibrary) videoLibraryDao.update(videoLibrary);
//        System.out.println(videoLibrary1);

//        ProducerDaoImpl producerDaoImpl = new ProducerDaoImpl();
//        Producer producer = new Producer(3, "David Fincher", "28.08.1962");
//        Producer producer1 = (Producer) producerDaoImpl.update(producer);
//        System.out.println(producer1);

//        MovieDaoImpl movieDaoImpl = new MovieDaoImpl();
//        Movie movie = new Movie(4, "Fury", "Brad Pitt, Shia LaBeouf", "2014", "USA");
//        Movie movie1 = (Movie) movieDaoImpl.update(movie);
//        System.out.println(movie1);

//        ActorDaoImpl actorDaoImpl = new ActorDaoImpl();
//        Actor actor = new Actor(4, "Tom Holland", "01.06.1996");
//        Actor actor1 = (Actor) actorDaoImpl.update(actor);
//        System.out.println(actor1);

//        VideoLibraryDaoImpl videoLibraryDaoImpl = new VideoLibraryDaoImpl();
//        boolean flag = videoLibraryDaoImpl.delete(10);
//        System.out.println(flag);

//        MovieDaoImpl movieDaoImpl = new MovieDaoImpl();
//        List<Movie> movieList = movieDaoImpl.getNewMovies("2022", "2021");
//        System.out.println(movieList);

//        ActorDaoImpl actorDaoImpl = new ActorDaoImpl();
//        Actor actor = actorDaoImpl.getActorInfoFromMovie("1+1");
//        System.out.println(actor);

        ProducerDaoImpl producerDaoImpl = new ProducerDaoImpl();
        List<Producer> producerList = producerDaoImpl.getActorWhoAreProducer();
        System.out.println(producerList);
    }
}
