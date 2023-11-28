package service;

import model.Artista;
import model.Pais;
import repository.ArtistaRepository;

import java.util.List;

public class ArtistaService {
    private ArtistaRepository artistaRepository;

    public ArtistaService(ArtistaRepository artistaRepository) {
        this.artistaRepository = artistaRepository;
    }

    public List<Artista> getAllArtists (){
        return artistaRepository.getAllArtists();
    }

    public Artista getArtistaById(int artistaId){ return artistaRepository.getArtistaById(artistaId); }

    public Artista addArtista(Artista artista){ return artistaRepository.addArtista(artista);}

    //public Artista updateArtista(int id, Artista artista) { return artistaRepository.updateArtista(id, artista);}

    //public void deleteArtista(int id) {artistaRepository.deleteArtista(id);}
}
