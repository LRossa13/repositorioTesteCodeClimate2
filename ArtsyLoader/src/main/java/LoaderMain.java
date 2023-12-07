import Utils.Utils;
import apiserviceartsy.ApiServiceArtsy;
import artsymodel.ArtsyArtist;
import artsymodel.ArtsyArtwork;
import artsymodel.ArtsyShow;
import com.google.gson.Gson;
import com.opencsv.exceptions.CsvException;
import dataprocessorservice.ArtistConverter;
import dataprocessorservice.DataProcessor;
import dataprocessorservice.ShowConverter;
import model.Artista;
import model.Evento;
import model.Pais;
import restapiservice.RestApiService;

import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static apiserviceartsy.ApiServiceArtsy.getAllArtsyItems;
import static controller.Controller.*;



public class LoaderMain {



    public static void main(String[] args) throws IOException, CsvException, InterruptedException {


         /*populateCidades();
         populatePaises();*/

         //populateMovimentos();
         //Thread.sleep(5000);*/
        // populateArtistas();
         //Thread.sleep(5000);



        List<ArtsyArtwork> artsyArtworkList = LoadArtsyArtworksList();




/*
        populateTecnicas(artsyArtworkList);
        populateMateriais(artsyArtworkList);
        populateObrasArte(artsyArtworkList);

        /*
        String ALL_ARTWORKS_ARTSY_URL = "https://api.artsy.net/api/artworks?size=1000&page=1";

        List<ArtsyArtwork> allArtsyArtworks= ApiServiceArtsy.getAllArtsyArtworks(ALL_ARTWORKS_ARTSY_URL);

        for (ArtsyArtwork artwork : allArtsyArtworks) {
            System.out.println("index: " + allArtsyArtworks.indexOf(artwork));
            System.out.println("Title: " + artwork.getTitle());
            System.out.println("Category: " + artwork.getCategory());
            System.out.println("Medium: " + artwork.getMedium());
            System.out.println("Date: " + artwork.getDate());
            System.out.println("Height: " + artwork.getHeight());
            System.out.println("Width: " + artwork.getWidth());
            System.out.println("Depth: " + artwork.getDepth());
            System.out.println("Diameter: " + artwork.getDiameter());
            System.out.println("Thumbnail Href: " + artwork.getThumbnailHref());
            System.out.println("Genes Href: " + artwork.getGenesHref());
            System.out.println("Artists Href: " + artwork.getArtistsHref());
            System.out.println();
        }*/

        //populateGalerias();
        //populateEventos();


    }



}






