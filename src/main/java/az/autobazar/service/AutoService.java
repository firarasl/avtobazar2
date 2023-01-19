package az.autobazar.service;

import az.autobazar.domain.DataTableResult;
import az.autobazar.domain.Media;

import java.util.List;
import java.util.Optional;

public interface AutoService {

    DataTableResult getAutoList(int draw, int start, int length);

    void addMedia(Media media);

    Optional<Media> getMediaById(long id);

    List<Media> getMediaList(long autoId);
}
