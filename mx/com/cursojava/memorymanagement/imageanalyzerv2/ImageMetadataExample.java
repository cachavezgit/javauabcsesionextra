package mx.com.cursojava.memorymanagement.imageanalyzerv2;


import mx.com.cursojava.memorymanagement.imageanalyzerv2.ImageMetadataUtils;

public class ImageMetadataExample {
    public static void main(String[] args) {
        try {
            final String url = "C:\\Users\\cacha\\Downloads\\highresimg1.jpg";
            for (int i = 0; i < 2000; i ++) {
                Metadata metadata = ImageMetadataUtils.getMetadata(url);
                System.out.println(String.format("Count %d URL: %s, metadata: %s", i, url, metadata.toString()));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
