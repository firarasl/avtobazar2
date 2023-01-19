package az.autobazar.repository;

import az.autobazar.domain.Auto;
import az.autobazar.domain.Media;
import az.autobazar.domain.Role;

import java.util.List;
import java.util.Optional;

public interface AutoRepository {

    List<Auto> getAutoList();

    int getAutoCount();

    List<Auto> getAutoList(int start, int length);

    Auto getAutoById(long id);

    List<Auto> getLast12Autos();

    List<Auto> getQuantityOfBrands();

    void addMedia(Media media);

    Optional<Media> getMediaById(long id);

    List<Media> getMediaList(long autoId);

}
