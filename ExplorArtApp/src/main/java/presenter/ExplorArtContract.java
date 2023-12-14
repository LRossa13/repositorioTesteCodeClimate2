package presenter;

import model.*;

import java.io.IOException;
import java.util.List;


// Interfaces (no pacote presenter)
public interface ExplorArtContract {

    interface View {
        void showArtists(List<Artista> artistas);
        void showArtistDetails(Artista artista);

        void showArtworks(List<Obra_Arte> obras);

        void showEvents(List<Evento> eventos);

        void showGalleries(List<Galeria> galerias);

        void showGallerists(List<Galerista> galeristas);

        void showShowsDetails(Evento evento, Galeria galeria);

        void showArtworkDetails(Obra_Arte obraArte, Artista artista, Tecnica tecnica, Movimento movimento, Materiais material);

        void showAddArtworkForm(Obra_Arte obraArte);

        void showAddArtistForm(Artista artista);

        void showAddShowForm(Evento evento);

    }

    interface Presenter {
        void exploreArtists() throws IOException;
        void addArtist(Artista artista) throws IOException;
        void updateArtist();
        void removeArtist();
        //OrbaArte
        void exploreArtworks() throws IOException;
        void addArtwork(Obra_Arte obraArte) throws IOException;
        void ativateArtwork();
        void deativateArtwork();
        //Eventos
        void exploreEvents() throws IOException;
        void addShow(Evento evento) throws IOException;
        void updateShow();
        void removeShow();
        //Galerista
        void addGalerist(Galerista galerista);
        void updateGalerist();
        void removeGalerist();
        //Galeria
        void addGallery();
        void updateGallery();
        void removeGallery();
        //Admin
        void importDataFromArtsy();
        void deleteArtsyData();

        //View do's MenusActions
        void doArtistDetails(Artista artista);
        void doArtworkDetails(Obra_Arte obraArte) throws IOException;


        void doAddArtwork();
        void doAddArtist();
        void doAddShow();
    }

    interface Model {
        List<Artista> getArtists() throws IOException;
        Artista getArtistById(int idArtista) throws IOException;
        void addArtist(Artista artista) throws IOException;
        //ObraArte
        List<Obra_Arte> getArtworks() throws IOException;
        void addArtwork(Obra_Arte obraArte) throws IOException;
        //Eventos
        List<Evento> getEvents() throws IOException;
        void addShow(Evento evento) throws IOException;
        //Galerias
        List<Galeria> getGalleries() throws IOException;
        Galeria getGalleryById(int galleryId) throws IOException;
        //Galeristas
        List<Galerista> getGallerists() throws IOException;
        void addGalerist(Galerista galerista);

        //Foreign keys tables Obra ARte
        List<Tecnica> getTechnics() throws IOException;

        Tecnica getTechniqueById(int idTecnica) throws IOException;

        List<Movimento> getMovement() throws IOException;

        Movimento getMovementById(int idMovimento) throws IOException;


        List<Materiais> getMaterials() throws IOException;
        Materiais getMaterialById(int idMaterial) throws IOException;
        //Utils
        List<Pais> getPaises() throws IOException;
    }
}

