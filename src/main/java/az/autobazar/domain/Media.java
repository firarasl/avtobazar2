package az.autobazar.domain;

import java.io.InputStream;
import java.io.Serializable;
import java.util.Objects;

public class Media extends AutoBazarBase implements Serializable {
    private static final long serialVersionUID = 1035286219626083739L;

    private long autoId;
    private String originalFileName;
    private String fileName;
    private boolean main;
    private boolean video;
    private boolean mobile;
    private String contentType;
    private long length;
    private InputStream inputStream;

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public String toString() {
        return "Media{" +
                "autoId=" + autoId +
                ", originalFileName='" + originalFileName + '\'' +
                ", fileName='" + fileName + '\'' +
                ", main=" + main +
                ", video=" + video +
                ", mobile=" + mobile +
                ", contentType='" + contentType + '\'' +
                ", length=" + length +
                ", id=" + id +
                ", insertDate=" + insertDate +
                ", lastUpdate=" + lastUpdate +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Media media = (Media) o;
        return autoId == media.autoId &&
                main == media.main &&
                video == media.video &&
                mobile == media.mobile &&
                length == media.length &&
                originalFileName.equals(media.originalFileName) &&
                fileName.equals(media.fileName) &&
                contentType.equals(media.contentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoId, originalFileName, fileName, main, video, mobile, contentType, length);
    }

    public long getAutoId() {
        return autoId;
    }

    public void setAutoId(long autoId) {
        this.autoId = autoId;
    }

    public String getOriginalFileName() {
        return originalFileName;
    }

    public void setOriginalFileName(String originalFileName) {
        this.originalFileName = originalFileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public boolean isMain() {
        return main;
    }

    public void setMain(boolean main) {
        this.main = main;
    }

    public boolean isVideo() {
        return video;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }

    public boolean isMobile() {
        return mobile;
    }

    public void setMobile(boolean mobile) {
        this.mobile = mobile;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }
}
