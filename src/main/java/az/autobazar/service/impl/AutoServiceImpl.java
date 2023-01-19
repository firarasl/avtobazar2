package az.autobazar.service.impl;

import az.autobazar.domain.Auto;
import az.autobazar.domain.DataTableResult;
import az.autobazar.domain.Media;
import az.autobazar.repository.AutoRepository;
import az.autobazar.service.AutoService;
import az.autobazar.util.FileUtility;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

public class AutoServiceImpl implements AutoService {

    private static final Logger logger = Logger.getLogger(AutoServiceImpl.class.getName());

    private String uploadFolder;
    private AutoRepository repository;

    public AutoServiceImpl(AutoRepository repository, String uploadFolder) {
        this.repository = repository;
        this.uploadFolder = uploadFolder;
    }

    public DataTableResult getAutoList(int draw, int start, int length) {
        DataTableResult dataTableResult = new DataTableResult();

        int autoCount = repository.getAutoCount();

        dataTableResult.setDraw(draw);
        dataTableResult.setRecordsTotal(autoCount);
        dataTableResult.setRecordsFiltered(autoCount);

        List<Auto> list = repository.getAutoList(start, length);
        Object[][] data = new Object[list.size()][8];

        int counter = 0;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm:ss");

        for (Auto auto : list) {
            data[counter][0] = auto.getId();
            data[counter][1] = auto.getPublishDate().format(formatter);
            data[counter][2] = auto.getBrand();
            data[counter][3] = auto.getModel();
            data[counter][4] = auto.getPrice();
            data[counter][5] = auto.getSeller();
            data[counter][6] = auto.getContactNo();
            data[counter][7] = "<a href='cs?action=viewAutoById&id=" + auto.getId() + "'>View Auto Details</a>";
            counter++;
        }

        dataTableResult.setData(data);

        return dataTableResult;
    }

    @Override
    public void addMedia(Media media) {

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");

            // path = /home/student/autobazar2-upload/7/autobazar-7-20190824182157-888899123.jpg
            String newFileName = String.format("%sautobazar-%d-%s-%s%s",
                    uploadFolder + File.separator + media.getAutoId() + File.separator,
                    media.getAutoId(),
                    LocalDateTime.now().format(formatter),
                    LocalDateTime.now().getNano(),
                    FileUtility.getFileExtension(media.getOriginalFileName())
            );

            Path path = Paths.get(newFileName);
            if (!Files.exists(path.getParent())) {
                Files.createDirectory(path.getParent());
            }

            Files.copy(media.getInputStream(), path);
            media.setFileName(newFileName);
            repository.addMedia(media);
        } catch (Exception e) {
            logger.error("Error adding media " + media, e);
            throw new RuntimeException("Error adding media " + media, e);
        }
    }

    @Override
    public Optional<Media> getMediaById(long id) {
        return repository.getMediaById(id);
    }

    @Override
    public List<Media> getMediaList(long autoId) {
        return repository.getMediaList(autoId);
    }
}
