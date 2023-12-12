package presenter;

// Presenter (no pacote presenter)

import model.*;

import java.io.IOException;
import java.util.List;

public class ExplorArtPresenter implements ExplorArtContract.Presenter {

    private final ExplorArtContract.View view;
    private final ExplorArtContract.Model model;

    public ExplorArtPresenter(ExplorArtContract.View view, ExplorArtContract.Model model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void exploreArtists() throws IOException {
        List<Artista> artistas = model.getArtists();
        view.showArtists(artistas);
    }

    @Override
    public void exploreArtworks() throws IOException {
        List<Obra_Arte> obras = model.getArtworks();
        view.showArtworks(obras);
    }

    @Override
    public void exploreEvents() throws IOException {
        List<Evento> eventos = model.getEvents();
        view.showEvents(eventos);
    }

    public void doShowDetails(Evento evento) {
        // Create a new view or dialog to display the details of the Show
        // You need to implement the details view (e.g., ShowDetailsView) accordingly
        int idGaleria = evento.getId_Galeria();
        ExplorArtModel model = new ExplorArtModel();
        Galeria galeria = null;
        try {
            galeria = model.getGalleryById(idGaleria);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        view.showShowsDetails(evento, galeria);
    }

    @Override
    public void manageArtworks() {
        // Lógica para gerenciar obras de arte
    }

    @Override
    public void manageArtists() {
        // Lógica para gerenciar artistas
    }

    @Override
    public void manageEvents() {
        // Lógica para gerenciar eventos
    }

    @Override
    public void manageGalleries() {
        // Lógica para gerenciar galerias
    }

    @Override
    public void manageGallerists() {
        // Lógica para gerenciar galeristas
    }

    @Override
    public void doArtistDetails(Artista artista) {

        view.showArtistDetails(artista);

    }

    @Override
    public void doArtworkDetails(Obra_Arte obraArte) {

        view.showArtworkDetails(obraArte);

    }

}
