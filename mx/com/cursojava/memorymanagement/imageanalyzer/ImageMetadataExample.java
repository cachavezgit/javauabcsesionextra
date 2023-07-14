package mx.com.cursojava.memorymanagement.imageanalyzer;

public class ImageMetadataExample {
    public static void main(String[] args) {
        try {
            final String url = "/Users/daudm/Desktop/2000x2000px_keepcalm.jpg";
            for (int i = 0; i < 2000; i ++) {
                Metadata metadata = ImageMetadataUtils.getMetadataLocalFile(url);
                System.out.println(String.format("Count %d URL: %s, metadata: %s", i, url, metadata.toString()));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
