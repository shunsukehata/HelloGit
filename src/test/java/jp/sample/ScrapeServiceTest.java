package jp.sample;

import org.junit.Test;
import java.io.IOException;
import static org.junit.Assert.assertEquals;

public class ScrapeServiceTest {

    @Test
    public void getTitle() throws IOException {
        final ScrapeService scrapeService = new ScrapeService();
        assertEquals("Qiita", scrapeService.getTitle());
    }
}
