package mx.com.cursojava.memorymanagement.imageanalyzer;

import java.io.File;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ImageMetadataUtils {
    public static Metadata getMetadataLocalFile(String url) {
        try {
            final File outputFile = new File(url);
            final BufferedImage buf = ImageIO.read(outputFile);
            final int width = buf.getWidth();
            final int height = buf.getHeight();
            final long fileSize = outputFile.length();
            return new Metadata(url, width, height, fileSize);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(String.format("[ERROR] Get metadata from url %s: %s", url, e.getMessage()));
            return null;
        }
    }
}
